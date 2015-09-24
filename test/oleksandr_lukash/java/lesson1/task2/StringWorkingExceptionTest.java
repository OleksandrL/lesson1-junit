package oleksandr_lukash.java.lesson1.task2;

import org.junit.*;
import static org.junit.Assert.*;

public class StringWorkingExceptionTest {
    private StringWorking instance;
    private static String[] arrList3;
    private static String[] words3;
    public static final double DELTA = 0.000001;   
    
    @Before
    public void setUp() {
        instance = new StringWorking();
        arrList3 = new String[0];
        words3 = new String[0];
    }
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testFoundMaxLengthString() {
        assertEquals(null, instance.foundMaxLengthString(arrList3));
    }
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testFoundMinLengthString() {
        assertEquals(null, instance.foundMaxLengthString(arrList3));
    }
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testFoundMaxAndMin() {
        String[] expResult = {null, null};
        assertArrayEquals(expResult, instance.foundMaxAndMin(arrList3));
    }
    
    /**
     * Test of minRepetitiveSymbols method, of class StringWorking.
     * @throws java.lang.Exception
     */    
    @Test(expected = Exception.class)
    public void negTestMinRepetitiveSymbols() throws Exception{
        String[] words = {"asdg", "3456"};
        String expResult = null;
        assertEquals(expResult, instance.minRepetitiveSymbols(words));
        assertEquals(expResult, instance.minRepetitiveSymbols(words3));
    }
    
    /**
     * Test of getOnlyDiffSymbols method, of class StringWorking.
     * @throws java.lang.Exception
     */
    @Test(expected = Exception.class)
    public void negTestGetOnlyDiffSymbols() throws Exception{
        String[] words = {"aadg", "2233"};
        String expResult = null;
        assertEquals(expResult, instance.getOnlyDiffSymbols(words));
        assertEquals(expResult, instance.getOnlyDiffSymbols(words3));
    }
    
    /**
     * Test of getOnlyNumbers method, of class StringWorking.
     * @throws java.lang.Exception
     */  
    @Test(expected = Exception.class)
    public void negTestGetOnlyNumbers() throws Exception {
        String[] words = {"1234", "aasdf"};
        String expResult = null;
        assertEquals(expResult, instance.getOnlyNumbers(words, 2));
        assertEquals(expResult, instance.getOnlyNumbers(words3, 2));
    }
}