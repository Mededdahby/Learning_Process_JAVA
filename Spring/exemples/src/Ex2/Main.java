package Ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        shape circle = (shape) context.getBean("circle");
        System.out.println("circle Area: " + circle.calculiArea());

        shape square = (shape) context.getBean("square");
        System.out.println("Square Area : "+ square.calculiArea());
    }
}
