package nameRepresentation;

import entities.*;

import java.util.ArrayList;

public class GuestList {
    private ArrayList<String[]> guestList;
    private ArrayList<Guest> sortedList = new ArrayList<>();

    public GuestList(ArrayList<String[]> guestList) {
        this.guestList = guestList;
    }


    public void generateGuestList() {
        for (String[] person : guestList) {
            Name name = new Name(person[0], person[1], person[2]);
            Address address = new Address(person[4], person[5], new Country(person[6]));
            Age age = new Age(person[3]);
            Guest newGuest = new Guest(name, age, address);
            sortedList.add(newGuest);
        }
    }

    public ArrayList<String> guestFirstLastNameList() {
        ArrayList<String> guestNameList = new ArrayList<>();
        for (Guest guest : sortedList) {
            String name = guest.formalRepresentation();
            guestNameList.add(name);
        }
        return guestNameList;
    }

    public ArrayList<String> guestLastFirstNameList() {
        ArrayList<String> guestNameList = new ArrayList<>();
        for (Guest guest : sortedList) {
            String name = guest.surnameFirstRepresentation();
            guestNameList.add(name);
        }
        return guestNameList;
    }
}