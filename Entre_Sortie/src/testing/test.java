package testing;

import java.io.FileNotFoundException;

public class test {
    public static void main(String[] args) {
      /*  binierStream bn = new binierStream();
        //bn.writeData("text");
        try {
            bn.reaData("text");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        */

     /*   TextManipulation tx = new TextManipulation();
        String fileName = "info.txt";
        //tx.writeText(fileName);
        tx.readText(fileName);*/

        Cat cat = new Cat(3 , "mona");
        CatSerialization  cts =new CatSerialization();
        cts.catSer("cats", cat);
       Cat ct = null;
   ct=  cts.catDesr("cats");
        System.out.println(   ct.ToString());

    }
}
