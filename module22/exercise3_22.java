package module22;

import java.util.ArrayList;

public class exercise3_22 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C"};
        ArrayList<String> list = new ArrayList<>();
        for (String item : arr) {
            list.add(item);
        }
        System.out.println("Array list : " + list);
    }
}
