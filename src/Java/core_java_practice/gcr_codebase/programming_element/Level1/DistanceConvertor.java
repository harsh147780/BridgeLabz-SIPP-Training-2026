package Java.core_java_practice.gcr_codebase.programming_element.Level1;
import java.util.Scanner;

public class DistanceConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double feet = sc.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println("Distance in yards is " + yards + " and miles is " + miles);
    }
}