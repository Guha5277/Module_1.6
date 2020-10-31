package guhar4k.patterns.behavioral.chain;

public class Courier extends SimpleOrderHandler {
    @Override
    boolean handle(Order order) {
        System.out.println("The order was successful delivered");
        order.setDelivered();
        return true;
    }
}
