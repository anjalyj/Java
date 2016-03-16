import org.junit.Before;
import org.junit.Test;
import person.Person;
import scanner.firstLastScanner;
import scanner.lastFirstScanner;
import validator.AgeValidator;
import validator.Validators;
import validator.countryValidator;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class OperationsTest {
    String data;
    @Before
    public void setUp() throws Exception {
        ReadFile readObj = new ReadFile("csvFiles/sample.csv");
        data = readObj.readContent();
    }

    @Test
    public void given_a_fileName_and_firstLast_choice_should_give_according_to_the_choice() throws Exception {
        ArrayList<Validators> validators = new ArrayList<>();
        Operations op = new Operations(new firstLastScanner(), data,validators);
        String expected = "Ms Julius Barrows\nMs Melody Dooley\nMr Gavin Hyatt\nMr Carlos Johns\nMr Lue Kuhn\n";
        String actual = op.getLabel();
        assertEquals(expected, actual);
    }

    @Test
    public void given_a_fileName_and_lastFirst_choice_should_give_according_to_the_choice() throws Exception {
        ArrayList<Validators> validators = new ArrayList<>();
        Operations op = new Operations(new lastFirstScanner(), data,validators);
        String expected = "Ms Barrows, Julius\nMs Dooley, Melody\nMr Hyatt, Gavin\nMr Johns, Carlos\nMr Kuhn, Lue\n";
        String actual = op.getLabel();
        assertEquals(expected, actual);
    }

    @Test
    public void given_a_fileName_and_firstLastWithCountry_choice_should_give_according_to_the_choice() throws Exception {
        ArrayList<Validators> validators = new ArrayList<>();
        validators.add(new countryValidator("Bangladesh"));
        Operations op = new Operations(new firstLastScanner(),data,validators);
        String expected = "Ms Melody Dooley, Bangladesh\n" +
                "Mr Carlos Johns, Bangladesh\nMr Lue Kuhn, Bangladesh\n";
        String actual = op.getLabel();
        assertEquals(expected, actual);
    }

    @Test
    public void given_a_fileName_and_lastFirstWithCountry_choice_should_give_according_to_the_choice() throws Exception {
        ArrayList<Validators> validators = new ArrayList<>();
        validators.add(new countryValidator("Bangladesh"));
        Operations op = new Operations(new lastFirstScanner() , data,validators);
        String expected = "Ms Dooley, Melody, Bangladesh\n" +
                "Mr Johns, Carlos, Bangladesh\nMr Kuhn, Lue, Bangladesh\n";
        String actual = op.getLabel();
        assertEquals(expected, actual);
    }


    @Test
    public void given_an_option_and_an_age_limit_should_give_filtered_output() throws Exception{
        ArrayList<Validators> validators = new ArrayList<>();
        validators.add(new AgeValidator(20));
        Operations op = new Operations(new lastFirstScanner(), data,validators);
        String expected = "Ms Dooley, Melody, 31\nMr Hyatt, Gavin, 36\nMr Johns, Carlos, 35\n";
        String actual = op.getLabel();
        assertEquals(expected, actual);
    }

    @Test
    public void given_a_fileName_and_firstLastLegal_choice_should_give_according_to_the_choice() throws Exception {
        ArrayList<Validators> validators = new ArrayList<>();
        validators.add(new AgeValidator(20));
        Operations op = new Operations(new firstLastScanner(),data,validators);
        String expected = "Ms Melody Dooley, 31\nMr Gavin Hyatt, 36\nMr Carlos Johns, 35\n";
        String actual = op.getLabel();
        assertEquals(expected, actual);
    }

}