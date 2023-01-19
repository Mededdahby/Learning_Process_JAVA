package ClassAnonym;

public class Compte {
    public static void main(String[] args) {
        Thread t =  new Thread(){
            //t est un objet de sous class anonym qui herity de la class thread
            @Override
            public void run() {
                //super.run();
                System.out.println("a process is running ...!");
            }
        };
        t.start();
    }
}