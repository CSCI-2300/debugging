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

