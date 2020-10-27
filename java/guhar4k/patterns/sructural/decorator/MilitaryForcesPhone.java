package guhar4k.patterns.sructural.decorator;

public class MilitaryForcesPhone extends PhoneDecorator {
    public MilitaryForcesPhone(Phone phone) {
        super(phone);
    }

    @Override
    public String getPhoneFeatures() {
        return super.getPhoneFeatures() + " Make secret encrypted calls";
    }
}
