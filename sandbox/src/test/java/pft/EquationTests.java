package pft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EquationTests {

    @Test
    public void test0() {
        Equation e = new Equation(1, 1, 1);
        Assertions.assertEquals(e.rootNumber(), 0);
    }

    @Test
    public void test1() {
        Equation e = new Equation(1, 2, 1);
        Assertions.assertEquals(e.rootNumber(), 1);
    }

    @Test
    public void test2() {
        Equation e = new Equation(1, 4, 3);
        Assertions.assertEquals(e.rootNumber(), 2);
    }

    @Test
    public void test3() {
        Equation e = new Equation(0, 4, 3);
        Assertions.assertEquals(e.rootNumber(), 1);
    }

    @Test
    public void test4() {
        Equation e = new Equation(0, 0, 3);
        Assertions.assertEquals(e.rootNumber(), 0);
    }

    @Test
    public void test5() {
        Equation e = new Equation(0, 0, 0);
        Assertions.assertEquals(e.rootNumber(), -1);
    }
}