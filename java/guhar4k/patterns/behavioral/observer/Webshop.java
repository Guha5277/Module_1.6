package guhar4k.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Webshop {
    private List<String> productList = new ArrayList<>();
    private List<Subscriber> subscriberList = new ArrayList<>();

    public void addProduct(String product){
        productList.add(product);
        notifySubscribers(product);
    }

    public void addSubscriber (Subscriber subscriber){
        subscriberList.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber){
        subscriberList.remove(subscriber);
    }

    private void notifySubscribers(String product){
        subscriberList.forEach(s -> {
            s.newProductNotify(product);
        });
    }
}
