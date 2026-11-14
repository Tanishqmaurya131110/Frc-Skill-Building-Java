package module15;

public class exercise3_15 {
    public void sumOfDigits(int n) {
        int val = Math.abs(n);
        int total = 0;
        while (val > 0) {
            total += (val % 10);
            val /= 10;
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        exercise3_15 sod = new exercise3_15();
        sod.sumOfDigits(67);
    }
}
