package oleksandr_lukash.java.lesson1.task2;

import org.junit.*;
import static org.junit.Assert.*;

public class StringWorkingTest {
    private StringWorking instance;
    private static String[] arrList;
    private static String[] arrList2;
    private static String[] arrList3;
    private static String[] words;
    private static String[] words2;
    private static String[] words3;
    public static final double DELTA = 0.000001;   
    
    @Before
    public void setUp() {
        instance = new StringWorking();
        arrList = new String[]{"qwertyuiop asdf", "qwert", "qw, t", "asfgh asdf", "qwertyui"};
        arrList2 = new String[]{"qwertyuiop asdf"};
        arrList3 = new String[0];
        words = new String[]{"aassddfghjkl", "aassdfghjkl", "1122345", "336677", "1234", "qwerty", "qwer"};
        words2 = new String[]{"2211345", "663377", "qwertyy", "qqwerty", "asdfg", "hjklnb"};
    }

    /**
     * Test of getAverageLength method, of class StringWorking.
     */
    @Test
    public void testGetAverageLength() {
        assertEquals(8.6, instance.getAverageLength(arrList), DELTA);
        assertEquals(15, instance.getAverageLength(arrList2), DELTA);
        assertEquals(Double.NaN, instance.getAverageLength(arrList3), DELTA);
    }
    
    @Test
    public void testFoundMaxLengthString() {
        String expResult = "qwertyuiop asdf - 15";
        assertEquals(expResult, instance.foundMaxLengthString(arrList));
        expResult = "qwertyuiop asdf - 15";
        assertEquals(expResult, instance.foundMaxLengthString(arrList2));
    }

    @Test
    public void testFoundMinLengthString() {
        String expResult = "qwert - 5";
        assertEquals(expResult, instance.foundMinLengthString(arrList));
        expResult = "qwertyuiop asdf - 15";
        assertEquals(expResult, instance.foundMinLengthString(arrList2));
    }

    /**
     * Test of foundMaxAndMin method, of class StringWorking.
     */
    @Test
    public void testFoundMaxAndMin() {
        String[] expResult = 
        {"qwertyuiop asdf - 15", "qwert - 5"};
        assertArrayEquals(expResult, instance.foundMaxAndMin(arrList));
        expResult = new String[]
        {"qwertyuiop asdf - 15", "qwertyuiop asdf - 15"};
        assertArrayEquals(expResult, instance.foundMaxAndMin(arrList2));
    }

    /**
     * Test of getLongerThanAverage method, of class StringWorking.
     */
    @Test
    public void testGetLongerThanAverage() {
        String[] expResult = 
        {"qwertyuiop asdf - 15", "asfgh asdf - 10"};
        assertArrayEquals(expResult, instance.getLongerThanAverage(arrList));
        expResult = new String[0];
        assertArrayEquals(expResult, instance.getLongerThanAverage(arrList2));
        expResult = new String[0];
        assertArrayEquals(expResult, instance.getLongerThanAverage(arrList3));
    }

    /**
     * Test of getShorterThanAverage method, of class StringWorking.
     */
    @Test
    public void testGetShorterThanAverage() {
        String[]expResult= {"qwert - 5", "qw, t - 5",  "qwertyui - 8"};
        assertArrayEquals(expResult, instance.getShorterThanAverage(arrList));
        expResult = new String[0];
        assertArrayEquals(expResult, instance.getLongerThanAverage(arrList2));
        expResult = new String[0];
        assertArrayEquals(expResult, instance.getLongerThanAverage(arrList3));
    }

    /**
     * Test of minRepetitiveSymbols method, of class StringWorking.
     * @throws java.lang.Exception
     */
    @Test
    public void testMinRepetitiveSymbols() throws Exception{
        assertEquals("aassdfghjkl", instance.minRepetitiveSymbols(words));
        assertEquals("qwertyy", instance.minRepetitiveSymbols(words2));
    }
    
    /**
     * Test of getOnlyDiffSymbols method, of class StringWorking.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetOnlyDiffSymbols() throws Exception {
        assertEquals("1234", instance.getOnlyDiffSymbols(words));
        assertEquals("asdfg", instance.getOnlyDiffSymbols(words2));
    } 
    
    /**
     * Test of getOnlyNumbers method, of class StringWorking.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetOnlyNumbers() throws Exception {
        assertEquals("336677", instance.getOnlyNumbers(words, 2));
        assertEquals("1234", instance.getOnlyNumbers(words, 3));
        assertEquals("1122345", instance.getOnlyNumbers(words, 1));
        assertEquals("2211345", instance.getOnlyNumbers(words2, 1));
        assertEquals("663377", instance.getOnlyNumbers(words2, 2));
    }
}