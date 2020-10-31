package guhar4k.patterns.behavioral.iterator;

public class ShoppingCartRunner {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProductToCart("TV");
        shoppingCart.addProductToCart("Smartphone");
        shoppingCart.addProductToCart("PS5 Pro");

        Iterator iterator = shoppingCart.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
