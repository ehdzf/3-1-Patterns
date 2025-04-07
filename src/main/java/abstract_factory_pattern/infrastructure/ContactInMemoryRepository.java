package abstract_factory_pattern.infrastructure;

import abstract_factory_pattern.application.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactInMemoryRepository {
    private static final List<Contact> contacts = new ArrayList<>();

    private ContactInMemoryRepository() {
        // Private constructor to prevent instantiation
    }

    public static void addContact(String name,
                                  String phoneNumber,
                                  String street,
                                  String number,
                                  String apartmentOrDoor,
                                  String city,
                                  String postalCode,
                                  String province,
                                  String country) {
        contacts.add(new Contact(name, phoneNumber, street, number, apartmentOrDoor, city, postalCode, province, country));
    }

    public static void showContacts() {
        contacts.forEach(contact -> {
            System.out.println(contact.getContactInfo());
            System.out.println("----------------------");
        });
    }
}
