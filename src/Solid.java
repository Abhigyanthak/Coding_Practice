public class Solid {
    class OrderService {

        public void processOrder(String orderId, String paymentType) {
            //validate
            if(orderId == null || orderId.isEmpty()) {
                throw new RuntimeException("Invalid order");
            }

            // Payment processing
            if(paymentType.equals("CREDIT_CARD")) {
                System.out.println("Processing credit card payment");
            }
            else if(paymentType.equals("PAYPAL")) {
                System.out.println("Processing PayPal payment");
            }

            // Save order to database
            System.out.println("Saving order to database");

            // Send notification
            System.out.println("Sending email notification");
        }
    }
}
