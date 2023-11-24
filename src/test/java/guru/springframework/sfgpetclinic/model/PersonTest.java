package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelRepeatedTests;
import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest implements ModelTests {

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

    @RepeatedTest(value = 10, name = "{displayName} : {currentRepetition} - {totalRepetitions}")
    @DisplayName("My Repeated Test")
    void myRepeatedTest() {
        // todo -impl
    }

    @RepeatedTest(5)
    void myRepeatedTestWithDI(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getDisplayName() + ": " + repetitionInfo.getCurrentRepetition());
    }

    @RepeatedTest(value = 5, name = "{displayName}")
    @DisplayName("Repeated Test")
    void repeatedTest(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        // todo impl
    }
}