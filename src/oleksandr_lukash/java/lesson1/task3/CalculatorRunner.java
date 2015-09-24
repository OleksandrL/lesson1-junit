/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oleksandr_lukash.java.lesson1.task3;

import java.util.Scanner;

/**
 *Lesson1 task3 CalculatorRunner
 * @author Sasha
 */
public class CalculatorRunner {
    private Calculator calc;
    public static void main(String[] args) {
        CalculatorRunner calRun = new CalculatorRunner();
        calRun.start();
    }
    
    private int enterNumber(String msg, Scanner sc) {
        System.out.print(msg);
        int c = 0;
        while (true){
            try{
                c = Integer.parseInt(sc.nextLine());
                break;
            }catch(Exception e)
            {System.out.print("Enter a proper number: ");}
        }
        return c;
    }
    
    public void start(){
        calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        int A, B;
        String sign = "";
        A = enterNumber("Enter the first number: ", sc);
        B = enterNumber("Enter the second number: ", sc);
        
        System.out.println("Choose an operation:\n"
                + "1 - addition(+)\n"
                + "2 - subtraction(-)\n"
                + "3 - multiplication(*)\n"
                + "4 - division(/)");
        while (true){
            try{
                sign = sc.nextLine();
                if (sign.matches("[1234\\+\\*\\-\\/]")){
                    break;
                }
                else 
                    throw new Exception();
            }catch(Exception e)
            {System.out.print("Enter a proper operation sign (or number): ");}
        }
        
        switch(sign){
            case "+":
            case "1":
                System.out.println("Result = " + calc.add(A, B));
                break;
            case "-":
            case "2": System.out.println("Result = " + calc.sub(A, B));
                break;
            case "*":
            case "3": System.out.println("Result = " + calc.mul(A, B));
                break;
            case "/":
            case "4": {
            try {
                System.out.println("Result = " + calc.div(A, B));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            }
                break;
        }
    }
    
}
