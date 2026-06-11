package Java.core_java_practice.gcr_codebase.control_flow.Level1;

import java.util.Scanner;

public class FactorialByWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num > 0) {
            long fact = 1;
            int i = 1;

            while (i <= num) {
                fact = fact * i;
                i++;
            }

            System.out.println("Factorial = " + fact);
        } else {
            System.out.println("Not a natural number");
        }
    }
}