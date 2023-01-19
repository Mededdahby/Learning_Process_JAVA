package Ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BookConfig.xml");
        Library library = (Library) context.getBean("library");
         List<Book> books = library.getBooks();
        for (Book b : books){
            System.out.println(b.getAuthor() + " " +b.getTitle());
        }
    }
}
