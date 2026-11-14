package module03;

public class exercise2_3 {
    public static void main(String[] args) {
        String headerName = "Name";
        String headerAge = "Age";
        String headerGrade = "Grade";

        String name1 = "Karan";
        int age1 = 14;
        char grade1 = 'A';

        String name2 = "Ananya";
        int age2 = 14;
        char grade2 = 'A';

        System.out.printf("%s\t%s\t%s\n", headerName, headerAge, headerGrade);
        System.out.printf("%s\t%d\t%c\n", name1, age1, grade1);
        System.out.printf("%s\t%d\t%c\n", name2, age2, grade2);
    }
}
