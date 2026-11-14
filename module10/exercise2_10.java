package module10;

import java.util.Scanner;

public class exercise2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int prod = n * i;
            System.out.println(n + " x " + i + " = " + prod);
        }
        sc.close();
    }
}
