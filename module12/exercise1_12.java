package module12;

import java.util.Scanner;

public class exercise1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPass = "FRC12364";

        for (int attempt = 0; attempt < 3; attempt++) {
            System.out.print("Enter password: ");
            String entered = sc.nextLine();
            if (entered.equals(correctPass)) {
                System.out.println("Access granted.");
                break;
            } else {
                if (attempt < 2) {
                    System.out.println("Incorrect password, try again.");
                } else {
                    System.out.println("Incorrect password, Access denied.");
                }
            }
        }

        sc.close();
    }
}
