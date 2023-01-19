package ClassAnonym;

public class Compte2 extends Thread{
    int valeur;
    public Compte2(int val){
        valeur = val;
    }

    public void run (){
        try {
            for (;;) {
                System.out.print("valeur [ " +valeur +" ]");
                sleep(100);
            }
        }catch (InterruptedException e) {
            return ;
        }
    }

    public static void main(String[] args) {
        new Compte2(1).start();
        new Compte2(200).start();
    }
}
