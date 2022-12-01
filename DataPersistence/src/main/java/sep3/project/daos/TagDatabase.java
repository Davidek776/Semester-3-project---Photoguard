package sep3.project.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.lognet.springboot.grpc.GRpcService;
import sep3.project.persistance.DBConnection;
import sep3.project.protobuf.*;

@GRpcService
public class TagDatabase implements TagPersistence{
    public TagDatabase() {
    }

    @Override
    public ArrayList<PostTagData> GetPostTag(String tagContains, int postId) throws SQLException {
        Connection connection = DBConnection.getConnection();
        ArrayList<PostTagData> tags = new ArrayList<>();
        try {
            // get tags by post id only
            if (postId!=0 && tagContains.equals("")) {
                ResultSet resultSet = getPostTagById(connection, postId);
                while (resultSet.next()) {
                    tags.add(createPostTagFromQuery(resultSet));
                }
            }
            // get tags by tag contains only
            else if (postId==0 && !tagContains.equals("")) {
                ResultSet resultSet = getPostTagByTagContains(connection, tagContains);
                while (resultSet.next()) {
                    tags.add(createPostTagFromQuery(resultSet));
                }
            }
            // get tags by post and tag contains
            else if (postId!=0 && !tagContains.equals("")) {
                ResultSet resultSet = getPostTagByIdAndTagContains(connection, postId, tagContains);
                while (resultSet.next()) {
                    tags.add(createPostTagFromQuery(resultSet));
                }
            }
            //get all
            else {
                ResultSet resultSet = getAllPostTag(connection);
                while (resultSet.next()) {
                    tags.add(createPostTagFromQuery(resultSet));
                }
            }
        }
        catch (Exception e) {
            throw new SQLException(e);
        }
        finally {
            connection.close();
        }

        return tags;
    }

    private ResultSet getPostTagById(Connection connection, int postId) {
        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement(
                    "SELECT * FROM \"post_tag\" WHERE post_id = ?");

            statement.setInt(1, postId);
            return statement.executeQuery();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private ResultSet getPostTagByTagContains(Connection connection,  String tagContains) {
        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement(
                    "SELECT * FROM \"post_tag\" WHERE lower(tag_name) LIKE '%' || ? || '%'");

            statement.setString(1, tagContains);
            return statement.executeQuery();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private ResultSet getPostTagByIdAndTagContains(Connection connection, int postId, String tagContains) {
        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement(
                    "SELECT * FROM \"post_tag\" WHERE post_id = ? AND lower(tag_name) LIKE '%' || ? || '%'");
            statement.setInt(1, postId);
            statement.setString(2, tagContains);
            return statement.executeQuery();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private ResultSet getAllPostTag(Connection connection) {
        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement("SELECT * FROM post_tag");

            return statement.executeQuery();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private PostTagData createPostTagFromQuery(ResultSet resultSet) throws SQLException {
        return PostTagData.newBuilder()
                .setPostId(resultSet.getInt("post_id"))
                .setTagContains(resultSet.getString("tag_name"))
                .build();
    }

    @Override
    public ArrayList<TagListData> GetTagList(String tagContains) throws SQLException {
        Connection connection = DBConnection.getConnection();
        ArrayList<TagListData> tags = new ArrayList<>();
        try {
            // get posts by title only
            if (!tagContains.equals("")) {
                ResultSet resultSet = getTagListByTagContains(connection, tagContains);
                while (resultSet.next()) {
                    tags.add(createTagListFromQuery(resultSet));
                }
            }
            // get all posts
            else {
                ResultSet resultSet = getAllTagList(connection);
                while (resultSet.next()) {
                    tags.add(createTagListFromQuery(resultSet));
                }
            }
        }
        catch (Exception e) {
            throw new SQLException(e);
        }
        finally {
            connection.close();
        }

        return tags;
    }
    private ResultSet getAllTagList(Connection connection) {
        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement("SELECT * FROM tag_list");

            return statement.executeQuery();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private ResultSet getTagListByTagContains(Connection connection, String tagContains) {
        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement(
                    "SELECT * FROM \"tag_list\" WHERE lower(tag_name) LIKE '%' || ? || '%'");

            statement.setString(1, tagContains);
            return statement.executeQuery();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private TagListData createTagListFromQuery(ResultSet resultSet) throws SQLException {
        return TagListData.newBuilder()
                .setTagContains(resultSet.getString("tag_name"))
                .build();
    }
}
