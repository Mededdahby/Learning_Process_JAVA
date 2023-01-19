package testing;

import Files.FilesList;

import java.io.*;

public class CatSerialization {
    public void catSer(String filename ,Cat cat ){
        try {
            ObjectOutputStream dt = new ObjectOutputStream(new FileOutputStream(filename+".serial"));
            dt.writeObject(cat);
            System.out.println("done");
            dt.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Cat catDesr(String fileName){
        try {
            ObjectInputStream oj = new ObjectInputStream(new FileInputStream(fileName+".serial"));
            Cat cat = null;
            cat = (Cat)oj.readObject();
            oj.close();
            return cat;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
