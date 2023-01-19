package EX3;

import java.io.Serializable;
import java.util.ArrayList;

public class Sale implements Serializable {
    private static long serialVersionUID = 11L;
ArrayList<Etudiant> etu = new ArrayList<>();

    public void ajouterEtudiant(Etudiant e ){
        etu.add(e);
    }

    public void affiche(){
        for (Etudiant e : etu){
            e.affiche();
        }
    }

}
