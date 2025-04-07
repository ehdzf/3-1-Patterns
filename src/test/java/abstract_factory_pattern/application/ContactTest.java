package abstract_factory_pattern.application;

import abstract_factory_pattern.application.Contact;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContactTest {
    private static Contact frenchContact;
    private static Contact spanishContact;

    @BeforeAll
    static void setUp() {
        frenchContact = new Contact("Pierre Dupont",
                "123456789",
                "Rue de Rivoli",
                "1",
                "A",
                "Paris",
                "75001",
                "Île-de-France",
                "France");
        spanishContact = new Contact("Jose Perez",
                "987654321",
                "Carrer de Balmes",
                "2",
                "B",
                "Barcelona",
                "08001",
                "Catalunya",
                "Spain");
    }

    @Test
    @DisplayName("France contact does not contain province")
    void testCreateFranceContact() {
        assertThat(frenchContact.getContactInfo()).doesNotContain("Île-de-France");
    }

    @Test
    @DisplayName("France contact phone number starts with +33")
    void testCreateFranceContactPhoneNumber() {
        assertThat(frenchContact.getContactInfo()).contains("+33 123456789");
    }

    @Test
    @DisplayName("Spain contact contains province")
    void testCreateSpainContact() {
        assertThat(spanishContact.getContactInfo()).contains("Catalunya");
    }

    @Test
    @DisplayName("Spain contact phone number starts with +34")
    void testCreateSpainContactPhoneNumber() {
        assertThat(spanishContact.getContactInfo()).contains("+34 987654321");
    }
}