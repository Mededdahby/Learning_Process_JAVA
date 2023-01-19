package WithStrategy;

public class PayPal implements PaymentStrategy {

   private String userName ;
    private String password;

    public PayPal(String userName , String password){
        this.userName = userName;
        this.password = password;
    }
    
    @Override
    public void pay(int amount ) {
        //TODO: do the Authentication
        //check if this user exist and if the password is correct
        System.out.println("Paying : "+ amount + " using PayPal  thank you  : "+userName);
    }
}
