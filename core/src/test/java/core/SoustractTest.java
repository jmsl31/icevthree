package core;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SoustractTest {

    @Test
    public void testCalculate() {
        assertEquals(3, SubstractionMachine.getInstance().calculate(6, 3), 0);
    }

    @Test
    public void testCalculate2() {
        assertEquals(4, SubstractionMachine.getInstance().calculate(6, 2), 0);
    }

}
