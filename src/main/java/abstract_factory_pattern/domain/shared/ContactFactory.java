package abstract_factory_pattern.domain.shared;

public interface ContactFactory {
    Address createAddress(String street, String number, String apartmentOrDoor, String city, String postalCode, String province);

    Phone createPhone(String phoneNumber);
}
