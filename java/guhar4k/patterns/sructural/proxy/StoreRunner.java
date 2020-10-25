package guhar4k.patterns.sructural.proxy;

public class StoreRunner {
    public static void main(String[] args) {
        StoreService store = new StoreManager();
        Buyer buyerBob = new Buyer("Bob", 500);
        Buyer buyerJohn = new Buyer("John", 190);

        store.sellProduct(buyerBob);
        store.sellProduct(buyerJohn);
        store.sellProduct(buyerJohn);
        store.sellProduct(buyerBob);
        store.sellProduct(buyerBob);
        store.sellProduct(buyerBob);
        store.sellProduct(buyerBob);
    }
}
