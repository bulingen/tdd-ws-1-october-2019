import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTests {
    private StringCalculator instanceToTest = new StringCalculator();

    @Test
    public void whenEmptyString_shouldReturnZero() throws Exception {
        String input = "";
        int expected = 0;
        int actual = instanceToTest.add(input);
        assertEquals(expected, actual);
    }

    @Test
    public void whenInputIsOne_shouldReturnIntegerOne() throws Exception {
        String input = "1";
        int expected = 1;
        int actual = instanceToTest.add(input);
        assertEquals(expected, actual);
    }

    @Test
    public void whenInputIsOneAndTwo_shouldReturnTheSumThree() throws Exception {
        String input = "1,2";
        int expected = 3;
        int actual = instanceToTest.add(input);
        assertEquals(expected, actual);
    }

    @Test
    public void whenInputIsTen_shouldReturnTen() throws Exception {
        String input = "10";
        int expected = 10;
        int actual = instanceToTest.add(input);
        assertEquals(expected, actual);
    }

    @Test
    public void whenInputIsTenAndTen_shouldReturnTwenty() throws Exception {
        String input = "10,10";
        int expected = 20;
        int actual = instanceToTest.add(input);
        assertEquals(expected, actual);
    }

    @Test
    public void whenInputIsOneCommaOneCommaOne_shouldReturnSumThree() throws Exception {
        String input = "1,1,1";
        int expected = 3;
        int actual = instanceToTest.add(input);
        assertEquals(expected,actual);
    }

    @Test
    public void whenInputHasNewLine_shouldReturnSum() throws Exception {
        String input = "1\n1";
        int expected = 2;
        int actual = instanceToTest.add(input);
        assertEquals(expected, actual);
    }

    @Test
    public void whenInputHasNewLineAndComma_shouldReturnSum() throws Exception {
        String input = "1\n1,1";
        int expected = 3;
        int actual = instanceToTest.add(input);
        assertEquals(expected, actual);
    }

    @Test
    public void whenInputHasCustomDelimiter_shouldReturnSum() throws Exception {
        String input = "//;\n1;2";
        int expected = 3;
        int actual = instanceToTest.add(input);
        assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void whenInputHasNegativeNumber_shouldThrowException() throws Exception {
        String input = "-1";
        instanceToTest.add(input);
    }

}
