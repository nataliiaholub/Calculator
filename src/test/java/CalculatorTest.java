import hw13_calculator.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testCalculate(){
        assertEquals(5.0, Calculator.calculate(2,3,'+'), 0.0);
        assertEquals(6.0, Calculator.calculate(7,1,'-'), 0.0);
        assertEquals(9.0, Calculator.calculate(3,3,'x'), 0.0);
        assertEquals(2.0, Calculator.calculate(4,2,'/'), 0.0);
    }
    @Test
    public void testDivisionByNonZero(){
        assertEquals(2.0, Calculator.calculate(4,2,'/'), 0.0);
    }
    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero(){
        Calculator.calculate(6,0,'/');
    }
    @Test(expected = ArithmeticException.class)
    public void testInvalidOperator(){
        Calculator.calculate(2,2,'$');
    }

}

