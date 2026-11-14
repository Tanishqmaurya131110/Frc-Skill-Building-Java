package module10;

import java.util.Scanner;

public class exercise1_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        for (int count = 1; count <= n; count++) {
            int evenVal = count * 2;
            System.out.println(evenVal);
        }
        sc.close();
    }
}
