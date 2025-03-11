import payment.*;

public class Main {
    public static void main(String[] args) {
        // Create customers
        Customer regularCustomer = new RegularCustomer("Ali Gholami");
        Customer premiumCustomer = new PremiumCustomer("Abolfazl Miraki");
        Customer premiumCustomer2 = new PremiumCustomer("Reza Dashti");

        // Create payment strategies
        PaymentStrategy creditCard = new CreditCardPayment("5859-8318-2304-3491", "Ali Gholami");
        PaymentStrategy paypal = new PayPalPayment("ali.glm484@gamil.com");
        PaymentStrategy bitcoin = new BitcoinPayment("1FfmbHfnpaZjKFvyi1okTjJJusN455paPH");

        // Display customer info
        regularCustomer.displayCustomerInfo();
        premiumCustomer.displayCustomerInfo();
        premiumCustomer2.displayCustomerInfo();

        // Process payments
        regularCustomer.makePayment(creditCard, 10000);
        regularCustomer.makePayment(paypal, 5000);

        premiumCustomer.makePayment(bitcoin, 320000);
        premiumCustomer.makePayment(paypal, 120000);

        premiumCustomer2.makePayment(bitcoin, 900000);
        premiumCustomer2.makePayment(creditCard, 700000);

        // Show payment history
        regularCustomer.showPaymentHistory();
        premiumCustomer.showPaymentHistory();
        premiumCustomer2.showPaymentHistory();
    }
}