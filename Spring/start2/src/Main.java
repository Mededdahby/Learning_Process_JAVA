import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        IOHelper output = (IOHelper) context.getBean("iOHelper");
        output.setOutputGenerator(new JsonGenerator());

        output.generateOutput();
    }
}