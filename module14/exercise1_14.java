package module14;

import java.util.Scanner;

public class exercise1_14 {
    public static void factorial(int num) {
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }
        if (num == 0) {
            System.out.println("The factorial of 0 is: 1");
            return;
        }
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("The factorial of " + num + " is: " + fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        factorial(num);
        sc.close();
    }
}
