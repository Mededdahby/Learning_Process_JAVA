package SharedResources;
public class AdderSync extends  Thread{
    static int shared_data =0;
    private int valueAdded ;
    public AdderSync(int val){
        valueAdded = val;
    }
    @Override
    public void run() {
        synchronized (this) {
            int priviousData = shared_data;
            int newTotal = priviousData + valueAdded;
            try {
                sleep(2);
                shared_data = newTotal;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        AdderSync ad2 = new AdderSync(10);
        AdderSync ad1 = new AdderSync(4);
        System.out.println( "Before :" +Adder.shared_data);
        ad1.start();
        ad2.start();
        Thread.sleep(10);
        System.out.println( "After :" +Adder.shared_data);
    }
}