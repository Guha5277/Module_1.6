package guhar4k.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements Collection {
    private List<String> productList = new ArrayList<>();
    private Iterator<String> iterator = new ShoppingCartProductsIterator();

    void addProductToCart(String product){
        productList.add(product);
    }

    @Override
    public Iterator getIterator() {
        return iterator;
    }

    private class ShoppingCartProductsIterator implements Iterator{
        private int index;

        @Override
        public boolean hasNext() {
            return index < productList.size();
        }

        @Override
        public String next() {
            return productList.get(index++);
        }
    }
}
