package entities;

public class Address {
    private String city;
    private String state;
    private Country country;

    public Address(String city, String state, Country country) {
        this.city = city;
        this.country = country;
        this.state = state;
    }


    public  String countryWithName(String name){
        return  name + "," + " " + country;
    }

    public Boolean isSameCountry(String otherCountry) {
        return this.country.toString().equals(otherCountry);
    }

    public String cityAndStateRepresentation (){
        return city+ ", "+state;
    }
}
