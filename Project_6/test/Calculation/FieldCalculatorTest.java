package Calculation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FieldCalculatorTest {

    public FieldCalculatorTest() {
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


    @Test(expected = IllegalArgumentException.class)
    public void testCalculateSquare() {
        System.out.println("calculateSquare");
        double a = 0.0;
        double expResult = 0.0;
        double result = FieldCalculator.calculateSquare(a);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalculateSquare1() {
        System.out.println("calculateSquare");
        double a = 4.0;
        double expResult = 16.0;
        double result = FieldCalculator.calculateSquare(a);
        assertEquals(expResult, result, 0.0);


    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateCircle() {
        System.out.println("calculateCircle");
        double r = 0.0;
        double expResult = 0.0;
        double result = FieldCalculator.calculateCircle(r);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateTriangle() {
        System.out.println("calculateTriangle");
        double a = 0.0;
        double h = 0.0;
        double expResult = 0.0;
        double result = FieldCalculator.calculateTriangle(a, h);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateRectangle() {
        System.out.println("calculateRectangle");
        double a = 0.0;
        double b = 0.0;
        double expResult = 0.0;
        double result = FieldCalculator.calculateRectangle(a, b);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

}
