package EX1;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Read {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("donner le mon de fichier a lire : ");
        String nomFichier = sc.nextLine();
        DataInputStream dtn = new DataInputStream(new BufferedInputStream(new  FileInputStream(nomFichier)));
        boolean fin = true;
  /*      while (fin) {
            System.out.println(dtn.readUTF());
            System.out.println(dtn.readUTF());
            System.out.println(dtn.readInt());
            if (!fin) {
                fin = false;
            }
        }*/
String ligne;
        do {
            ligne=dtn.readLine();
            if(ligne != null) System.out.println(ligne);
        }while(ligne != null);
        dtn.close();
        System.out.println("****fin list fichier****");
    }

}
