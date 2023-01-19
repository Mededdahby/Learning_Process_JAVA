package WithStrategy;

public class CreditCard implements PaymentStrategy{

private  Card card ;

    public  CreditCard(Card cd){
        this.card = cd;
    }

    @Override
    public void pay(int amount  ) {
        //TODO : do something
        System.out.println("Paying " + amount + " using Credit Card.");
        card.setAmount((card.getAmount()-amount));
    }
}
