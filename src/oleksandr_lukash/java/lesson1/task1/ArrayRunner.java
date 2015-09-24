package oleksandr_lukash.java.lesson1.task1;

import java.util.Arrays;

public class ArrayRunner {
    private int [] numbers;
    private int [] numbersCopy;
    private ArrayWorking ars;
    public static final int SIZE = 20;
    public static final int BOTTOM = -10;
    public static final int TOP = 10;
    
    public static void main(String[]  args){
        ArrayRunner arr = new ArrayRunner();
        arr.start();
    }
    
    public void start(){
        ars = new ArrayWorking();  
        numbers = ars.generateArray(SIZE, BOTTOM, TOP);
        numbersCopy = new int[numbers.length];
        System.arraycopy(numbers, 0, numbersCopy, 0, numbers.length);
        System.out.println("Before replacing:\n" + Arrays.toString(numbers));
        try {
            numbers = ars.change(numbers);
            System.out.println("After replacing:\n" + Arrays.toString(numbers));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        restoreCreatedArray();
        System.out.println("Input array:\n"+ Arrays.toString(numbers));
        int sum = ars.evenPositionSum(numbers);
        System.out.println("Sum of numbers at the even positions = " + sum);
        System.out.println("Before replacing:\n" + Arrays.toString(numbers));
        numbers = ars.replaceNegativeByZeroes(numbers);
        System.out.println("After replacing:\n" + Arrays.toString(numbers));
        
        restoreCreatedArray();
        System.out.println("Before triplication:\n" + Arrays.toString(numbers));
        numbers = ars.triplicatePositiveBeforeNegative(numbers);
        System.out.println("After triplication:\n" + Arrays.toString(numbers));
        
        restoreCreatedArray();
        System.out.println("Input array:\n" + Arrays.toString(numbers));
        double diff = ars.findAvgAndMinDifference(numbers);
        System.out.println("Difference between average and min = "  + diff);
        
        int[] elements = ars.moreThanOnceOnOddPos(numbers);
        System.out.println("Elements:\n" + Arrays.toString(elements));
    }
    
    private void restoreCreatedArray(){
        System.arraycopy(numbersCopy, 0, numbers, 0, numbers.length);
    }
    
}
