package gestionEleves;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Eleve a = new Eleve("hali");
        a.ajouterNote(17);
        a.ajouterNote(13);
        a.ajouterNote(15);

        Eleve b = new Eleve("sami");
        b.ajouterNote(17);
        b.ajouterNote(19);
        b.ajouterNote(19);

        Eleve c = new Eleve("amid");
        c.ajouterNote(12);
        c.ajouterNote(1);
        c.ajouterNote(19);

        Eleve x = new Eleve("medo");
       System.out.println("les info : " +a.toString());
        System.out.println( "Moyenne  : " +x.getMoyenne());
        System.out.println(a.compareTo(x));
        System.out.println();
        System.out.println();
      GroupeEleves stud = new GroupeEleves();
        stud.ajouterEleve(a);
        stud.ajouterEleve(b);
        stud.ajouterEleve(c);
        stud.ajouterEleve(x);
       System.out.println(" Nombre des eleves est : \n " +stud.nombre());
        System.out.println(" la liste des eleve est : \n" + stud.getListe());
        System.out.println(stud.chercher("Mahdi"));
        System.out.println("this is the best ever : \n" +stud.meilleurEleve());
        System.out.println("trier : \n"+stud.trierEleves());
        stud.lister();



    }

}
