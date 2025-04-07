package abstract_factory_pattern;

import abstract_factory_pattern.infrastructure.ContactInMemoryRepository;

public class Main {
    public static void main(String[] args) {
        ContactInMemoryRepository.addContact("Eduardo Zavarce",
                "666666666",
                "Carrer Major",
                "12",
                "1-2",
                "Barcelona",
                "08001",
                "Catalunya",
                "Spain");

        ContactInMemoryRepository.addContact("Marie Curie",
                "777777777",
                "Rue Pierre et Marie Curie",
                "12",
                "Ètage 2 - 1",
                "Paris",
                "75000",
                null,
                "France");

        ContactInMemoryRepository.showContacts();


    }
}
