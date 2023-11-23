package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("model")
class PersonTest {

    @Test
    void groupedAssertions() {
        // given
        Person person = new Person(101l, "Ken", "Climo");

        // then
        assertAll("Test Props Set",
                () -> assertEquals( "Ken", person.getFirstName()),
                () -> assertEquals("Climo", person.getLastName()));
    }

    // Differs from the previous test only in terms of the message.
    @Test
    void groupedAssertionsMsgs() {
        // given
        Person person = new Person(101l, "Ken", "Climo");

        // then
        assertAll("Test Props Set",
                () -> assertEquals("Ken", person.getFirstName(), "First Name Failed"),
                () -> assertEquals( "Climo", person.getLastName(), "Last Name Failed"));
    }

}