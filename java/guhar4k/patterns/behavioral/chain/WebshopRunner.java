package guhar4k.patterns.behavioral.chain;

public class WebshopRunner {
    public static void main(String[] args) {
        OrderHandler webshop = new Webshop();
        OrderHandler manager = new WebshopManager();
        OrderHandler courier = new Courier();

        webshop.setNext(manager);
        manager.setNext(courier);

        Order order1 = new Order("TV", true, 1000, 1000);
        Order order2 = new Order("TV", false, 1000, 1000);
        Order order3 = new Order("PC", true, 1000, 0);

        webshop.handleOrder(order1);
        System.out.println("------------------------");
        webshop.handleOrder(order2);
        System.out.println("------------------------");
        webshop.handleOrder(order3);
    }
}
