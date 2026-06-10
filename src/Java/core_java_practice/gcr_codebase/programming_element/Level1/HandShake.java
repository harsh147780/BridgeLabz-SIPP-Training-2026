package Java.core_java_practice.gcr_codebase.programming_element.Level1;

import java.util.Scanner;

public class HandShake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();

        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("Maximum number of handshakes is " + handshakes);
    }
}