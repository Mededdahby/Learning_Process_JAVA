package inputOutput_Strem;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class readOutputFile {
    public static void main(String[] args) throws IOException {
        int n=0;
        DataInputStream  read =
                new DataInputStream(new FileInputStream("data.txt"));
        System.out.println("this is the data inside of data.txt file");

        boolean eof = false;
        while(!eof){
            try {
                n = read.readInt();
            }catch(IOException e){
                eof = true;
            }
            if(!eof){
                System.out.println(n);
            }
        }
        read.close();
        System.out.println("this is the end !");
    }
}

