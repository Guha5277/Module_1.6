package guhar4k.patterns.sructural.decorator;

public class MobilePhone implements Phone {
    @Override
    public String getPhoneFeatures() {
        return "Make calls.";
    }
}
