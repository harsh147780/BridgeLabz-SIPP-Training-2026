package Java.core_java_practice.gcr_codebase.control_flow.Level1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num > 0) {
            long fact = 1;

            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }

            System.out.println("Factorial = " + fact);
        } else {
            System.out.println("Not a natural number");
        }
    }
}