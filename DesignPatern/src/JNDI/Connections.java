package JNDI;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connections {
    private static Connection conn;
    static  {
        try {
            //TODO: JNDI
           /* Context context = new InitialContext();
            DataSource dataSource = (dataSource) context.lookup("com.mysql.cj.jdbc.Driver");
            conn = dataSource.getConnection("jdbc:mysql://localhost/Cabinier","root", ""));*/

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
