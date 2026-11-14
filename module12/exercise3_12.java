package module12;

public class exercise3_12 {
    public static void main(String[] args) {
        for (int num = 1; num <= 10; num++) {
            if (num % 2 == 0) {
                continue;
            }
            System.out.println(num);
        }
    }
}
