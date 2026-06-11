package Java.core_java_practice.gcr_codebase.control_flow.Level2;

import java.util.*;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int power = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= power; i++) {
            result = result * num;
        }

        System.out.println(result);
    }
}
