package Java.core_java_practice.gcr_codebase.scenerioBased;

import java.util.Scanner;

public class TaxSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] incomes = new double[10];
        double totalTax = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter income of citizen " + (i + 1) + ": ");
            incomes[i] = sc.nextDouble();

            double tax;
            String bracket;

            if (incomes[i] < 10000) {
                tax = incomes[i] * 0.05;
                bracket = "5%";
            } else if (incomes[i] <= 50000) {
                tax = incomes[i] * 0.15;
                bracket = "15%";
            } else {
                tax = incomes[i] * 0.30;
                bracket = "30%";
            }

            System.out.println("Tax Bracket: " + bracket);
            System.out.println("Tax Amount: " + tax);
            System.out.println();

            totalTax += tax;
        }

        System.out.println("Total Tax Collected = " + totalTax);

    }
}