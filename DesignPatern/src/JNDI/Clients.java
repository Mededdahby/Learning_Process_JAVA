package JNDI;

import java.io.Serializable;

public class Clients  implements Serializable {
    
    private int id;
    private String titre ;
    private String nom;
    private String prenom;

    public Clients(int anInt, String string, String rsString, String s){
        id = anInt;
        titre = string;
        nom = rsString;
        prenom= s;
    }

    public Clients(){

    }
    public String getPrenom() { return prenom;}
    public String getTitre() { return titre;}
    public int getId() { return id;}
    public String getNom() {return nom;}

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String ToString(){
        return "client{\t"+getId() +"\t"+getTitre() +"\t"+getNom()+"\t"+getPrenom() +"\t}";
    }

}
