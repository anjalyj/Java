import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PowerOfTwoTest {
    @Test
    public void isPowerOf_returns_true_if_the_exponnt_is_power_of_two() throws Exception {
        assertTrue(PowerOfTwo.isPowerOf(4));
        assertTrue(PowerOfTwo.isPowerOf(2));
        assertTrue(PowerOfTwo.isPowerOf(8));
        assertTrue(PowerOfTwo.isPowerOf(16));
        assertTrue(PowerOfTwo.isPowerOf(1024));

    }

    @Test
    public void isPowerOf_returns_false_if_the_exponent_is_not_power_of_two() throws Exception {
        assertFalse(PowerOfTwo.isPowerOf(5));
        assertFalse(PowerOfTwo.isPowerOf(3));
        assertFalse(PowerOfTwo.isPowerOf(11));
        assertFalse(PowerOfTwo.isPowerOf(1000));

    }
}