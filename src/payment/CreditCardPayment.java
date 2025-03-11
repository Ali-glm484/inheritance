package payment;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment " + amount + " Tomans via " + getPaymentDetails());
    }

    @Override
    public String getPaymentDetails() {
        return "Credit Card - Cardholder: " + cardHolderName + ", Card Number: " + cardNumber;
    }
}