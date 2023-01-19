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

    public String getPrenom() { return prenom;}
    public String getTitre() { return titre;}
    public int getId() { return id;}
    public String getNom() {return nom;}
    public String ToString(){
        return "client{"+getId() +"\t"+getTitre() +"\t"+getNom()+"\t"+getPrenom() +"}";
    }

}
