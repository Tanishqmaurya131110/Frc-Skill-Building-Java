package module12;

public class exercise2_12 {
    public static void main(String[] args) {
        for (int count = 1; count <= 15; count++) {
            int oddNumber = 2 * count - 1;
            if (oddNumber % 5 == 0) {
                continue;
            }
            System.out.println(oddNumber);
        }
    }
}
