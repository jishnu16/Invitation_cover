import nameRepresentation.GuestList;
import nameRepresentationWIthCountry.CountryWiseGuestList;
import nameRepresentationWIthLegalDrinkers.CountryWiseLegalDrinkersGuestList;

import java.io.IOException;
import java.util.ArrayList;

public class ProcessOption {
    private final ArrayList<String[]> records;
    private String nameRepresentation;
    private String[] options;
    private ArrayList<String> guestNameList;

    public ProcessOption(String[] options, ArrayList<String[]> records) {
        this.options = options;
        this.nameRepresentation = options[0];
        this.records = records;

    }

    public ArrayList<String> processedOption() throws IOException {

        switch (options.length) {
            case 2:
                GuestList randomGuestList = new GuestList(records);
                randomGuestList.generateGuestList();
                if (nameRepresentation.equals("formalName")) {
                    guestNameList = randomGuestList.guestFirstLastNameList();
                } else if (nameRepresentation.equals("surnameFirst"))
                guestNameList = randomGuestList.guestLastFirstNameList();
                break;

            case 3:
                String country = options[1];
                CountryWiseGuestList guestListForCountry =new CountryWiseGuestList(records);
                guestListForCountry.guestsFromSpecificCountry(country);
                if (nameRepresentation.equals("formalName")) {
                    guestNameList = guestListForCountry.guestFormalNameListWithCountry();
                } else if (nameRepresentation.equals("surnameFirst"))
                    guestNameList = guestListForCountry.guestSurnameFirstWithCountry();
                break;

            case 4:
                String legalDrinkerOption = options[2];
                country = options[1];
                CountryWiseLegalDrinkersGuestList guestListForDrinkers = new CountryWiseLegalDrinkersGuestList(records);
                guestListForDrinkers.legalDrinkersGuestsList(country);
                if (nameRepresentation.equals("formalName") && legalDrinkerOption.equals("drinkers")) {
                    guestNameList = guestListForDrinkers.guestFormalNameListWithCountryAndAge();
                } else if (nameRepresentation.equals("surnameFirst") && legalDrinkerOption.equals("drinkers"))
                    guestNameList = guestListForDrinkers.guestSurnameFirstWithCountryAndAge();
                break;
        }
        return guestNameList;
    }
}
