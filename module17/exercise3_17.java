package module17;

import java.util.Scanner;

public class exercise3_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string : ");
        String str = sc.nextLine();
        int left = 0;
        int right = str.length() - 1;
        boolean check = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                check = false;
                break;
            }
            left++;
            right--;
        }

        if (check) {
            System.out.println("entered string is a pallindrome");
        } else {
            System.out.println("entered string is not a pallindrome");
        }
        sc.close();
    }
}
