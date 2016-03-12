package entities;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressTest {
    private Address address;
    private Name malePerson;

    @Before
    public void setUp() throws Exception {
        address = new Address("West Shanna","Vermont",new Country("Bangladesh"));
        malePerson = new Name("Carlos", "Johns", "Male");
    }

    @Test
    public void isSameCountry_return_true_when_compared_with_same_country() throws Exception {
        assertTrue(address.isSameCountry("Bangladesh"));
    }

    @Test
    public void isSameCountry_return_false_when_compared_with_different_country() throws Exception {
        assertFalse(address.isSameCountry("Romania"));
    }

    @Test
    public void countryWithName_gives_formal_name_with_country()  throws Exception {
        assertEquals(address.countryWithName(malePerson.fullName()),"Mr Carlos Johns, Bangladesh");

    }

    @Test
    public void countryWithName_gives_surname_first_with_country()  throws Exception {
        assertEquals(address.countryWithName(malePerson.lastNameFirst()),"Mr Johns, Carlos, Bangladesh");
    }

    @Test
    public void cityAnd_StateRepresentation_gives_city_and_states()  throws Exception {
        assertEquals(address.cityAndStateRepresentation(),"West Shanna, Vermont");
    }
}