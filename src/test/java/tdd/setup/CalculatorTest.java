package tdd.setup;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Retro calculator")
class CalculatorTest {
    @Test
    @DisplayName("should display result after adding two positive numbers")
    void calculatorCanDoTwoPlusTwo() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("4", calc.readScreen());
    }
    @Test
    @DisplayName("should display result after multiplying two positive numbers")
    void calculatorCanMultiplyTwoPositiveNumbers() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressOperationKey("x");
        calc.pressDigitKey(3);
        calc.pressEquals();
        assertEquals("6", calc.readScreen());
    }
    @Test
    @DisplayName("should display a point number")
    void calculatorCanDisplayPointNumbers() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(3);
        calc.pressDotKey();
        calc.pressDigitKey(5);
        assertEquals("3.5", calc.readScreen());
    }
    @Test
    @DisplayName("should show same number")
    void calculatorShowsSameNumber() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(7);
        calc.pressEquals();
        assertEquals("7", calc.readScreen());
    }
}
