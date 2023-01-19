package WithowtStrategy;



public class PaymentService {


    private int cost ;
    private boolean includeDelivery ;
    private int deliveryPris ;

    public PaymentService(int cost, boolean includeDelivery, int deliveryPris) {
        this.cost = cost;
        this.includeDelivery = includeDelivery;
        this.deliveryPris = deliveryPris;
    }

    public PaymentService(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isIncludeDelivery() {
        return includeDelivery;
    }

    public void setIncludeDelivery(boolean includeDelivery) {
        this.includeDelivery = includeDelivery;
    }

    public int getDeliveryPris() {
        return deliveryPris;
    }

    public void setDeliveryPris(int deliveryPris) {
        this.deliveryPris = deliveryPris;
    }

    public int getTotal(){
        if(includeDelivery) return cost+deliveryPris;
        return cost;
    }
    public void processOrder( String methode){
        if(methode == "creditCard" ){
        CreditCard card = new CreditCard("2143653245762109",  "02/24", "123");
        System.out.println("amount before: "+card.getAmount());
        System.out.println("Paying amount :" +getTotal());
        card.setAmount(card.getAmount()-getTotal());
        System.out.println(" amount after: "+card.getAmount());
        
        }else if(methode == "PayPal"){
            System.out.println("Username : ************");
            System.out.println("password : ************");
            System.out.println("Paying amount :" +getTotal());
        }
    }
}

