package module06;

public class exercise5_6 {
    public static void main(String[] args) {
        float marks = 98.0f;
        float attendance = 97.0f;
        boolean qualifies = (marks >= 90.0f) && (attendance >= 80.0f);
        String scholarship = qualifies ? "you are eligible for scholarship" : "you are not eligible for scholarship";
        System.out.println(scholarship);
    }
}
