package Ex4;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {
    void save(User user) throws SQLException;
    User findById(long id);
    List<User> FindAll();
    void update(User user);
    void delete(long id);
}
