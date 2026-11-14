package module09;

import java.util.Scanner;

public class exercise3_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the month number : ");
        int month = sc.nextInt();

        switch (month) {
            case 12, 1, 2:
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("spring");
                break;
            case 6, 7, 8:
                System.out.println("Summer");
                break;
            case 9, 10, 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Invalid month number");
                break;
        }

        sc.close();
    }
}
