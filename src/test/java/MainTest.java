import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
  @Test
  public void basicTest(){
    String[] args = {"add", "3", "4"};
    assertEquals(7, Main.calc("add", args));
    assertEquals(-1, Main.calc("subtract", args));
    assertEquals(12, Main.calc("multiply", args));
    assertEquals(0, Main.calc("divide", args));
    assertEquals(2, Main.calc("fib", args));
  }
}