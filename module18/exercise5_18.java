package module18;

import java.util.Scanner;

public class exercise5_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter x-coordinate of point1 : ");
        int x1 = sc.nextInt();
        System.out.print("enter y-coordinate of point1 : ");
        int y1 = sc.nextInt();
        System.out.print("enter x-coordinate of point2 : ");
        int x2 = sc.nextInt();
        System.out.print("enter y-coordinate of point2 : ");
        int y2 = sc.nextInt();

        double dx = x2 - x1;
        double dy = y2 - y1;
        double distance = Math.sqrt(dx * dx + dy * dy);
        System.out.println("distance between the two points is : " + distance);
        sc.close();
    }
}
