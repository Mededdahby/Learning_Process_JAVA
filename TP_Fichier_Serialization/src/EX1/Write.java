package EX1;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Write {
    public static String stringResize(String s){
        if(s.length()<20){
            while (s.length() != 20){
                s+=" ";
            }
        }
        return s;
    }
        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            System.out.print("Donner le nom de fichier et leur extension : ");
            String finchierNom = sc.nextLine();
            DataOutputStream dto = new DataOutputStream(new FileOutputStream( finchierNom));
            System.out.print("Donner nombre des element vous volez insirer : ");
            int n = sc.nextInt();
            sc.nextLine();
            for (int i = 1; i <= n; i++) {
                System.out.print("nom "+i +" : ");
                String nom = sc.nextLine();
                nom=Write.stringResize(nom);
                dto.writeChars(nom);
                System.out.print("Prenom : ");
                String prenom = sc.nextLine();
                prenom=Write.stringResize(prenom);
                dto.writeChars(prenom);

                System.out.print("annee de naissance : ");
                int age =  sc.nextInt();
                sc.nextLine();
                dto.write(age);
            }
            dto.close();
            System.out.println("***** fin creation fichier ****");
        }

}
