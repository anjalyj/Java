import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void test_should_give_the_firstName() throws Exception {
        Name name = new Name("Melody", "Dooley");
        Address address = new Address("Veda haven", "Vermont", "Macedonia");
        Person person = new Person(name, Gender.Female, 25, address);
        String expected = "Melody";
        String actual = person.getFirstName();
        assertEquals(expected,actual);
    }
    @Test
    public void test_should_give_the_lastName() throws Exception {
        Name name = new Name("Melody", "Dooley");
        Address address = new Address("Veda haven", "Vermont", "Macedonia");
        Person person = new Person(name, Gender.Female, 25, address);
        String expected = "Dooley";
        String actual = person.getLastName();
        assertEquals(expected,actual);
    }

    @Test
    public void test_should_give_the_gender() throws Exception {
        Name name = new Name("Melody", "Dooley");
        Address address = new Address("Veda haven", "Vermont", "Macedonia");
        Person person = new Person(name, Gender.Female, 25, address);
        String expected = "Ms ";
        String actual = person.getPrefix();
        assertEquals(expected,actual);
    }

    @Test
    public void test_should_give_the_age() throws Exception {
        Name name = new Name("Melody", "Dooley");
        Address address = new Address("Veda haven", "Vermont", "Macedonia");
        Person person = new Person(name, Gender.Female, 25, address);
        int expected = 25;
        int actual = person.getAge();
        assertEquals(expected,actual);
    }

    @Test
    public void test_should_give_the_city() throws Exception {
        Name name = new Name("Melody", "Dooley");
        Address address = new Address("Veda haven", "Vermont", "Macedonia");
        Person person = new Person(name, Gender.Female, 25, address);
        String expected = "Veda haven";
        String actual = person.getCity();
        assertEquals(expected,actual);
    }
    @Test
    public void test_should_give_the_state() throws Exception {
        Name name = new Name("Melody", "Dooley");
        Address address = new Address("Veda haven", "Vermont", "Macedonia");
        Person person = new Person(name, Gender.Female, 25, address);
        String expected = "Vermont";
        String actual = person.getState();
        assertEquals(expected,actual);
    }
    @Test
    public void test_should_give_the_country() throws Exception {
        Name name = new Name("Melody", "Dooley");
        Address address = new Address("Veda haven", "Vermont", "Macedonia");
        Person person = new Person(name, Gender.Female, 25, address);
        String expected = "Macedonia";
        String actual = person.getCountry();
        assertEquals(expected,actual);
    }
}