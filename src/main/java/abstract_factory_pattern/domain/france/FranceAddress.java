package abstract_factory_pattern.domain.france;

import abstract_factory_pattern.domain.shared.Address;

public class FranceAddress implements Address {
    private static final String COUNTRY = "France";
    private final String street;
    private final String number;
    private final String apartment;
    private final String city;
    private final String postalCode;

     protected FranceAddress(String street, String number, String apartment, String city, String postalCode) {
        this.street = street;
        this.number = number;
        this.apartment = apartment;
        this.city = city;
        this.postalCode = postalCode;
    }

    @Override
    public String getAddress() {
        return apartment +
                "\n" + number + " " + street +
                "\n" + postalCode + ", " + city +
                "\n" + COUNTRY;
    }

}
