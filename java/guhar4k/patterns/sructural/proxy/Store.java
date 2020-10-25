package guhar4k.patterns.sructural.proxy;

public class Store implements StoreService {
    private int productCount = 5;
    private int productPrice = 100;
    private int balance;

    public int getProductCount() {
        return productCount;
    }

    public int getProductPrice() {
        return productPrice;
    }

    @Override
    public void sellProduct(Buyer buyer) {
        balance += buyer.getMoney(productPrice);
        buyer.addProduct(1);
        productCount--;
        System.out.println("The product sold to " + buyer.getName());
    }
}
