public class Main {
    public static void main(String[] args) {
        Calcul1M cl = new Calcul1M(1, 500000);
        Calcul1M c2 = new Calcul1M(500001, 1000000);
        cl.start();
        c2.start();

        try {
            cl.join();
            c2.join();
        } catch (InterruptedException e) {
            System.out.println("error! ! ! !");
        }

        System.out.println( c2.getSum()+cl.getSum());
    }
}
