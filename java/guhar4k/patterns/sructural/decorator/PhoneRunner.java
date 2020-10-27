package guhar4k.patterns.sructural.decorator;

public class PhoneRunner {
    public static void main(String[] args) {
        Phone phone = new SmartPhone(new MobilePhone());
        Phone militaryForcesPhone = new MilitaryForcesPhone(new MobilePhone());

        System.out.println(phone.getPhoneFeatures());
        System.out.println(militaryForcesPhone.getPhoneFeatures());
    }
}
