package EX3;

import java.io.*;
import java.util.Scanner;

public class SerialSalle {

    public  void saveSalleToSerialFile(Sale saleObject, String fileName) throws IOException {
    try {
        FileOutputStream fs = new FileOutputStream(fileName+".serial");
        ObjectOutputStream obo = new ObjectOutputStream(fs);
        try {
            obo.writeObject(saleObject);
            obo.flush();
        }finally {
            fs.close();
            obo.close();
            System.out.println("Done !");
        }
    }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public  Sale getRealisateurToSerialFile(String fileName) throws IOException {
        Sale objectt = null;
    try {
        FileInputStream fsi = new FileInputStream(fileName+".serial");
        ObjectInputStream obi = new ObjectInputStream(fsi);

        try {
            objectt = (Sale) obi.readObject();
        }finally {
            try {
                obi.close();

            }finally {
                fsi.close();
            }
        }
    }catch (ClassNotFoundException e) {
            System.out.println("This class name doesn't exist !");
    }catch (IOException ee){
            System.out.println("There is an error some where ! ");
        }finally {
            return  objectt;
    }
    }



}
