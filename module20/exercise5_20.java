package module20;

import java.util.Scanner;

public class exercise5_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements : ");
        int n = sc.nextInt();
        System.out.print("enter the number of digits in each element : ");
        int digits = sc.nextInt();
        int[] arr = new int[n];
        double multiplier = Math.pow(10, digits);
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * multiplier);
        }
        int total = 0;
        for (int val : arr) {
            total += val;
        }
        System.out.println("the sum of the elements is : " + total);
        sc.close();
    }
}
