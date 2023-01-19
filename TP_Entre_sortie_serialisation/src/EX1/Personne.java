package EX1;

import java.io.Serializable;
import java.util.Date;

public class Personne implements Serializable {
    private static long serialVersionUID = 34L;
    public static  int nombre ;
    private String nom;
    private String prenom;
    private int dateNaissance;

    public Personne(){
        nombre++;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateNaissance(int dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getDateNaissance() {
        return dateNaissance;
    }

    public String ToString(){
        return "nom : "+nom +"\n"+"prenom : "+prenom +"\n"+ "naissance : "+dateNaissance +"\n";
    }
}
