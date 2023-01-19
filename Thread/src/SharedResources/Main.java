package SharedResources;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Adder ad1 = new Adder(4);
        Adder ad2 = new Adder(10);
        System.out.println( "Before :" +Adder.shared_data);
        ad1.start();
        ad2.start();
        Thread.sleep(10);
        System.out.println( "After :" +Adder.shared_data);
    }
}
