package module09;

import java.util.Scanner;

public class exercise4_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of first side : ");
        int a = sc.nextInt();
        System.out.print("enter the length of second side : ");
        int b = sc.nextInt();
        System.out.print("enter the length of third side : ");
        int c = sc.nextInt();

        boolean condition = (a + b > c) && (b + c > a) && (a + c > b);
        String result = condition ? "The triangle is valid." : "The triangle is not valid.";
        System.out.println(result);

        sc.close();
    }
}
