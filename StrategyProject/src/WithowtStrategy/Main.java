package WithowtStrategy;

public class Main {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService(112 , true, 20);
        System.out.println("creditCard methode*****");
        ps.processOrder("creditCard");
        System.out.println("paypal methode *******");
        ps.processOrder("PayPal");
    }
}

