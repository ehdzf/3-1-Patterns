package abstract_factory_pattern.domain.spain;

import abstract_factory_pattern.domain.shared.Address;

public class SpainAddress implements Address {
    private static final String COUNTRY = "España";
    private final String street;
    private final String number;
    private final String door;
    private final String city;
    private final String postalCode;
    private final String province;

    protected SpainAddress(String street, String number, String door, String city, String postalCode, String province) {
        this.street = street;
        this.number = number;
        this.door = door;
        this.city = city;
        this.postalCode = postalCode;
        this.province = province;
    }

    @Override
    public String getAddress() {
        return street + ", " + number + ", " + door +
                ",\n" + postalCode +
                "\n" + city +
                "\n" + province +
                "\n" + COUNTRY;
    }


}
