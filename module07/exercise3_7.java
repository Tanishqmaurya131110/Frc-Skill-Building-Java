package module07;

import java.util.Scanner;

public class exercise3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter cost price : ");
        float cp = sc.nextFloat();
        System.out.print("enter selling price : ");
        float sp = sc.nextFloat();

        float diff = sp - cp;
        String result = (diff > 0) 
            ? "profit incurred \nprofit = " + diff + "\nprofit % = " + (diff / cp * 100) 
            : "loss incurred \nloss = " + (-diff) + "\nloss % = " + ((-diff) / cp * 100);
        System.out.println(result);
        sc.close();
    }
}
