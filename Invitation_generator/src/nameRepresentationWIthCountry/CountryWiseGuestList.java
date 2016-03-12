package nameRepresentationWIthCountry;

import entities.*;

import java.util.ArrayList;

public class CountryWiseGuestList {
    private ArrayList<String[]> guestList;
    private ArrayList<Guest> sortedGuestList  = new ArrayList<>();

    public CountryWiseGuestList(ArrayList<String[]> guestList) {
        this.guestList = guestList;
    }

    public void  guestsFromSpecificCountry(String CountryName) {
        for (String[] person : guestList) {
            Name name = new Name(person[0], person[1], person[2]);
            Address address = new Address(person[4], person[5], new Country(person[6]));
            Age age = new Age(person[3]);
            Guest newGuest = new Guest(name, age, address);
            if (address.isSameCountry(CountryName)) {
                sortedGuestList.add(newGuest);
            }
        }
    }

    public ArrayList<String> guestFormalNameListWithCountry() {
        ArrayList<String> guestNameList = new ArrayList<>();
        for (Guest guest : sortedGuestList) {
            String name = guest.getFirstNameFirstWithCountry();
            guestNameList.add(name);
        }
        return guestNameList;
    }

    public ArrayList<String> guestSurnameFirstWithCountry() {
        ArrayList<String> guestNameList = new ArrayList<>();
        for (Guest guest : sortedGuestList) {
            String name = guest.getLastNameFirstWithCountry();
            guestNameList.add(name);
        }
        return guestNameList;
    }


}
