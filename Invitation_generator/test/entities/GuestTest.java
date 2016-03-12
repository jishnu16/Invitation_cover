package entities;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class GuestTest {
    private Guest maleGuest;
    private Guest femaleGuest;

    @Before
    public void setUp() throws Exception {
        maleGuest = new Guest(new Name("Gavin", "Hyatt", "Male"), new Age("36"), new Address("Crooks ton", "Illinois", new Country("Romania")));
        femaleGuest = new Guest(new Name("Jabari","Emmerich","Female"),  new Age("27"), new Address("Katlynn view","Vermont",new Country("Macedonia")));
    }

    @Test
    public void formalRepresentation_represents_first_name_followed_by_surname_name() throws Exception {
        Assert.assertEquals("Mr Gavin Hyatt", maleGuest.formalRepresentation());
    }

    @Test
    public void surnameFirstRepresentation_represents_surname_followed_by_first_name() throws Exception {
        Assert.assertEquals("Mr Hyatt, Gavin", maleGuest.surnameFirstRepresentation());
    }


    @Test
    public void test_represented_first_name_first_with_country() throws Exception {
        Assert.assertEquals("Mr Gavin Hyatt, Romania", maleGuest.getFirstNameFirstWithCountry());
    }

    @Test
    public void test_represented_last_name_first_with_country() throws Exception {
        Assert.assertEquals("Ms Emmerich, Jabari, Macedonia", femaleGuest.getLastNameFirstWithCountry());

    }

    @Test
    public void test_represented_last_name_first_with_country_and_age() throws Exception {
        Assert.assertEquals("Ms Emmerich, Jabari, Macedonia, 27", femaleGuest.getLastNameFirstWithCountryAndAge());
    }

    @Test
    public void test_represented_first_name_first_with_country_and_age() throws Exception {
        Assert.assertEquals("Ms Jabari Emmerich, Macedonia, 27", femaleGuest.getFirstNameFirstWithAgeAndCountry());
    }


}