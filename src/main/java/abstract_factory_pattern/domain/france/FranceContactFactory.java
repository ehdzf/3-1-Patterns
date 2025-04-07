package abstract_factory_pattern.domain.france;

import abstract_factory_pattern.domain.shared.Address;
import abstract_factory_pattern.domain.shared.ContactFactory;
import abstract_factory_pattern.domain.shared.Phone;

public class FranceContactFactory implements ContactFactory {

    @Override
    public Address createAddress(String street, String number, String apartment, String city, String postalCode, String province) {
        return new FranceAddress(street, number, apartment, city, postalCode);
    }

    @Override
    public Phone createPhone(String phoneNumber) {
        return new FrancePhone(phoneNumber);
    }
}
