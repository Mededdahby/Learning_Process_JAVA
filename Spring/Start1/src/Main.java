import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {


            Scanner scanner = new Scanner(new File("config.txt"));

            Class<?> iooutput = Class.forName(scanner.next());
            IOutputGenerator output = (IOutputGenerator) iooutput.newInstance();
            Class<?> helper1 = Class.forName(scanner.next());
            IOHelper helper = (IOHelper) helper1.newInstance();

            helper.setOutputGenerator(output);
            helper.generateOutput();
            scanner.close();

        } catch (FileNotFoundException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}