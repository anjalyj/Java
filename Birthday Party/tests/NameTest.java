import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameTest {
    @Test
    public void gives_the_name_in_the_format_first_name_first_for_male() throws Exception {
        Name john = new Name("John","Doe");
        john.prefix="Mr";
        String expected = "Mr John Doe";
        String actual = john.getFirstLast(" ");
        assertEquals(expected,actual);
    }

    @Test
    public void gives_the_name_in_the_format_first_name_first_for_female() throws Exception {
        Name melody = new Name("Melody","Dooley");
        melody.prefix="Ms";
        String expected = "Ms Melody Dooley";
        String actual = melody.getFirstLast(" ");
        assertEquals(expected,actual);
    }

    @Test
    public void gives_the_name_in_the_format_last_name_first() throws Exception {
        Name john = new Name("John","Doe");
        john.prefix="Mr";
        String expected = "Mr Doe, John";
        String actual = john.getLastFirst(",");
        assertEquals(expected,actual);
    }

    @Test
    public void gives_the_name_in_the_format_last_name_first_for_female() throws Exception {
        Name melody = new Name("Melody","Dooley");
        melody.prefix="Ms";
        String expected = "Ms Dooley, Melody";
        String actual = melody.getLastFirst(",");
        assertEquals(expected,actual);
    }
}