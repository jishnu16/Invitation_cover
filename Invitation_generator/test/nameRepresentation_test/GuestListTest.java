package nameRepresentation_test;

import nameRepresentation.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class GuestListTest {
    @Test
    public void guestFirstNameList_should_give_formal_representatioin_of_Name() throws Exception {
        String[] guest = "C,Ronaldo,Male,44,Lisbon,Lisbon,Portugal".split(",");
        ArrayList<String[]> list = new ArrayList<>();
        list.add(guest);
        GuestList randomGuestList = new GuestList(list);
        randomGuestList.generateGuestList();
        Assert.assertTrue(randomGuestList.guestFirstLastNameList().get(0).equals("Mr C Ronaldo"));
    }

    @Test
    public void guestLastNameFirst_should_give_formal_representatioin_of_Name() throws Exception {
        String[] guest = "Tristin,O'Reilly,Female,37,Veda haven,North Carolina,Romania".split(",");
        ArrayList<String[]> list = new ArrayList<>();
        list.add(guest);
        GuestList randomGuestList = new GuestList(list);
        randomGuestList.generateGuestList();
        Assert.assertTrue(randomGuestList.guestLastFirstNameList().get(0).equals("Ms O'Reilly, Tristin"));
    }
}

