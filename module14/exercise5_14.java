package module14;

import java.util.Scanner;

public class exercise5_14 {
    public static void table(int num) {
        for (int k = 1; k <= 10; k++) {
            System.out.println(num + " x " + k + " = " + (num * k));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int num = sc.nextInt();
        table(num);
        sc.close();
    }
}
