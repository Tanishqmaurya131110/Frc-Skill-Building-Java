package module08;

import java.util.Scanner;

public class exercise2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userlogin = "FRC12364";
        String passlogin = "password123";

        System.out.print("enter username : ");
        String user = sc.nextLine();
        System.out.print("enter password : ");
        String pass = sc.nextLine();

        boolean userMatches = user.equals(userlogin);
        boolean passMatches = pass.equals(passlogin);

        if (userMatches && passMatches) {
            System.out.println("login successful");
        } else if (userMatches && !passMatches) {
            System.out.println("incorrect password");
        } else if (!userMatches && passMatches) {
            System.out.println("incorrect username");
        } else {
            System.out.println("incorrect credentials");
        }

        sc.close();
    }
}
