package guhar4k.patterns.behavioral.chain;

public abstract class SimpleOrderHandler implements OrderHandler {
    private OrderHandler nextHandler;

    @Override
    public void setNext(OrderHandler handler) {
        nextHandler = handler;
    }

    @Override
    public void handleOrder(Order order) {
        if (handle(order) && nextHandler != null) nextHandler.handleOrder(order);
    }

    abstract boolean handle(Order order);
}
