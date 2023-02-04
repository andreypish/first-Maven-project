

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorTest {
    private final int FIRST_NUMBER;
    private final int SECOND_NUMBER;
    private final int EXPECTED;

    public CalculatorTest(int FIRST_NUMBER, int SECOND_NUMBER, int EXPECTED) {
        this.FIRST_NUMBER = FIRST_NUMBER;
        this.SECOND_NUMBER = SECOND_NUMBER;
        this.EXPECTED = EXPECTED;
    }

    @Parameterized.Parameters
    public static Object[][] getSumData() {
        return new Object[][]{
                {1, 9, 10},
                {1, 0, 1},
                {-1, -10, -11}
        };
    }

    @Test
    public void shouldSumPositive() {
        Calculator calculator = new Calculator();
        int actual = calculator.sum(FIRST_NUMBER, SECOND_NUMBER);
        assertEquals(EXPECTED, actual);
    }

//    @Test
//    public void shouldSumPositiveAndZero() {
//        Calculator calculator = new Calculator();
//        int firsNumber = 1;
//        int secondNumber = 0;
//        int actual = calculator.sum(firsNumber, secondNumber);
//        int expect = 1;
//        assertEquals(expect, actual);
//    }
}