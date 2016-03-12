package nameRepresentationWithCountry_test;

import nameRepresentationWIthCountry.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CountryWiseGuestListTest {
    private String[] guestOne;
    private String[] guestTwo;
    private String[] guestThree;
    private ArrayList<String[]> list;

    @Before
    public void setUp() throws Exception {
        list = new ArrayList<>();
        guestOne = "C,Ronaldo,Male,44,Madeira,Lisbon,Portugal".split(",");
        guestTwo = "Kenny,Reynolds,Male,30,West Shanna,Georgia,Qatar".split(",");
        guestThree = "Lizzie,Krajcik,Male,37,Crooks ton,Vermont,Qatar".split(",");
    }

    @Test
    public void guestFirstNameListWithCountry_should_give_formal_representatioin_of_Name_with_country() throws Exception {
        list.add(guestOne);
        list.add(guestTwo);
        list.add(guestThree);

        CountryWiseGuestList guestList = new CountryWiseGuestList(list);
        guestList.guestsFromSpecificCountry("Portugal");
        Assert.assertTrue(guestList.guestFormalNameListWithCountry().get(0).equals("Mr C Ronaldo, Portugal"));
    }

    @Test
    public void guestSurnameFirstWithCountry_should_give_formal_representatioin_of_Name_with_country() throws Exception {
        list.add(guestOne);
        list.add(guestTwo);
        list.add(guestThree);
        CountryWiseGuestList guestList = new CountryWiseGuestList(list);
        guestList.guestsFromSpecificCountry("Qatar");
        Assert.assertTrue(guestList.guestSurnameFirstWithCountry().get(0).equals("Mr Reynolds, Kenny, Qatar"));
        Assert.assertTrue(guestList.guestSurnameFirstWithCountry().get(1).equals("Mr Krajcik, Lizzie, Qatar"));
    }
}