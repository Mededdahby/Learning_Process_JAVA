package EX3;

import java.io.Serializable;

public class Etudiant implements Serializable {
    private static long serialVersionUID = 21L;

    private String nom;
    private String prenom ;
    private int age ;

    public Etudiant(String nom , String Prenom , int age ){
        this.nom=nom;
        this.prenom=Prenom;
        this.age =age;
    }

    public String getNom() { return nom;}

    public String getPrenom() {return prenom;}

    public int getAge() {return age;}

    public void affiche(){
        System.out.println("Nom :"+nom + "   Prenom :" +prenom+ "    Age : "+age);
    }
}
