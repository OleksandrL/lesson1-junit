package oleksandr_lukash.java.lesson1.task1;

import org.junit.*;
import static org.junit.Assert.*;

/**Task1 Test
 * @author Oleksandr_Lukash
 */
public class ArrayWorkingTest {
    private static int[] input;
    private static int[] input2;
    private static int[] input3;
    private static int[] input4;
    private static int[] input5;
    public static final double DELTA = 0.000001; 
    private ArrayWorking instance;
    
    @Before
    public void setUp() {
        instance = new ArrayWorking();
        input = new int[]
            {10, -8, 3, -2, 9, -8, -3, -5, 2, -3, -1, 2, 8, -9, 7, 0, -9, 9, 4, 6};
        input2 = new int[]{15, -8, 3, -2, 9, -8, -3, -15, 2, -3};
        input3 = new int[]{-2, -3};
        input4 = new int[]{5};
        input5 = new int[0];
    }
    
    @Test
    public void testGenerateArray() {
        int[]result = instance.generateArray(20, -10, 10);
        for (int i: result){
            assertTrue((i >= -10)&&(i <= 10));
        }
        assertEquals(20, result.length);
        
        result = instance.generateArray(10, 10, 10);
        for (int i: result){
            assertTrue(i == 10);
        }
        assertEquals(10, result.length);
    }
    
    @Test
    public void testFindMaxNegativeNumberIndex() throws Exception {
        assertEquals(10, instance.findMaxNegativeNumberIndex(input));
        assertEquals(3, instance.findMaxNegativeNumberIndex(input2));
        assertEquals(0, instance.findMaxNegativeNumberIndex(input3));
    }

    @Test
    public void testFindMinPositiveNumberIndex() throws Exception {
        assertEquals(8, instance.findMinPositiveNumberIndex(input));
        assertEquals(8, instance.findMinPositiveNumberIndex(input2));
        assertEquals(0, instance.findMinPositiveNumberIndex(input4));
    }
    
    /**
     * Test of change method, of class ArrayWorking.
     * @throws java.lang.Exception
     */
    @Test
    public void testChange() throws Exception {
        int[] expResult = 
            {10, -8, 3, -2, 9, -8, -3, -5, -1, -3, 2, 2, 8, -9, 7, 0, -9, 9, 4, 6};
        int[] result = instance.change(input);
        assertArrayEquals(expResult, result);
        
        expResult = new int[]{15, -8, 3, 2, 9, -8, -3, -15, -2, -3};
        result = instance.change(input2);
        assertArrayEquals(expResult, result);
    }
    
    /**
     * Test of evenPositionSum method, of class ArrayWorking.
     */
    @Test
    public void testEvenPositionSum() {
        assertEquals(30, instance.evenPositionSum(input));
        assertEquals(26, instance.evenPositionSum(input2));
        assertEquals(-2, instance.evenPositionSum(input3));
        assertEquals(5, instance.evenPositionSum(input4));
    }

    /**
     * Test of replaceNegativeByZeroes method, of class ArrayWorking.
     */
    @Test
    public void testReplaceNegativeByZeroes() {
        int[] expResult = 
           {10, 0, 3, 0, 9, 0, 0, 0, 2, 0, 0, 2, 8, 0, 7, 0, 0, 9, 4, 6};
        assertArrayEquals(expResult, instance.replaceNegativeByZeroes(input));
        expResult = new int[]{15, 0, 3, 0, 9, 0, 0, 0, 2, 0};
        assertArrayEquals(expResult, instance.replaceNegativeByZeroes(input2));
        expResult = new int[]{0, 0};
        assertArrayEquals(expResult, instance.replaceNegativeByZeroes(input3));
        expResult = new int[]{5};
        assertArrayEquals(expResult, instance.replaceNegativeByZeroes(input4));
        expResult = new int[0];
        assertArrayEquals(expResult, instance.replaceNegativeByZeroes(input5));
    }

    /**
     * Test of triplicatePositiveBeforeNegative method, of class ArrayWorking.
     */
    @Test
    public void testTriplicatePositiveBeforeNegative() {
        int[] expResult =
           {30, -8, 9, -2, 27, -8, -3, -5, 6, -3, -1, 2, 24, -9, 7, 0, -9, 9, 4, 6};
        assertArrayEquals(expResult, instance.triplicatePositiveBeforeNegative(input));
        expResult = new int[]{45, -8, 9, -2, 27, -8, -3, -15, 6, -3};
        assertArrayEquals(expResult, instance.triplicatePositiveBeforeNegative(input2));
        expResult = new int[]{-2, -3};
        assertArrayEquals(expResult, instance.triplicatePositiveBeforeNegative(input3));
        expResult = new int[]{5};
        assertArrayEquals(expResult, instance.triplicatePositiveBeforeNegative(input4));
        expResult = new int[0];
        assertArrayEquals(expResult, instance.triplicatePositiveBeforeNegative(input5));
    }

    /**
     * Test of findAvgAndMinDifference method, of class ArrayWorking.
     */
    @Test
    public void testFindAvgAndMinDifference() {
        assertEquals(9.6, instance.findAvgAndMinDifference(input), DELTA);
        assertEquals(14.0, instance.findAvgAndMinDifference(input2), DELTA);
        assertEquals(0.5, instance.findAvgAndMinDifference(input3), DELTA);
        assertEquals(0, instance.findAvgAndMinDifference(input4), DELTA);
    }

    /**
     * Test of moreThanOnceOnOddPos method, of class ArrayWorking.
     */
    @Test
    public void testMoreThanOnceOnOddPos() {
        int[]expResult = {-8, -3, 2, -9, 9};
        assertArrayEquals(expResult, instance.moreThanOnceOnOddPos(input));
        expResult = new int[]{-8, -3};
        assertArrayEquals(expResult, instance.moreThanOnceOnOddPos(input2));
        expResult = new int[0];
        assertArrayEquals(expResult, instance.moreThanOnceOnOddPos(input3));
        expResult = new int[0];
        assertArrayEquals(expResult, instance.moreThanOnceOnOddPos(input4));
        expResult = new int[0];
        assertArrayEquals(expResult, instance.moreThanOnceOnOddPos(input5));
    }
}