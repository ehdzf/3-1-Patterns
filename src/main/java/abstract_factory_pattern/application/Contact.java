package abstract_factory_pattern.application;

import abstract_factory_pattern.domain.shared.Address;
import abstract_factory_pattern.domain.shared.ContactFactory;
import abstract_factory_pattern.domain.france.FranceContactFactory;
import abstract_factory_pattern.domain.spain.SpainContactFactory;
import abstract_factory_pattern.domain.shared.Phone;

public class Contact {
    private final String name;
    private final Phone phone;
    private final Address address;

    public Contact(String name,
                   String phoneNumber,
                   String street,
                   String number,
                   String apartmentOrDoor,
                   String city,
                   String postalCode,
                   String province,
                   String country) {
        this.name = name;
        ContactFactory contactFactory = switch (country.toLowerCase()) {
            case "spain" -> new SpainContactFactory();
            case "france" -> new FranceContactFactory();
            default -> throw new IllegalArgumentException("Unsupported country: " + country);
        };
        this.address = contactFactory.createAddress(street, number, apartmentOrDoor, city, postalCode, province);
        this.phone = contactFactory.createPhone(phoneNumber);

    }

    public String getContactInfo() {
        return name.toUpperCase() + "\n" +
                address.getAddress() + "\n" +
                phone.getPhoneNumber() + "\n";
    }
}
