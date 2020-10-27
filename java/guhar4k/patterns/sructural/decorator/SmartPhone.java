package guhar4k.patterns.sructural.decorator;

public class SmartPhone extends PhoneDecorator {
    public SmartPhone(Phone phone) {
        super(phone);
    }

    @Override
    public String getPhoneFeatures() {
        return super.getPhoneFeatures() + " Make photo. Play multimedia.";
    }
}
