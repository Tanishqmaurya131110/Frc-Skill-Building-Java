package module08;

import java.util.Scanner;

public class exercise3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the temperature : ");
        float temp = sc.nextFloat();

        if (temp < 10.0f) {
            System.out.println("wear a coat");
        } else if (temp < 20.0f) {
            System.out.println("light jacket recommended");
        } else if (temp < 30.0f) {
            System.out.println("t-shirt weather");
        } else {
            System.out.println("stay indoors");
        }

        sc.close();
    }
}
