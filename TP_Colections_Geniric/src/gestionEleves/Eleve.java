package gestionEleves;

import java.util.ArrayList;

public class Eleve implements Comparable<Eleve>{
    private String nom;
    private ArrayList<Integer> note = new ArrayList<Integer>();
    private double moyenne;

    public Eleve(String nom) {this.nom = nom;}

    public double getMoyenne() {
        if(note.isEmpty()) moyenne=0;
    else {
            int sum = 0;
            for (int total : note) {
                sum += total;
            }
            this.moyenne = sum / (note.size());
        }
        return this.moyenne;
    }

    public void ajouterNote(int note) { this.note.add(note);}

    public String getNom() {return this.nom;}

    public ArrayList<Integer> getListeNotes() {return this.note;}

    @Override
    public String toString() {
        return "nom : " + nom + '\t'+ "notes : " + note;
    }


    @Override
    public int compareTo(Eleve autreEleve) {
        if(this.moyenne> autreEleve.getMoyenne())return 1;
        if(this.moyenne< autreEleve.getMoyenne())return -1;
        else return 0;
    }
}
