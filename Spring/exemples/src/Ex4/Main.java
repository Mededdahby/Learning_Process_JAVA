package Ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("UserConfig.xml");
        UserDAO userDAO = (UserDAO) context.getBean("userDAO");
        User user =null;


        User user1 = new User(2, "test", "test@test.com");
        userDAO.save(user1);
List<User> list = userDAO.FindAll();
        user = userDAO.findById(2);
        System.out.println(user.toString());

        for(User e : list){
            System.out.println(e.toString());
        }
    }
}
