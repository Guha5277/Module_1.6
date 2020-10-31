package guhar4k.patterns.behavioral.chain;

public class Order {
    private String product;
    private boolean needForDelivery;
    private boolean isDelivered;
    private int productCost;
    private int moneyReceived;

    public Order(String product, boolean needForDelivery, int productCost, int moneyReceived) {
        this.product = product;
        this.needForDelivery = needForDelivery;
        this.productCost = productCost;
        this.moneyReceived = moneyReceived;
    }

    public String getProduct() {
        return product;
    }

    public boolean isNeedForDelivery() {
        return needForDelivery;
    }

    public boolean isOrderPaid() {
        return moneyReceived >= productCost;
    }

    public void setDelivered(){
        isDelivered = true;
    }
}
