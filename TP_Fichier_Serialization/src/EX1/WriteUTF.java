package EX1;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteUTF {
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
            dto.writeUTF(nom);
            System.out.print("Prenom : ");
            String prenom = sc.nextLine();
            dto.writeUTF(prenom);
            System.out.print("annee de naissance : ");
            int age =  sc.nextInt();
            dto.writeInt(age);
            sc.nextLine();
        }
        dto.close();
        System.out.println("***** fin creation fichier ****");
    }
}
