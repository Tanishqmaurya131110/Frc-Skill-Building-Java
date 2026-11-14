package module20;

import java.util.Scanner;

public class exercise4_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int half = n / 2;
        for (int i = 0; i < half; i++) {
            int partnerIndex = n - 1 - i;
            System.out.println("the sum of index " + i + " and " + partnerIndex + " is : " + (arr[i] + arr[partnerIndex]));
        }
        if (n % 2 != 0) {
            System.out.println("the middle element is : " + arr[n / 2]);
        }
        sc.close();
    }
}
