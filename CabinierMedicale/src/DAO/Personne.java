package DAO;

public class Personne {
    private String nom;
    private String prenom;
    private int num;

    public Personne(String nom , String prenom , int num){
        this.nom = nom;
        this.prenom= prenom;
        this.num = num;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getNum() {
        return num;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
