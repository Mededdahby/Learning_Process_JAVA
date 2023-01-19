
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connections {
    private static Connection conn;
    static  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/Cabinier","root", "");
        }catch (SQLException e) {
            System.out.println("SQL problems");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not exist");
        }
    }
    public static Connection  getConnection(){
        return conn;
    }
}
