// src/AdapterPatternTest.java

public class AdapterPatternTest {
    public static void main(String[] args) {
        // Create instances of the payment gateways
        PayPalGateway payPalGateway = new PayPalGateway();
        StripeGateway stripeGateway = new StripeGateway();
        
        // Create adapters for the payment gateways
        PaymentProcessor payPalProcessor = new PayPalAdapter(payPalGateway);
        PaymentProcessor stripeProcessor = new StripeAdapter(stripeGateway);
        
        // Process payments using different gateways
        payPalProcessor.processPayment(100.0);
        stripeProcessor.processPayment(200.0);
    }
}
