package guhar4k.patterns.sructural.decorator;

public class PhoneDecorator implements Phone {
    Phone phone;

    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String getPhoneFeatures() {
        return phone.getPhoneFeatures();
    }
}
