package guhar4k.patterns.behavioral.chain;

public class WebshopManager extends SimpleOrderHandler{
    @Override
    boolean handle(Order order) {
        System.out.print("Manager handled the order  successful. ");
        boolean isNeedToDelivery = order.isNeedForDelivery();

        if (isNeedToDelivery){
            System.out.println("Transfering the order to the courier...");
            return true;
        } else {
            System.out.println("Waiting for the client to pickup the order...");
            return false;
        }
    }
}
