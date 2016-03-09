import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationsTest {
    @Test
    public void given_a_fileName_and_firstLast_choice_should_give_according_to_the_choice() throws Exception {
        Operations op = new Operations("-firstLast", "csvFiles/sample.csv");
        String expected = "Ms Julius Barrows\nMs Melody Dooley\nMr Gavin Hyatt\nMr Carlos Johns\nMr Lue Kuhn\n";
        String actual = op.getLabel();
        assertEquals(expected, actual);
    }

    @Test
    public void given_a_fileName_and_lastFirst_choice_should_give_according_to_the_choice() throws Exception {
        Operations op = new Operations("-lastFirst", "csvFiles/sample.csv");
        String expected = "Ms Barrows, Julius\nMs Dooley, Melody\nMr Hyatt, Gavin\nMr Johns, Carlos\nMr Kuhn, Lue\n";
        String actual = op.getLabel();
        assertEquals(expected, actual);
    }

    @Test
    public void given_a_fileName_and_firstLastWithCountry_choice_should_give_according_to_the_choice() throws Exception {
        Operations op = new Operations("-firstLastWithCountry", "csvFiles/sample.csv");
        String expected = "Ms Julius Barrows, Macedonia\nMs Melody Dooley, Bangladesh\nMr Gavin Hyatt, Romania\n" +
                "Mr Carlos Johns, Bangladesh\nMr Lue Kuhn, Bangladesh\n";
        String actual = op.getLabel();
        assertEquals(expected, actual);
    }

    @Test
    public void given_a_fileName_and_lastFirstWithCountry_choice_should_give_according_to_the_choice() throws Exception {
        Operations op = new Operations("-lastFirstWithCountry", "csvFiles/sample.csv");
        String expected = "Ms Barrows, Julius, Macedonia\nMs Dooley, Melody, Bangladesh\nMr Hyatt, Gavin, Romania\n" +
                "Mr Johns, Carlos, Bangladesh\nMr Kuhn, Lue, Bangladesh\n";
        String actual = op.getLabel();
        assertEquals(expected, actual);
    }

    @Test
    public void given_a_fileName_and_lastFirstWithSpecificCountry_choice_should_give_according_to_the_choice() throws Exception {
        Operations op = new Operations("-lastFirstWithSpecificCountry", "csvFiles/sample.csv","Bangladesh");
        String expected = "Ms Dooley, Melody, Bangladesh\nMr Johns, Carlos, Bangladesh\nMr Kuhn, Lue, Bangladesh\n";
        String actual = op.getLabel();
        assertEquals(expected, actual);
    }

    @Test
    public void given_a_fileName_and_firstLastWithSpecificCountry_choice_should_give_according_to_the_choice() throws Exception {
        Operations op = new Operations("-firstLastWithSpecificCountry", "csvFiles/sample.csv","Bangladesh");
        String expected = "Ms Melody Dooley, Bangladesh\nMr Carlos Johns, Bangladesh\nMr Lue Kuhn, Bangladesh\n";
        String actual = op.getLabel();
        assertEquals(expected, actual);
    }

    @Test
    public void given_a_fileName_and_lastFirstLegal_choice_should_give_according_to_the_choice() throws Exception {
        Operations op = new Operations("-lastFirstLegal", "csvFiles/sample.csv","Bangladesh");
        String expected = "Ms Dooley, Melody, Bangladesh, 31\nMr Johns, Carlos, Bangladesh, 35\n";
        String actual = op.getLabel();
        assertEquals(expected, actual);
    }

    @Test
    public void given_a_fileName_and_firstLastLegal_choice_should_give_according_to_the_choice() throws Exception {
        Operations op = new Operations("-firstLastLegal", "csvFiles/sample.csv","Bangladesh");
        String expected = "Ms Melody Dooley, Bangladesh, 31\nMr Carlos Johns, Bangladesh, 35\n";
        String actual = op.getLabel();
        assertEquals(expected, actual);
    }

    @Test
    public void test_gives_the_default_when_wrong_choice_is_given() throws Exception {
        Operations op = new Operations("-aasdfg", "csvFiles/sample.csv");
        String expected = "Ms Julius Barrows\nMs Melody Dooley\nMr Gavin Hyatt\nMr Carlos Johns\nMr Lue Kuhn\n";
        String actual = op.getLabel();
        assertEquals(expected, actual);

    }
}