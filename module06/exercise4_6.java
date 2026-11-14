package module06;

public class exercise4_6 {
    public static void main(String[] args) {
        int a = 6;
        int b = 10;
        int c = 8;

        int max = Math.max(a, Math.max(b, c));
        int sumOfSquares = a * a + b * b + c * c;
        int maxSquare = max * max;

        String pytriplet = (maxSquare == sumOfSquares - maxSquare) ? "these are a Pythagorean triplet" : "these are not a Pythagorean triplet";
        System.out.println(pytriplet);
    }
}
