package EX1;

import java.io.*;
import java.util.Scanner;

public class testSerialization {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donnez le nombre de personne : ");
        int n  = sc.nextInt();
        Personne[] p = new Personne[n];
        Personne v = new Personne();
        for (int i = 0; i <p.length ; i++) {
            System.out.print("nom : ");
            v.setNom(sc.nextLine());
            System.out.print("Prenom : ");
            v.setPrenom(sc.nextLine());
            System.out.print("Date : ");
            v.setDateNaissance(sc.nextInt());
            p[i]=v;
        }
        FileOutputStream fs = new FileOutputStream("personne.serial");
        ObjectOutputStream obs = new ObjectOutputStream(fs);
        try{
            obs.writeObject(p);
        } finally {
            fs.close();
            obs.close();
            System.out.println("Done !");
        }
    }
}
