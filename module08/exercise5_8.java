package module08;

import java.util.Scanner;

public class exercise5_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your physics marks (out of 100) : ");
        float pm = sc.nextFloat();
        System.out.print("enter your chemistry marks (out of 100) : ");
        float cm = sc.nextFloat();
        System.out.print("enter your mathematics marks (out of 100) : ");
        float mm = sc.nextFloat();

        float percentage = (pm + cm + mm) / 3.0f;
        System.out.println("your net percentage is : " + percentage);

        boolean passedAll = (pm >= 40.0f) && (cm >= 40.0f) && (mm >= 40.0f);
        if (passedAll) {
            System.out.println("you are pass");
        } else {
            System.out.println("you are fail");
        }

        sc.close();
    }
}
