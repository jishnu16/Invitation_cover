package entities;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AgeTest {
    private Age legalAge = new Age("32");
    private Age illegalAge = new Age("18");
    private Guest maleGuest;

    @Before
    public void setUp() throws Exception {
        maleGuest = new Guest(new Name("Gavin", "Hyatt", "Male"), new Age("36"), new Address("Crooks ton", "Illinois", new Country("Romania")));
    }

    @Test
    public void isLegalDrinkingAge_gives_true_when_age_greater_than_20() throws Exception {
        assertTrue(legalAge.isLegalDrinkingAge(20));
    }

    @Test
    public void isLegalDrinkingAge_gives_flase_when_age_less_than_20() throws Exception {
        assertFalse(illegalAge.isLegalDrinkingAge(20));
    }

    @Test
    public void ageRepresentationWithInformation_representa_name_and_country_with_age() throws Exception {
        Assert.assertEquals(legalAge.ageRepresentationWithInformation(maleGuest.getFirstNameFirstWithCountry()), "Mr Gavin Hyatt, Romania, 32");
    }

}