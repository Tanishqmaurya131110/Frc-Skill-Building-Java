package module14;

public class exercise3_14 {
    public static void isPrime(int N) {
        if (N <= 1) {
            System.out.println(false);
            return;
        }
        boolean prime = true;
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                prime = false;
                break;
            }
        }
        System.out.println(prime);
    }

    public static void main(String[] args) {
        isPrime(7);
        isPrime(10);
    }
}
