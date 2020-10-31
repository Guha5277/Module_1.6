package guhar4k.patterns.behavioral.observer;

public class WebshopRunner {
    public static void main(String[] args) {
        Webshop webshop = new Webshop();
        WebshopUser user1 = new WebshopUser("Василий");
        WebshopUser user2 = new WebshopUser("Евгений");
        WebshopUser user3 = new WebshopUser("Аркадий");
        WebshopUser user4 = new WebshopUser("Афанасий");

        webshop.addSubscriber(user1);
        webshop.addSubscriber(user2);

        webshop.addProduct("Samsung Smart TV");
        webshop.addProduct("Playstation 5 Pro");

        webshop.addSubscriber(user3);
        webshop.addSubscriber(user4);

        webshop.addProduct("Smartphone");

        webshop.removeSubscriber(user1);
        webshop.removeSubscriber(user2);
        webshop.removeSubscriber(user3);

        webshop.addProduct("Smart Watch");
    }
}
