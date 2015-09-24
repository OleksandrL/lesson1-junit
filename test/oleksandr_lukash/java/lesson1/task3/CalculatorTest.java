/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oleksandr_lukash.java.lesson1.task3;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Oleksandr_Lukash
 */
public class CalculatorTest {
    private Calculator instance;
    
    @Before
    public void setUp() {
         instance = new Calculator();
    }
    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        assertEquals(5, instance.add(2, 3));
        assertEquals(5, instance.add(0, 5));
        assertEquals(-5, instance.add(-5, 0));
        assertEquals(0, instance.add(5, -5));
    }

    /**
     * Test of sub method, of class Calculator.
     */
    @Test
    public void testSub() {
        assertEquals(-1, instance.sub(2, 3));
        assertEquals(-5, instance.sub(0, 5));
        assertEquals(-5, instance.sub(-5, 0));
        assertEquals(10, instance.sub(5, -5));
    }
    
    /**
     * Test of multiplication method, of class Calculator.
     */
    @Test
    public void testMul() {
        assertEquals(6, instance.mul(2, 3));
        assertEquals(0, instance.mul(0, 5));
        assertEquals(0, instance.mul(-5, 0));
        assertEquals(-25, instance.mul(5, -5));
    }

    /**
     * Test of div method, of class Calculator.
     */
    @Test
    public void testDiv() {
        assertEquals(0, instance.div(2, 3));
        assertEquals(0, instance.div(0, 5));
        assertEquals(-1, instance.div(5, -5));
        assertEquals(-1, instance.div(-5, 5));
    }
    
    @Test(expected = ArithmeticException.class)
    public void testDivZeroException() {
        assertEquals(0, instance.div(2, 0));
        assertEquals(0, instance.div(-2, 0));
    }
}