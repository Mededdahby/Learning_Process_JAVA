package WithStrategy;

public class Main {
    public static void main(String[] args) {

        PaymentService shoppingCart = new PaymentService();

        // Pay with card
        Card card = new Card("1234-5678-9101-1121", "28/24","12/25");
        shoppingCart.setPaymentStrategy( new CreditCard(card));
        shoppingCart.checkout(100);

        // Pay with PayPal
        shoppingCart.setPaymentStrategy( new PayPal("test@test.com", "password"));
        shoppingCart.checkout(50);
    }
}
