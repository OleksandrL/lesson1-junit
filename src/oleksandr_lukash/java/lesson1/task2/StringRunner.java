package oleksandr_lukash.java.lesson1.task2;

import java.util.Arrays;
import java.util.Scanner;

public class StringRunner {
    private StringWorking stw;
    public static final int INDEX_NUMBER = 2;
    public static void main(String[]args){
        StringRunner str = new StringRunner();
        str.start();
    }
    public void start(){
        stw = new StringWorking();
        String[] arrList = enterStrings();
        String[] ss = stw.foundMaxAndMin(arrList);
        System.out.println("The longest string: " + ss[0]);
        System.out.println("The shortest string: " + ss[1]);
        
        String[] la = stw.getLongerThanAverage(arrList);
        System.out.println("Longer than average:" + Arrays.toString(la));
        String[] sa = stw.getShorterThanAverage(arrList);
        System.out.println("Shorter than average:" + Arrays.toString(sa));
        
        String[] wordList = enterWords();
        String word;
        try {
            word = stw.minRepetitiveSymbols(wordList);
            System.out.println("Min. number of diff. repetitive symbols: " + word);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        
        try { 
            System.out.println("Only diff. symbols: "  + stw.getOnlyDiffSymbols(wordList));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            System.out.println("Second number: "  + stw.getOnlyNumbers(wordList, INDEX_NUMBER));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        }

    String[] enterStrings() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Enter number of strings:");
        while(true){
        try {
            n = Integer.parseInt(sc.nextLine());
            if (n < 1)
                throw new Exception();
            break;
        } catch (Exception e) {
            System.out.println("Enter a proper number");
        }
        }
        String[] arrList = new String[n];
        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++ ){
            String s = sc.nextLine();
            if (s.matches("\\s*"))
                i--;
            else
                arrList[i] = s;
        }
        System.out.println(Arrays.toString(arrList));
        return arrList;
    }
    
    String[] enterWords() {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        System.out.println("Enter number of words:");
        while(true){
        try {
            n = Integer.parseInt(sc.nextLine());
            if (n < 1)
                throw new Exception();
            break;
        } catch (Exception e) {
            System.out.println("Enter a proper number");
        }
        } 
        String[] arrList = new String[n];
        System.out.println("Enter words:");
        for (int i = 0; i < n; i++ ){
            String s = sc.next();
            if (s.matches("\\s*"))
                i--;
            else
                arrList[i] = s;
        }
        System.out.println(Arrays.toString(arrList));
        return arrList;
    }
}
