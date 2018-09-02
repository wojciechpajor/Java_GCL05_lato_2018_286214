package Calculation;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BasicCalculatorTest {

    public BasicCalculatorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Test_start");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Test_stop");
    }

    @Before
    public void setUp() {
        System.out.println("Testing...");
    }

    @After
    public void tearDown() {
        System.out.println("Tested");
    }

    @Test
    public void testCalculateSum() {
        System.out.println("calculateSum");
        double a = 0.0;
        double b = 0.0;
        double expResult = 0.0;
        double result = BasicCalculator.calculateSum(a, b);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testCalculateSum1() {
        System.out.println("calculateSum");
        double a = 7.0;
        double b = 3.0;
        double expResult = 10.0;
        double result = BasicCalculator.calculateSum(a, b);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testCalculateSum2() {
        System.out.println("calculateSum");
        double a = 8.2;
        double b = 4.0;
        double expResult = 12.2;
        double result = BasicCalculator.calculateSum(a, b);
        assertEquals(expResult, result, 0.0);

    }





    @Test
    public void testCalculateDifference() {
        System.out.println("calculateDifference");
        double a = 0.0;
        double b = 0.0;
        double expResult = 0.0;
        double result = BasicCalculator.calculateDifference(a, b);
        assertEquals(expResult, result, 0.0);


    }


    @Test
    public void testCalculateMultiplication() {
        System.out.println("calculateMultiplication");
        double a = 0.0;
        double b = 0.0;
        double expResult = 0.0;
        double result = BasicCalculator.calculateMultiplication(a, b);
        assertEquals(expResult, result, 0.0);


    }


    @Test(expected = IllegalArgumentException.class)
    public void testCalculateDivision() {
        System.out.println("calculateDivision");
        double a = 0.0;
        double b = 0.0;
        double expResult = 0.0;
        double result = BasicCalculator.calculateDivision(a, b);
        assertEquals(expResult, result, 0.0);


    }


    @Test
    public void testCalculatePow() {
        System.out.println("calculatePow");
        double a = 0.0;
        double b = 0.0;
        double expResult = 1.0;
        double result = BasicCalculator.calculatePow(a, b);
        assertEquals(expResult, result, 0.0);


    }


    @Test
    public void testCalculateSqlr() {
        System.out.println("calculateSqlr");
        double a = 0.0;
        double expResult = 0.0;
        double result = BasicCalculator.calculateSqlr(a);
        assertEquals(expResult, result, 0.0);


    }

}
