package nameRepresentationWithLegalDrinkers_test;

import nameRepresentationWIthLegalDrinkers.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CountryWiseLegalDrinkersGuestListTest {
    @Test
    public void legalDrinkersGuestsList_should_give_formal_representatioin_of_Name() throws Exception {
        String[] guest = "C,Ronaldo,Male,44,Lisbon,Lisbon,Portugal".split(",");
        ArrayList<String[]> list = new ArrayList<>();
        list.add(guest);
        CountryWiseLegalDrinkersGuestList guestList = new CountryWiseLegalDrinkersGuestList(list);
        guestList.legalDrinkersGuestsList("Portugal");
        Assert.assertTrue(guestList.guestFormalNameListWithCountryAndAge().get(0).equals("Mr C Ronaldo, Portugal, 44"));
    }

    @Test
    public void legalDrinkersGuestsList_should_give_surname_first_representatioin_of_Name() throws Exception {
        String[] guest = "C,Ronaldo,Male,44,Lisbon,Lisbon,Portugal".split(",");
        ArrayList<String[]> list = new ArrayList<>();
        list.add(guest);
        CountryWiseLegalDrinkersGuestList guestList = new CountryWiseLegalDrinkersGuestList(list);
        guestList.legalDrinkersGuestsList("Portugal");
        Assert.assertTrue(guestList.guestSurnameFirstWithCountryAndAge().get(0).equals("Mr Ronaldo, C, Portugal, 44"));
    }

}