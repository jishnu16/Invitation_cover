package entities;

import java.util.Objects;

public class Name {
    private final String firstName;
    private final String lastName;
    private  final String gender;

    public Name(String firstName, String lastName,String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender =   gender;
    }
    public String fullName() {
        return genderRepresentation()+" "+ firstName+" "+lastName;
    }

    public  String lastNameFirst(){
        return genderRepresentation()+" "+lastName+", "+firstName;
    }

    public Gender genderRepresentation() {
        return Objects.equals(this.gender, "Male") ? Gender.MALE : Gender.FEMALE;
    }

}
