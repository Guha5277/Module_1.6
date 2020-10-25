package guhar4k.patterns.sructural.proxy;

public class StoreManager implements StoreService {
    private Store store;

    @Override
    public void sellProduct(Buyer buyer) {
        if (store == null) store = new Store();
        if (!isProductInStock()) return;
        if (!isBuyerHaveEnoughMoney(buyer)) return;
        store.sellProduct(buyer);
    }

    private boolean isProductInStock(){
        if (store.getProductCount() < 1) {
            System.out.println("The product is out of stock!");
            return false;
        }
        return true;
    }

    private boolean isBuyerHaveEnoughMoney(Buyer buyer){
        if (!(buyer.getBalance() >= store.getProductPrice())){
            System.out.println("Buyer " + buyer.getName() + " does not have enough money to buy the product");
            return false;
        }
        return true;
    }
}
