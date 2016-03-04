import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LabelOperatorTest {
    @Test
    public void gives_the_name_in_the_format_first_name_first() throws Exception {
        Name name = new Name("John", "Doe");
        Address address = new Address("Veda haven", "Vermont", "Macedonia");
        Person person = new Person(name, Gender.Male, 25, address);
        LabelOperator op = new LabelOperator(person);
        String expected = "Mr John Doe";
        String actual = op.getFirstNameFirst();
        assertEquals(expected, actual);
    }

    @Test
    public void gives_the_name_in_the_format_last_name_first() throws Exception {
        Name name = new Name("John", "Doe");
        Address address = new Address("Veda haven", "Vermont", "Macedonia");
        Person person = new Person(name, Gender.Male, 25, address);
        LabelOperator op = new LabelOperator(person);
        String expected = "Mr Doe, John";
        String actual = op.getFirstNameLast();
        assertEquals(expected, actual);
    }

    @Test
    public void gives_the_name_in_the_format_first_name_first_with_country() throws Exception {
        Name name = new Name("John", "Doe");
        Address address = new Address("Veda haven", "Vermont", "Macedonia");
        Person person = new Person(name, Gender.Male, 25, address);
        LabelOperator op = new LabelOperator(person);
        String expected = "Mr John Doe, Macedonia";
        String actual = op.getFirstNameFirstWithCountry();
        assertEquals(expected, actual);
    }

    @Test
    public void gives_the_name_in_the_format_last_name_first_with_country() throws Exception {
        Name name = new Name("John", "Doe");
        Address address = new Address("Veda haven", "Vermont", "Macedonia");
        Person person = new Person(name, Gender.Male, 25, address);
        LabelOperator op = new LabelOperator(person);
        String expected = "Mr Doe, John, Macedonia";
        String actual = op.getFirstNameLastWithCountry();
        assertEquals(expected, actual);
    }
}