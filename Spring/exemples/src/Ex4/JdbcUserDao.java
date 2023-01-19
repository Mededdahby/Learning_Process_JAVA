package Ex4;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcUserDao implements  UserDAO{
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
    }
    @Override
    public void save(User user) throws SQLException {
        String query = "insert into users (username , email) values (?, ?)";
        try (Connection conn = dataSource.getConnection()) {
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, user.getUsername());
            pr.setString(2, user.getEmail());
            pr.executeUpdate();
            System.out.println("done ! ");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public User findById(long id) {
        User user = null;
        String query = "select * from users where id=?";
        try (Connection conn = dataSource.getConnection()) {
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setInt(1, (int) id);
           ResultSet rs =  pr.executeQuery();
           rs.next();
      if(rs != null){
          user = new User(rs.getLong(1), rs.getString(2), rs.getString(3));
      }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public List<User> FindAll() {
        User user = null;
        List<User> list = new ArrayList<>();
        String query = "select * from users";
        try (Connection conn = dataSource.getConnection()) {
            PreparedStatement pr = conn.prepareStatement(query);
            ResultSet rs =  pr.executeQuery();
            rs.next();
          while (rs.next()){
                user = new User(rs.getLong(1), rs.getString(2), rs.getString(3));
                list.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void update(User user) {
        String query = "  update users  set username=? , email=? where id =?";
        try (Connection conn = dataSource.getConnection()) {
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, user.getUsername());
            pr.setString(2, user.getEmail());
            pr.setInt(3,(int) user.getId());
            pr.executeUpdate();
            System.out.println("done updating ! ");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(long id) {
        String query = " delete from users  where id =?";
        try (Connection conn = dataSource.getConnection()) {
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setInt(1,(int) id);
            pr.executeUpdate();
            System.out.println("done deleting ! ");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
