package entities;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameTest {
    private Name malePerson;
    private Name femalePerson;

    @Before
    public void setUp() throws Exception {
        malePerson = new Name("Carlos","Johns","Male");
        femalePerson = new Name("Velma","Bergstrom","Female");
    }

    @Test
    public void fullName_should_gives_full_name_of_a_person() throws Exception {
        assertEquals("Mr Carlos Johns",malePerson.fullName());
    }

    @Test
    public void lastNameFirst_should_gives_full_name_represented_lastName_first() throws Exception {
        assertEquals("Ms Bergstrom, Velma",femalePerson.lastNameFirst());
    }
}