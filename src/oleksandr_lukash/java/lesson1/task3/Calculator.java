package oleksandr_lukash.java.lesson1.task3;

public class Calculator {  

    int add (int a, int b){
        return a + b;
    }
    int sub (int a, int b){
        return a - b;
    }
    int mul (int a, int b){
        return a * b;
    }
    int div (int a, int b)throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("Error: Division by zero");
        }
            return a / b;
    }
}
