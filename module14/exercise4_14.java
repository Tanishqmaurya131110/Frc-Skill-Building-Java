package module14;

import java.util.Scanner;

public class exercise4_14 {
    public static void countDigits(int num) {
        int temp = Math.abs(num);
        int count = 0;
        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                count++;
                temp /= 10;
            }
        }
        System.out.println("The number of digits in " + num + " is: " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        countDigits(num);
        sc.close();
    }
}
