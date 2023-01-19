
import java.util.Date;

public class Rendez {
    private int id ;
    private Date jour ;
    private int id_Client;
    private int id_Creneau;

    public Rendez(int id, Date jour, int id_Client, int id_Creneau) {
        this.id = id;
        this.jour = jour;
        this.id_Client = id_Client;
        this.id_Creneau = id_Creneau;
    }

    public int getId() {return id;}
    public Date getJour() {return jour;}
    public int getId_Client() {return id_Client;}
    public int getId_Creneau() {return id_Creneau;}

    public String ToString(){
        return "Rendez Vous{"+getId() +"\t"+getJour() +"\t"+getId_Client()+"\t"+getId_Creneau() +"}";
    }
}
