package entities;

public class Guest {
    private Name name;
    private Age age;
    private Address address;

    public Guest(Name name, Age age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String formalRepresentation() {
        return name.fullName();
    }

    public String getFirstNameFirstWithCountry() {
        return address.countryWithName(name.fullName());
    }

    public String getLastNameFirstWithCountry() {
        return address.countryWithName(name.lastNameFirst());
    }

    public String surnameFirstRepresentation() {
        return name.lastNameFirst();
    }

    public String getFirstNameFirstWithAgeAndCountry() {
        return age.ageRepresentationWithInformation(getFirstNameFirstWithCountry());
    }

    public String getLastNameFirstWithCountryAndAge() {
        return age.ageRepresentationWithInformation(getLastNameFirstWithCountry());
    }

}
