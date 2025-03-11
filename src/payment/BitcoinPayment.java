package payment;

public class BitcoinPayment implements PaymentStrategy {
    private String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment " + amount + " Tomans via " + getPaymentDetails());
    }

    @Override
    public String getPaymentDetails() {
        return "Bitcoin - Wallet Address: " + walletAddress;
    }
}