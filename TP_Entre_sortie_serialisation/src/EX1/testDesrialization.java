package EX1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class testDesrialization {
    public static void main(String[] args) throws IOException {
        FileInputStream fs = new FileInputStream("personne.serial");
        ObjectInputStream os = new ObjectInputStream(fs);
        Personne[] o  = new Personne[4];
        try{
            o = (Personne[]) os.readObject();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally{
            if(o != null){
                for (int i = 0; i <o.length ; i++) {
                    System.out.println(o[i].ToString());
                }
                System.out.println("done !");
                fs.close();
                os.close();
            }
        }

    }
}
