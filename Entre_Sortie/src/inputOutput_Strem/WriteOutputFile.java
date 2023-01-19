package inputOutput_Strem;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteOutputFile {
    public static void main(String[] args) throws IOException {
        String fileName ="data.txt";
        int n;
        Scanner N  = new Scanner(System.in);
       // System.out.println("Give a name for a file: ");
        DataOutputStream data =
                new DataOutputStream((new FileOutputStream(fileName)));
        do{
            System.out.println("give number : ");
            n =N.nextInt();
            if(n!=0) data.writeInt(n);

        }while(n !=0);
        data.close();
        System.out.println("donne !");
    }

}
