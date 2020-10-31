package guhar4k.patterns.behavioral.chain;

public class Webshop extends SimpleOrderHandler {
    @Override
    boolean handle(Order order) {
        boolean isOrderPaid = order.isOrderPaid();

        if (isOrderPaid) {
            System.out.println("Webshop order handled succesful: " + order.getProduct());
            return true;
        } else {
            System.out.println("Failed to proceed the Webshop order. The order was not paid: " + order.getProduct());
            return false;
        }
    }
}
