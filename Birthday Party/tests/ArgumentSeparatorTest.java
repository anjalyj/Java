import org.junit.Test;

import static org.junit.Assert.*;
public class ArgumentSeparatorTest {
    @Test
    public void test_getFile_will_give_file_provided_in_the_arguments_list() throws Exception {
        String[] args = {"-firstLast","sample.csv","country","Bangladesh",""};
        ArgumentSeparator seperator = new ArgumentSeparator(args);
        String expectd = "sample.csv";
        String actual = seperator.getFile();
        assertEquals(expectd,actual);
    }
}