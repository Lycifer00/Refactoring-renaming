import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Testing addition")
    void testCalculateAdd() {
        int value1 = 1;
        int value2 = 1;
        char addition = '+';
        int expected = 2;

        int result = Calculator.calculate(value1, value2, addition);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtraction")
    void testCalculateSub() {
        int value1 = 2;
        int value2 = 1;
        char subtraction = '-';
        int expected = 1;

        int result = Calculator.calculate(value1, value2, subtraction);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing multiplication")
    void testCalculateMul() {
        int value1 = 2;
        int value2 = 2;
        char multiplication = '*';
        int expected = 4;

        int result = Calculator.calculate(value1, value2, multiplication);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division")
    void testCalculateDiv() {
        int value1 = 6;
        int value2 = 3;
        char division = '/';
        int expected = 2;

        int result = Calculator.calculate(value1, value2, division);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division by zero")
    void testCalculateDivByZero() {
        int value1 = 2;
        int value2 = 0;
        char division = '/';

        assertThrows(RuntimeException.class,
                ()-> {Calculator.calculate(value1, value2, division);});
    }

    @Test
    @DisplayName("Testing wrong operator")
    void testCalculateWrongOperator() {
        int value1 = 2;
        int value2 = 0;
        char equal = '=';

        assertThrows(RuntimeException.class,
                ()-> {Calculator.calculate(value1, value2, equal);});
    }
}