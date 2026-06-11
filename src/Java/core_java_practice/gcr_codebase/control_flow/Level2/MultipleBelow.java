package Java.core_java_practice.gcr_codebase.control_flow.Level2;

import java.util.*;

public class MultipleBelow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = num; i < 100; i += num) {
            System.out.println(i);
        }
    }
}