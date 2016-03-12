import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ProcessOptionTest {
    @Test
    public void processOption_gives_only_name_format_and_give_representation_as_formalName_first() throws Exception {
        String[] options = {"formalName", "records"};
        ArrayList<String[]> list = new ArrayList<>();
        String[] guestOne = "C,Ronaldo,Male,44,Madeira,Lisbon,Portugal".split(",");
        String[] guestTwo = "Kenny,Reynolds,Male,30,West Shanna,Georgia,Qatar".split(",");
        String[] guestThree = "Lizzie,Krajcik,Male,37,Crooks ton,Vermont,Qatar".split(",");
        list.add(guestOne);
        list.add(guestTwo);
        list.add(guestThree);
        ProcessOption option = new ProcessOption(options, list);
        ArrayList<String> guestNameList = option.processedOption();
        Assert.assertTrue(guestNameList.get(1).equals("Mr Kenny Reynolds"));
    }

    @Test
    public void processOption_gives_only_name_format_and_give_representation_as_surname_first() throws Exception {
        String[] options = {"surnameFirst", "records"};
        ArrayList<String[]> list = new ArrayList<>();
        String[] guestOne = "C,Ronaldo,Male,44,Madeira,Lisbon,Portugal".split(",");
        String[] guestTwo = "Kenny,Reynolds,Male,30,West Shanna,Georgia,Qatar".split(",");
        String[] guestThree = "Lizzie,Krajcik,Male,37,Crooks ton,Vermont,Qatar".split(",");
        list.add(guestOne);
        list.add(guestTwo);
        list.add(guestThree);
        ProcessOption option = new ProcessOption(options, list);
        ArrayList<String> guestNameList = option.processedOption();
        Assert.assertTrue(guestNameList.get(0).equals("Mr Ronaldo, C"));
    }

    @Test
    public void processOption_gives_only_name_format_and_country_and_give_representation_as_formalName_with_country() throws Exception {
        String[] options = {"formalName", "Qatar", "records"};
        ArrayList<String[]> list = new ArrayList<>();
        String[] guestOne = "C,Ronaldo,Male,44,Madeira,Lisbon,Portugal".split(",");
        String[] guestTwo = "Kenny,Reynolds,Male,30,West Shanna,Georgia,Qatar".split(",");
        String[] guestThree = "Lizzie,Krajcik,Male,37,Crooks ton,Vermont,Qatar".split(",");
        list.add(guestOne);
        list.add(guestTwo);
        list.add(guestThree);
        ProcessOption option = new ProcessOption(options, list);
        ArrayList<String> guestNameList = option.processedOption();
        Assert.assertTrue(guestNameList.get(0).equals("Mr Kenny Reynolds, Qatar"));
    }

    @Test
    public void processOption_gives_only_name_format_and_country_and_give_representation_as_surname_first_with_country() throws Exception {
        String[] options = {"surnameFirst", "Portugal", "records"};
        ArrayList<String[]> list = new ArrayList<>();
        String[] guestOne = "C,Ronaldo,Male,44,Madeira,Lisbon,Portugal".split(",");
        String[] guestTwo = "Kenny,Reynolds,Male,30,West Shanna,Georgia,Qatar".split(",");
        String[] guestThree = "Lizzie,Krajcik,Male,37,Crooks ton,Vermont,Qatar".split(",");
        list.add(guestOne);
        list.add(guestTwo);
        list.add(guestThree);
        ProcessOption option = new ProcessOption(options, list);
        ArrayList<String> guestNameList = option.processedOption();
        Assert.assertTrue(guestNameList.get(0).equals("Mr Ronaldo, C, Portugal"));
    }

    @Test
    public void processOption_gives_name_format_and_country_and_give_representation_of_legal_drinkers_as_formalName_first_with_country() throws Exception {
        String[] options = {"formalName", "Qatar", "drinkers", "records"};
        ArrayList<String[]> list = new ArrayList<>();
        String[] guestOne = "C,Ronaldo,Male,44,Madeira,Lisbon,Portugal".split(",");
        String[] guestTwo = "Kenny,Reynolds,Male,30,West Shanna,Georgia,Qatar".split(",");
        String[] guestThree = "Lizzie,Krajcik,Male,37,Crooks ton,Vermont,Qatar".split(",");
        String[] guestFour = "Torrey,Marvin,Male,19,Veda haven,South Carolina,Portugal".split(",");
        list.add(guestOne);
        list.add(guestTwo);
        list.add(guestThree);
        list.add(guestFour);
        ProcessOption option = new ProcessOption(options, list);
        ArrayList<String> guestNameList = option.processedOption();
        Assert.assertTrue(guestNameList.get(0).equals("Mr Kenny Reynolds, Qatar, 30"));
    }

    @Test
    public void processOption_gives_name_format_and_country_and_give_representation_of_legal_drinkers_as_surname_first_with_country() throws Exception {
        String[] options = {"surnameFirst", "Portugal", "drinkers", "records"};
        ArrayList<String[]> list = new ArrayList<>();
        String[] guestOne = "C,Ronaldo,Male,44,Madeira,Lisbon,Portugal".split(",");
        String[] guestTwo = "Kenny,Reynolds,Male,30,West Shanna,Georgia,Qatar".split(",");
        String[] guestThree = "Lizzie,Krajcik,Male,37,Crooks ton,Vermont,Qatar".split(",");
        String[] guestFour = "Torrey,Marvin,Male,19,Veda haven,South Carolina,Portugal".split(",");
        list.add(guestOne);
        list.add(guestTwo);
        list.add(guestThree);
        list.add(guestFour);
        ProcessOption option = new ProcessOption(options, list);
        ArrayList<String> guestNameList = option.processedOption();
        Assert.assertTrue(guestNameList.get(0).equals("Mr Ronaldo, C, Portugal, 44"));
    }

}