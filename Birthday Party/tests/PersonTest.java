import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void sets_the_prefix_to_mr_for_male() throws Exception {
        Name name = new Name("John","Doe");
        Address address = new Address("Veda haven","Vermont","Macedonia");
        Person person =  new Person(name,25,address);
        person.setGender(Gender.MALE);
        person.setPrefix();
        assertEquals("Mr",name.prefix);
    }

    @Test
    public void sets_the_prefix_to_ms_for_female() throws Exception {
        Name name = new Name("melody","Dooley");
        Address address = new Address("Veda haven","Vermont","Macedonia");
        Person person =  new Person(name,25,address);
        person.setGender(Gender.FEMALE);
        person.setPrefix();
        assertEquals("Ms",name.prefix);
    }

    @Test
    public void gives_the_name_in_firstLast_format() throws Exception {
        Name name = new Name("Melody","Dooley");
        Address address = new Address("Veda haven","Vermont","Macedonia");
        Person person =  new Person(name,25,address);
        person.setGender(Gender.FEMALE);
        String expected = "Ms Melody Dooley";
        String actual = person.selectFormat("firstLast");
        assertEquals(expected,actual);
    }

    @Test
    public void gives_the_name_in_lastFirst_format() throws Exception {
        Name name = new Name("Melody","Dooley");
        Address address = new Address("Veda haven","Vermont","Macedonia");
        Person person =  new Person(name,25,address);
        person.setGender(Gender.FEMALE);
        String expected = "Ms Dooley, Melody";
        String actual = person.selectFormat("lastFirst");
        assertEquals(expected,actual);
    }



}