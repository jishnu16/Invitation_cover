package entities;

public class Country {
    private final String countryname;
    private final int drinkingAge = 20;

    public Country(String countryName) {
        this.countryname = countryName;
    }

    public int legalDrinkingAge() {
        return drinkingAge;
    }

    @Override
    public String toString() {
        return countryname;
    }
}
