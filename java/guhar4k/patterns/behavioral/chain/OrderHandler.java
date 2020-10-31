package guhar4k.patterns.behavioral.chain;

import java.util.logging.Handler;

public interface OrderHandler {
    void setNext(OrderHandler handler);
    void handleOrder(Order order);
}
