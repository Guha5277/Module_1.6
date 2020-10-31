package guhar4k.patterns.behavioral.observer;

public class WebshopUser implements Subscriber {
    private String name;

    public WebshopUser(String name) {
        this.name = name;
    }

    @Override
    public void newProductNotify(String product) {
        System.out.println("Пользователь " + name + " уведомлён о новом продукте: " + product);
    }
}
