package abstract_factory_pattern.domain.spain;

import abstract_factory_pattern.domain.shared.Phone;

public class SpainPhone implements Phone {
    private static final String PREFIX = "+34";
    private final String phoneNumber;

    protected SpainPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getPhoneNumber() {
        return PREFIX + " " + phoneNumber;
    }
}
