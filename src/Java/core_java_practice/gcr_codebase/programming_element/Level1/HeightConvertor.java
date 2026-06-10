package Java.core_java_practice.gcr_codebase.programming_element.Level1;

import java.util.Scanner;

public class HeightConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cm = sc.nextDouble();

        double totalInches = cm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.println("Your Height in cm is " + cm + " while in feet is " + feet + " and inches is " + inches);
    }
}