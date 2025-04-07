package abstract_factory_pattern.domain.spain;

import abstract_factory_pattern.domain.shared.Address;
import abstract_factory_pattern.domain.shared.ContactFactory;
import abstract_factory_pattern.domain.shared.Phone;

public class SpainContactFactory implements ContactFactory {

    @Override
    public Address createAddress(String street, String number, String door, String city, String postalCode, String province) {
        return new SpainAddress(street, number, door, city, postalCode, province);
    }

    @Override
    public Phone createPhone(String phoneNumber) {
        return new SpainPhone(phoneNumber);
    }
}
