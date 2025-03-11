import payment.*;

public class Main {
    public static void main(String[] args) {
        // Create customers
        Customer regularCustomer = new RegularCustomer("Ali Gholami");
        Customer premiumCustomer = new PremiumCustomer("Abolfazl Miraki");

        // Create payment strategies
        PaymentStrategy creditCard = new CreditCardPayment("5859-8318-2304-3491", "Ali Gholami");
        PaymentStrategy creditCard2 = new CreditCardPayment("6037-7318-3559-0487", "Abolfazl Miraki");
        PaymentStrategy paypal = new PayPalPayment("ali.glm484@gamil.com");
        PaymentStrategy bitcoin = new BitcoinPayment("1FfmbHfnpaZjKFvyi1okTjJJusN455paPH");

        // Display customer info
        regularCustomer.displayCustomerInfo();
        premiumCustomer.displayCustomerInfo();

        // Process payments
        regularCustomer.makePayment(creditCard, 150000);
        regularCustomer.makePayment(paypal, 75000);

        premiumCustomer.makePayment(bitcoin, 300000);
        premiumCustomer.makePayment(creditCard2, 200000);

        // Show payment history
        regularCustomer.showPaymentHistory();
        premiumCustomer.showPaymentHistory();
    }
}