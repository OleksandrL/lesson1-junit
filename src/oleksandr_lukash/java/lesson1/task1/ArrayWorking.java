/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oleksandr_lukash.java.lesson1.task1;

import java.util.*;

/**
 *Lesson1 task1
 * @author Oleksandr_Lukash
 */
public class ArrayWorking {
    
    int[] generateArray(int number, int bottom, int top){
        if (number < 1)
            throw new IllegalArgumentException("Incorrect array size");
        if (bottom > top)
            throw new IllegalArgumentException("Top must be bigger than bottom");
        int result[] = new int[number];
        Random rnd = new Random();
        for(int i = 0; i < result.length; i++){
            result[i] = rnd.nextInt(top - bottom + 1) + bottom;
        }
        return result;
    }
    
    int findMaxNegativeNumberIndex(int [] numbers) throws Exception{
        int maxNeg = -1;
        int maxNegValue = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > maxNegValue && numbers[i] < 0){
                    maxNegValue = numbers[i];
                    maxNeg = i;
            }
        }
        if (maxNeg == -1)
            throw new Exception("Array doesn't contain negative numbers");
        return maxNeg;
    }
    
    int findMinPositiveNumberIndex(int [] numbers) throws Exception{
        int minPos = -1;
        int minPosValue = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < minPosValue && numbers[i] > 0){
                    minPosValue = numbers[i];
                    minPos = i;
            }
        }
        if (minPos == -1)
            throw new Exception("Array doesn't contain positive numbers");
        return minPos;
    }
    
    int[] change(int [] numbers) throws Exception{
        int maxNeg = findMaxNegativeNumberIndex(numbers);
        int minPos = findMinPositiveNumberIndex(numbers);
        int swap = numbers[minPos];
        numbers[minPos] = numbers[maxNeg];
        numbers[maxNeg] = swap;
        return numbers;
    }
    
    int evenPositionSum(int [] numbers){
        int sum =0;
        for (int i = 0; i < numbers.length; i = i+2){
            sum+=numbers[i];
        }
        return sum;
    }
    
    int [] replaceNegativeByZeroes(int [] numbers){
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] < 0)
                numbers[i] = 0;
        }
        return numbers;
    }
    
    int [] triplicatePositiveBeforeNegative(int [] numbers){
        for (int i = 0; i < numbers.length - 1; i++){
            if((numbers[i] > 0)&&(numbers[i+1] < 0))
                numbers[i] *= 3;
        }
        return numbers;
    }
    
    double findAvgAndMinDifference(int [] numbers){
        int min = numbers[0];
        int sum = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] < min)
                min = numbers[i];
            sum+=numbers[i];
        }
        return sum*1.0/numbers.length - min;
    }
    
    int[] moreThanOnceOnOddPos(int [] numbers){
        int[] elements = new int[numbers.length];
        int y = 0;
        for (int i = 1; i < numbers.length; i+=2){
                boolean found = false;
                boolean was = false;
                int value = numbers[i];
                for (int j = 0; j < numbers.length; j++){
                    if (value == numbers[j] && j != i){
                        found = true;
                        if(j < i && j % 2 == 1){
                            was = true;
                        }
                        break;
                    }
                }
                if (found && !was){
                elements[y++] = numbers[i];
            }
        }
        int[] result = new int[y];
        System.arraycopy(elements, 0, result, 0, y);
        return result;
    }
}
