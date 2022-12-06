package sep3.project.daos.impl;

import org.lognet.springboot.grpc.GRpcService;
import sep3.project.daos.interfaces.PostPersistence;
import sep3.project.persistance.DBConnection;
import sep3.project.protobuf.PostData;
import sep3.project.protobuf.ResponseGetUsers;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;

@GRpcService
public class PostDatabase implements PostPersistence {
	public PostDatabase()
	{

	}

	@Override
	public int createPost(String title, long userId, String description, String imageUrl, int locationId) throws SQLException {
		Connection connection = DBConnection.getConnection();
		int id = 0;

		System.out.println(locationId);
		try {
			PreparedStatement statement = connection.prepareStatement("" +
					"INSERT INTO post(title, user_id, description, image_url, location_id) VALUES(?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

			statement.setString(1, title);
			statement.setLong(2, userId);
			statement.setString(3, description);
			statement.setString(4, imageUrl);
			statement.setInt(5, locationId);

			statement.execute();

			// Getting newly created post ID
			ResultSet rs = statement.getGeneratedKeys();
			if (rs.next()) {
				id = rs.getInt("id");
			}

		}
		finally {
			connection.close();
		}

		return id;
	}

	@Override
	public void deletePost(long id) throws SQLException {
		Connection connection = DBConnection.getConnection();

		try
		{
			PreparedStatement statement = connection.prepareStatement(
					"DELETE FROM post " +
							"WHERE id = ?"
			);
			statement.setLong(1, id);
			statement.execute();
		}
		finally {
			connection.close();
		}
	}

	@Override
	public ArrayList<PostData> getPost(long id, long userId, String titleContains) throws SQLException {
		Connection connection = DBConnection.getConnection();
		ArrayList<PostData> posts = new ArrayList<>();
		ResponseGetUsers response = null;
		try {
			// get posts by id only
			if (id!=0 && titleContains.equals("") && userId==0) {
				ResultSet resultSet = getById(connection, id);
				while (resultSet.next()) {
					posts.add(createPostFromQuery(resultSet));
				}
			}
			// get posts by userid only
			if (id==0 && titleContains.equals("") && userId!=0) {
				ResultSet resultSet = getByUserId(connection, userId);
				while (resultSet.next()) {
					posts.add(createPostFromQuery(resultSet));
				}
			}
			// get posts by title only
			else if (id==0 && userId==0&& !titleContains.equals("")) {
				ResultSet resultSet = getByTitle(connection, titleContains);
				while (resultSet.next()) {
					posts.add(createPostFromQuery(resultSet));
				}
			}
			// get all posts
			else if(userId==0 && titleContains.equals("") && id==0)
			{
				ResultSet resultSet = getAll(connection);
				while (resultSet.next()) {
					posts.add(createPostFromQuery(resultSet));
				}
			}
			// get posts by both id and title
			else if(userId==0 && id!=0 && !titleContains.equals("")) {
				ResultSet resultSet = getByIdAndTitle(connection, id, titleContains);
				while (resultSet.next()) {
					posts.add(createPostFromQuery(resultSet));
				}
			}
			// get posts by both userid and title
			else if(userId!=0 && id==0 && !titleContains.equals("")) {
				ResultSet resultSet = getByUserIdAndTitle(connection, userId, titleContains);
				while (resultSet.next()) {
					posts.add(createPostFromQuery(resultSet));
				}
			}
			// get by all 3 parameters
			else if(userId!=0&&id!=0&&!titleContains.equals("")){
				ResultSet resultSet = getByAllParameters(connection,id, userId, titleContains);
				while (resultSet.next()) {
					posts.add(createPostFromQuery(resultSet));
				}
			}
			//get posts by user id and post id
			else {
				ResultSet resultSet = getByByUserIdAndPostId(connection, userId, id);
				while (resultSet.next()) {
					posts.add(createPostFromQuery(resultSet));
				}
			}
		}
		catch (Exception e) {
			throw new SQLException(e);
		}
		finally {
			connection.close();
		}

		return posts;
	}

	private ResultSet getAll(Connection connection) {
		PreparedStatement statement = null;

		try {
			statement = connection.prepareStatement("SELECT * FROM post");

			return statement.executeQuery();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	private ResultSet getByTitle(Connection connection, String titleContains) {
		PreparedStatement statement = null;

		try {
			statement = connection.prepareStatement(
					"SELECT * FROM \"post\" WHERE lower(title) LIKE '%' || ? || '%'");

			statement.setString(1, titleContains);
			return statement.executeQuery();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	private ResultSet getById(Connection connection, long id) {
		PreparedStatement statement = null;

		try {
			statement = connection.prepareStatement(
					"SELECT * FROM \"post\" WHERE id = ?");

			statement.setLong(1, id);
			return statement.executeQuery();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	private ResultSet getByUserId(Connection connection, long userId) {
		PreparedStatement statement = null;

		try {
			statement = connection.prepareStatement(
					"SELECT * FROM \"post\" WHERE user_id = ?");

			statement.setLong(1, userId);
			return statement.executeQuery();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	private ResultSet getByByUserIdAndPostId(Connection connection, long userId, long id) {
		PreparedStatement statement = null;

		try {
			statement = connection.prepareStatement(
					"SELECT * FROM \"post\" WHERE user_id = ? AND id=?");
			statement.setLong(1, userId);
			statement.setLong(2, id);
			return statement.executeQuery();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	private ResultSet getByUserIdAndTitle(Connection connection, long userId, String titleContains) {
		PreparedStatement statement = null;

		try {
			statement = connection.prepareStatement(
					"SELECT * FROM \"post\" WHERE user_id = ? AND lower(title) LIKE '%' || ? || '%'");
			statement.setLong(1, userId);
			statement.setString(2, titleContains);
			return statement.executeQuery();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	private ResultSet getByIdAndTitle(Connection connection, long id, String title) {
		PreparedStatement statement = null;

		try {
			statement = connection.prepareStatement(
					"SELECT * FROM \"post\" WHERE id = ? AND lower(title) LIKE '%' || ? || '%'");
			statement.setLong(1, id);
			statement.setString(2, title);
			return statement.executeQuery();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	private ResultSet getByAllParameters(Connection connection, long id, long userId, String title)
	{
		PreparedStatement statement = null;

		try {
			statement = connection.prepareStatement(
					"SELECT * FROM \"post\" WHERE id = ? AND lower(title) LIKE '%' || ? || '%' AND user_id = ?");
			statement.setLong(1, id);
			statement.setString(2, title);
			statement.setLong(3, userId);
			return statement.executeQuery();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	private PostData createPostFromQuery(ResultSet resultSet) throws SQLException {
		return PostData.newBuilder()
				.setId(resultSet.getLong("id"))
				.setUserId(resultSet.getLong("user_id"))
				.setDescription(resultSet.getString("description"))
				.setTitle(resultSet.getString("title"))
				.setImgUrl(resultSet.getString("image_url"))
				.setLocationId(resultSet.getInt("location_id"))
				.setPostedOnMilliseconds(resultSet.getTimestamp("posted_on").getTime())
				.build();
	}
}
