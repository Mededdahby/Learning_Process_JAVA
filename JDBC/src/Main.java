import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("con.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:musql://localhost/test","root", "");
            Statement statement = connection.createStatement();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}