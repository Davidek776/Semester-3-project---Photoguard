package sep3.project.daos;

import org.springframework.stereotype.Component;
import sep3.project.protobuf.ResponseCreateUser;

import java.sql.SQLException;

@Component
public interface UserPersistence {
    ResponseCreateUser Create(String userName, String firstName, String lastName, String email, String password, String phoneNumber) throws SQLException;
}
