
public class Creneaux {
    private int id;
    private  int version;
    private int hDebut;
    private int mDebut;
    private int hFin;
    private int mFin;
    private int id_Medecin;

    public Creneaux(int id , int version , int hd , int md , int hf , int mf , int id_m){
        this.id =id ;
        this.version=version;
        hDebut=hd;
        mDebut=md;
        hFin=hf;
        mFin=mf;
        id_Medecin = id_m;
    }

    public int getId() {
        return id;
    }

    public int gethFin() { return hFin;}
    public int gethDebut() { return hDebut;}
    public int getId_Medecin() {return id_Medecin;}
    public int getmDebut() { return mDebut;}
    public int getVersion() { return version;}
    public int getmFin() {  return mFin;}

    public String ToString(){
        return "Creneaux{"+getVersion() +"\t"+gethDebut() +"\t"+getmDebut()+"\t"+gethFin() +"\t"+getmFin()+"}";
    }
}
