package DAO;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        imp1 mp = new imp1();
        Personne p = new Personne("MAx", "Martin", 3);
        List<Personne> lp =null;
        try {
          // mp.addPersonne(p);
            lp = mp.getPersonnes();
            System.out.println("these are users in DB");
            System.out.println( "ID__Nom__Prenom__" );
            for (Personne  l: lp){
                System.out.println(l.getNum() +" " + l.getNom()+ " "+l.getPrenom());
            }
           /* Personne x = null;
            x= mp.getPersonne(12);
            System.out.println(x.getNom());*/
            mp.updatePersonne(p ,3);

            //mp.deletePersonne(9);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
