package EX1;

import java.io.*;
import java.util.Scanner;

public class ReadUTF {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("donner le mon de fichier a lire : ");
        String nomFichier = sc.nextLine();
        DataInputStream dtn = new DataInputStream(new BufferedInputStream(new FileInputStream(nomFichier)));
        boolean end = false ;
        String n = "";
        while (!end){
            try{
                n = dtn.readUTF () ;
            }catch (EOFException e){
                end = true ;
            }
            if (!end) System.out.println(n) ;
        }
        dtn.close () ;
    }
}
