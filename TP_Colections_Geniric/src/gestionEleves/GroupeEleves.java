package gestionEleves;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GroupeEleves {
    private ArrayList<Eleve> listeEleves = new ArrayList<>();

    public int nombre(){return listeEleves.size();}

    public ArrayList<Eleve> getListe(){ return this.listeEleves;}

    public void ajouterEleve(Eleve eleve){ listeEleves.add(eleve);}

    public Eleve chercher(String nom) {
        for (Eleve eleve : listeEleves) {
            if (eleve.getNom().equals(nom)) {
                return eleve;
            }
        }
        return null;
    }

    public void lister() {
        for (Eleve eleve : listeEleves) {
            System.out.println(eleve.toString());
        }
    }

    public Eleve meilleurEleve() {
        Eleve eleve = Collections.max(listeEleves);
        return eleve;
    }

    public ArrayList<Eleve> trierEleves() {
        Collections.sort(listeEleves, Comparator.comparingDouble(Eleve::getMoyenne));
        return listeEleves;
    }

}
