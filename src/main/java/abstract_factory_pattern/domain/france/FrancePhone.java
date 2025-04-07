package abstract_factory_pattern.domain.france;

import abstract_factory_pattern.domain.shared.Phone;

public class FrancePhone implements Phone {
    private static final String PREFIX = "+33";
    private final String phoneNumber;

    protected FrancePhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getPhoneNumber() {
        return PREFIX + " " + phoneNumber;
    }
}
