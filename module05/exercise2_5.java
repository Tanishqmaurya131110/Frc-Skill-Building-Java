package module05;

public class exercise2_5 {
    public static void main(String[] args) {
        float CP1 = 1000.0f;
        float SP1 = CP1 * (1.0f - 0.10f);
        float CP2 = 1000.0f;
        float SP2 = CP2 * (1.0f + 0.20f);

        float totalCost = CP1 + CP2;
        float totalSelling = SP1 + SP2;
        float profitnet = totalSelling - totalCost;
        System.out.printf("net profit is : %f\n", profitnet);
    }
}
