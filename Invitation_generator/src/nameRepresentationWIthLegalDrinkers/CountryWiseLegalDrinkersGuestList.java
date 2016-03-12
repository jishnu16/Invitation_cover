package nameRepresentationWIthLegalDrinkers;

import entities.*;

import java.util.ArrayList;

public class CountryWiseLegalDrinkersGuestList {
    private ArrayList<String[]> guestList;
    public ArrayList<Guest> sortedList =new ArrayList<>();

    public CountryWiseLegalDrinkersGuestList(ArrayList<String[]> guestList) {
        this.guestList = guestList;
    }

    public void legalDrinkersGuestsList(String CountryName){
        for (String[] person : guestList) {
            Name name = new Name(person[0], person[1], person[2]);
            Country country = new Country(person[6]);
            Address address = new Address(person[4], person[5], country );
            Age age = new  Age(person[3]);
            Guest newGuest = new Guest(name, age, address);
            if ((person[6].equals(CountryName)) && (age.isLegalDrinkingAge(country.legalDrinkingAge()))) {
                sortedList.add(newGuest);
            }
        }
    }

    public ArrayList<String> guestFormalNameListWithCountryAndAge() {
        ArrayList<String> guestNameList = new ArrayList<>();
        for (Guest guest : sortedList) {
            String name = guest.getFirstNameFirstWithAgeAndCountry();
            guestNameList.add(name);
        }
        return guestNameList;
    }

    public ArrayList<String> guestSurnameFirstWithCountryAndAge() {
        ArrayList<String> guestNameList = new ArrayList<>();
        for (Guest guest : sortedList) {
            String name = guest.getLastNameFirstWithCountryAndAge();
            guestNameList.add(name);
        }
        return guestNameList;
    }

}
