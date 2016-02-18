import static org.junit.Assert.assertEquals;
import org.junit.Test;

import cal.*;

public class CalculatorTest {
  @Test
  public void add_gives_the_sum() {
    Calc c = new Calc();
    c.add(5).add(10).add(10);
    assertEquals(25,c.result);
  }
  @Test
  public void sub_gives_the_difference(){
    Calc c = new Calc();
    c.add(10).sub(5);
    assertEquals(5,c.result);
  }
}
