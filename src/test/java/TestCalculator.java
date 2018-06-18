import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    @Test
    public void calculatorCanAdd(){
        Calculator calculator = new Calculator(2, 3);
        assertEquals(5, calculator.add());

    }

    @Test
    public void calculatorCanSubtract(){
        Calculator calculator = new Calculator(3, 2);
        assertEquals(1, calculator.subtract());
    }

    @Test
    public void calculatorCanMultiply(){
        Calculator calculator = new Calculator(3, 3);
        assertEquals(9, calculator.multiply());
    }

    @Test
    public void calculatorCanDivide(){
        Calculator calculator = new Calculator(6, 2);
        assertEquals(3, calculator.divide());
    }
}
