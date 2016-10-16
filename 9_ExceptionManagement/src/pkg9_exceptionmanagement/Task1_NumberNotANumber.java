package pkg9_exceptionmanagement;

import java.util.Scanner;

public class Task1_NumberNotANumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int i;
        while (!s.equals("END")) {
            try {
                i = Integer.parseInt(s);
                System.out.println("number");
            } catch (NumberFormatException ex) {
                System.out.println("not a number");
            }
            s = sc.nextLine();
        }

    }

}
