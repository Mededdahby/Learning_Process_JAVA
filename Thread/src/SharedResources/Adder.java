package SharedResources;
public class Adder extends  Thread{
    static int shared_data =0;
    private int valueAdded ;
     public Adder(int val){
       valueAdded = val;
    }
    @Override
    public void run(){
        int priviousData = shared_data;
        int newTotal = priviousData + valueAdded;
        try{
            sleep(2);
            shared_data = newTotal;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }}
    }