package EX3;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Etudiant e1 = new Etudiant("Mohamed" , "mohamed" , 20);
        Etudiant e2 = new Etudiant("Ali" , "ali" , 20);
        Etudiant e3 = new Etudiant("Mahdi" , "mahdi" , 20);
        Etudiant e4 = new Etudiant("Imane" , "imane" , 20);

        Sale sale = new Sale();
        sale.ajouterEtudiant(e1);
        sale.ajouterEtudiant(e2);
        sale.ajouterEtudiant(e3);
        sale.ajouterEtudiant(e3);
        System.out.print("Donner le nom de fichier : ");
        String fileName = sc.nextLine();
        SerialSalle ss = new SerialSalle();
        System.out.println("************** Serialization *************");
        ss.saveSalleToSerialFile(sale , fileName);
        Sale sale1;
        sale1 =ss.getRealisateurToSerialFile(fileName);
        System.out.println("****************  Aprés Serialization  ****************");
        sale1.affiche();
    }
}
