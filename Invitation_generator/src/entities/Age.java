package entities;

import static java.lang.Integer.parseInt;
import static java.lang.String.*;

public class Age {
    private int age;

    public Age(String age) {
        this.age = parseInt(age);
    }

    public boolean isLegalDrinkingAge(int age) {
        return this.age > age;
    }

    public String ageRepresentationWithInformation(String information) {
        return information + ", " + valueOf(age);
    }
}
