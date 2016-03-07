import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LabelOperatorTest {
    @Test
    public void gives_the_name_in_the_format_first_name_first_for_male() throws Exception {
        Name name = new Name("John", "Doe");
        Address address = new Address("Veda haven", "Vermont", "Macedonia");
        Person person = new Person(name, Gender.Male, 25, address);
        LabelOperator op = new LabelOperator(person);
        String expected = "Mr John Doe";
        String actual = op.getFirstNameFirst();
        assertEquals(expected, actual);
    }

    @Test
    public void gives_the_name_in_the_format_first_name_first_for_female() throws Exception {
        Name name = new Name("Melody", "Dooley");
        Address address = new Address("Veda haven", "Vermont", "Macedonia");
        Person person = new Person(name, Gender.Female, 25, address);
        LabelOperator op = new LabelOperator(person);
        String expected = "Ms Melody Dooley";
        String actual = op.getFirstNameFirst();
        assertEquals(expected, actual);
    }

    @Test
    public void gives_the_name_in_the_format_last_name_first_for_male() throws Exception {
        Name name = new Name("John", "Doe");
        Address address = new Address("Veda haven", "Vermont", "Macedonia");
        Person person = new Person(name, Gender.Male, 25, address);
        LabelOperator op = new LabelOperator(person);
        String expected = "Mr Doe, John";
        String actual = op.getFirstNameLast();
        assertEquals(expected, actual);
    }

    @Test
    public void gives_the_name_in_the_format_last_name_first_for_female() throws Exception {
        Name name = new Name("Melody", "Dooley");
        Address address = new Address("Veda haven", "Vermont", "Macedonia");
        Person person = new Person(name, Gender.Female, 25, address);
        LabelOperator op = new LabelOperator(person);
        String expected = "Ms Dooley, Melody";
        String actual = op.getFirstNameLast();
        assertEquals(expected, actual);
    }

    @Test
    public void gives_the_name_in_the_format_first_name_first_with_country_for_male() throws Exception {
        Name name = new Name("John", "Doe");
        Address address = new Address("Veda haven", "Vermont", "Macedonia");
        Person person = new Person(name, Gender.Male, 25, address);
        LabelOperator op = new LabelOperator(person);
        String expected = "Mr John Doe, Macedonia";
        String actual = op.getFirstNameFirstWithCountry();
        assertEquals(expected, actual);
    }

    @Test
    public void gives_the_name_in_the_format_first_name_first_with_country_female() throws Exception {
        Name name = new Name("Melody", "Dooley");
        Address address = new Address("Veda haven", "Vermont", "Macedonia");
        Person person = new Person(name, Gender.Female, 25, address);
        LabelOperator op = new LabelOperator(person);
        String expected = "Ms Melody Dooley, Macedonia";
        String actual = op.getFirstNameFirstWithCountry();
        assertEquals(expected, actual);
    }

    @Test
    public void gives_the_name_in_the_format_last_name_first_with_country_for_male() throws Exception {
        Name name = new Name("John", "Doe");
        Address address = new Address("Veda haven", "Vermont", "Macedonia");
        Person person = new Person(name, Gender.Male, 25, address);
        LabelOperator op = new LabelOperator(person);
        String expected = "Mr Doe, John, Macedonia";
        String actual = op.getFirstNameLastWithCountry();
        assertEquals(expected, actual);
    }

    @Test
    public void gives_the_name_in_the_format_last_name_first_with_country_for_female() throws Exception {
        Name name = new Name("Melody", "Dooley");
        Address address = new Address("Veda haven", "Vermont", "Macedonia");
        Person person = new Person(name, Gender.Female, 25, address);
        LabelOperator op = new LabelOperator(person);
        String expected = "Ms Dooley, Melody, Macedonia";
        String actual = op.getFirstNameLastWithCountry();
        assertEquals(expected, actual);
    }
}