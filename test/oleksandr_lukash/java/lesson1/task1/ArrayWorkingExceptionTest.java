package oleksandr_lukash.java.lesson1.task1;

import org.junit.*;
import static org.junit.Assert.*;

public class ArrayWorkingExceptionTest {
    private static int[] input3;
    private static int[] input4;
    private static int[] input5;
    public static final double DELTA = 0.000001; 
    private ArrayWorking instance;
    
    @Before
    public void setUp() {
        instance = new ArrayWorking();
        input3 = new int[]{-2, -3};
        input4 = new int[]{5};
        input5 = new int[0];
    }
       
    @Test (expected = IllegalArgumentException.class)
    public void testGenArraySize() {
        int[]result = instance.generateArray(-20, -10, 10);
        for (int i: result){
            assertTrue((i >= -10)&&(i <= 10));
        }
        assertEquals(20, result.length);
    }
  
    @Test (expected = IllegalArgumentException.class)
    public void testGenArrayParameters() {
        int[]result = instance.generateArray(20, 10, -10);
        for (int i: result){
            assertTrue((i >= -10)&&(i <= 10));
        }
        assertEquals(20, result.length);
    }
    
        
    @Test(expected = Exception.class)
    public void negTestFindMaxNegativeNumberIndex() throws Exception {
        assertEquals(0, instance.findMaxNegativeNumberIndex(input4));
        assertEquals(0, instance.findMaxNegativeNumberIndex(input5));
    }
    
    @Test(expected = Exception.class)
    public void negTestFindMinPositiveNumberIndex() throws Exception {
        assertEquals(0, instance.findMinPositiveNumberIndex(input3));
        assertEquals(0, instance.findMinPositiveNumberIndex(input5));
    }
    
    @Test(expected = Exception.class)
    public void testNegativeChange() throws Exception{
        int[] expResult = new int[0];
        int[] result = instance.change(input3);
        assertArrayEquals(expResult, result);
        
        result = instance.change(input4);
        assertArrayEquals(expResult, result);
        
        result = instance.change(input5);
        assertArrayEquals(expResult, result);
    }
}
