package guhar4k.patterns.sructural.proxy;

public class Buyer {
    private String name;
    private int balance;
    private int productCount;

    public Buyer(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int getMoney(int price){
        balance -= price;
        return price;
    }

    public void addProduct(int productCount){
        productCount += productCount;
    }
}
