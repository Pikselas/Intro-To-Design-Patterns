package Behavioral.Strategy;

// Strategy interface
interface PaymentStrategy {
    void pay(int amount);
}

// Concrete Strategy 1: Credit Card Payment
class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " dollars using Credit Card (" + cardNumber + ")");
    }
}

// Concrete Strategy 2: PayPal Payment
class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " dollars using PayPal (" + email + ")");
    }
}

// Context
class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(int amount) {
        paymentStrategy.pay(amount);
    }
}

// Client code
public class Strategy {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // Credit Card Payment
        paymentContext.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        paymentContext.processPayment(100);

        // PayPal Payment
        paymentContext.setPaymentStrategy(new PayPalPayment("user@example.com"));
        paymentContext.processPayment(50);
    }
}
