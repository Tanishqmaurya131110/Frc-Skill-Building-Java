package module16;

import java.util.Scanner;

public class exercise4_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a word: ");
        String word = sc.next();
        int half = word.length() / 2;
        System.out.print(word.substring(0, half).toUpperCase());
        System.out.println(word.substring(half).toLowerCase());
        sc.close();
    }
}
