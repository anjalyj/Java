import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LinkedListTest {

    @Test
    public void adds_to_the_first() throws Exception {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        assertEquals(2, (int) list.get(2));
        assertEquals(1, (int) list.get(3));
        assertEquals(3, (int) list.get(1));
        assertEquals(4, (int) list.get(0));
        list.clear();
    }

    @Test
    public void adds_to_the_given_index() throws Exception {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0, 12);
        list.add(1, 15);
        list.add(2, 17);
        list.add(2, 19);

        assertEquals(12, (int) list.get(0));
        assertEquals(19, (int) list.get(2));
        assertEquals(17, (int) list.get(3));

        list.clear();
    }

    @Test
    public void returns_the_size_as_0_when_nothing_is_added() throws Exception {
        LinkedList<Integer> list = new LinkedList<>();
        assertEquals(0, list.size());
        list.clear();
    }

    @Test
    public void returns_the_size_as_per_the_elements_added() throws Exception {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(15);
        list.add(17);
        list.add(19);
        assertEquals(4, list.size());
        list.clear();
    }

    //
    @Test
    public void adds_string_to_the_list() throws Exception {
        LinkedList<String> list = new LinkedList<>();
        list.add("anjaly");
        list.add("shibi");
        list.add("shruti");
        list.add("navya");
        assertEquals("shibi", list.get(2));
        assertEquals("anjaly", list.get(3));
        assertEquals("shruti", list.get(1));
        assertEquals("navya", list.get(0));
    }

    @Test
    public void hasNext_returns_true_if_there_is_element() throws Exception {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        MyIterator it = list.iterator();
        assertTrue(it.hasNext());
    }

    @Test
    public void hasNext_returns_false_if_there_is_no_element() throws Exception {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.clear();
        MyIterator it = list.iterator();
        assertFalse(it.hasNext());
    }

    @Test
    public void next_gives_the_next_element_of_the_list() throws Exception {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        MyIterator it = list.iterator();
        int index = 0;
        while (it.hasNext()) {
            assertEquals(list.get(index), (it.next()));
            index++;
        }


    }
}