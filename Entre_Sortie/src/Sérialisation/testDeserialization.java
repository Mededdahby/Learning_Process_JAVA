package Sérialisation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class testDeserialization {
    public static void main(String[] args) throws IOException {
               Person P = null;
FileInputStream fs = new FileInputStream("data.serial");
ObjectInputStream os = new ObjectInputStream(fs);
        try {
            P= (Person) os.readObject();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }catch (ClassNotFoundException ee){
            System.out.println(ee.getMessage());
        }finally {
            fs.close();
            os.close();
        }
       if(P!= null)
           System.out.println("hello"+ P.ToString());
        System.out.println(P.getAge());

    }
}
