package WithowtStrategy;

public class All {




    private int cost ;
    private boolean includeDelivery ;
    private int deliveryPris ;

    public All(int cost, boolean includeDelivery, int deliveryPris) {
        this.cost = cost;
        this.includeDelivery = includeDelivery;
        this.deliveryPris = deliveryPris;
    }

    public All(int cost) {
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
    public void processOrder(String method) {
        if (method.equals("creditCard")) {
            CreditCard card = new CreditCard("2143653245762109", "02/24", "123");
            System.out.println("amount before: " + card.getAmount());
            System.out.println("Paying amount: " + getTotal());
            card.setAmount(card.getAmount() - getTotal());
            System.out.println("amount after: " + card.getAmount());
        } else if (method.equals("PayPal")) {
            System.out.println("Username : ************");
            System.out.println("password : ************");
            System.out.println("Paying amount: " + getTotal());
        } else if (method.equals("NFC")) {
            System.out.println("Performing NFC payment");
            System.out.println("Paying amount: " + getTotal());
        } else if (method.equals("Crypto")) {
            System.out.println("Performing Crypto payment");
            System.out.println("Paying amount: " + getTotal());
        } else if (method.equals("Method4")) {
            System.out.println("Performing Method4 payment");
            System.out.println("Paying amount: " + getTotal());
        } else {
            System.out.println("Invalid payment method");
        }
    }

}
