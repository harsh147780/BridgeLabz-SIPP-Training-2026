package Java.core_java_practice.gcr_codebase.control_flow.Level1;

import java.util.*;

public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 5 == 0) {
            System.out.println("Is the number " + num + " divisible by 5? true");
        } else {
            System.out.println("Is the number " + num + " divisible by 5? false");
        }
    }
}