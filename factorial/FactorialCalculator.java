/*
 * This program recursively calculates the factorial of a hard-coded number. A factorial
 * of a number N is: N*(N-1)*(N-2) .... * 1
 * The recursive definition uses an if-statement. The base case (when the input is 0)
 * terminates the recursion. The recursive case calls calculateFactorial for n-1. Since
 * each recursive case reduces n by 1, we are guaranteed to eventually run into the base case
 *
 * This program contains the bug (the produced result is incorrect). Use the debugger to
 * identify the bug and fix it.
 **/
public class FactorialCalculator {
    
    public static void main(String[] args) {
        int number = 5;
        int factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
    
    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}

