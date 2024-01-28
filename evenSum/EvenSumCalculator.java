import java.util.Scanner;

/*
 * This program prompts the user for an integer and calculates a sum of even numbers
 * from 1 to that integer (inclusive).
 * This program contains a bug. Use a debugger to identify the bug and fix it.
 **/
public class EvenSumCalculator {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number, I'll calculate an even sum from 1 to your number");
        int number = scan.nextInt();
        int sum = calculateEvenSum(number);
        System.out.println("Sum of even numbers from 1 to " + number + " is: " + sum);
    }
    
    public static int calculateEvenSum(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) { // bug: should be i % 2 == 0 to check for even numbers
                sum += i;
            }
        }
        return sum;
    }
}
