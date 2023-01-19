package Sérialisation;

import java.io.*;

public class testSerialisation {
    public static void main(String[] args) throws IOException {
       Person P  = new Person("Ali" , 12);
        FileOutputStream fs = new FileOutputStream("data.serial");
        ObjectOutputStream os = new ObjectOutputStream(fs);
        try {
            os.writeObject(P);
            System.out.println("Done !");
            System.out.println(P);
            os.flush();
            //System.out.println("");
        }catch(IOException e){
            System.out.println("there is an error some where !");
        }finally {
            os.close();
        }
    }
}
