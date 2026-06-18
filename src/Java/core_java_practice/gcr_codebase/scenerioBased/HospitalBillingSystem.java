package Java.core_java_practice.gcr_codebase.scenerioBased;

import java.util.Scanner;

// Custom Exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {


    static void makePayment(double billAmount, double paidAmount)
            throws InsufficientFundsException {
        if (paidAmount < billAmount) {
            throw new InsufficientFundsException(
                    "Payment failed: Insufficient funds."
            );
        } else {
            System.out.println("Payment successful.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter total bill amount: ");
            double totalBill = Double.parseDouble(sc.nextLine());

            System.out.print("Enter number of items: ");
            int items = Integer.parseInt(sc.nextLine());


            double averageCost = totalBill / items;
            System.out.println("Average Cost per Item = " + averageCost);


            String[] patients = {"Amit", "Riya", "John"};
            System.out.print("Enter patient index (0-2): ");
            int index = Integer.parseInt(sc.nextLine());

            System.out.println("Patient: " + patients[index]);


            System.out.print("Enter payment amount: ");
            double payment = Double.parseDouble(sc.nextLine());

            makePayment(totalBill, payment);

        } catch (ArithmeticException e) {
            System.out.println("Error: Bill cannot be divided by zero items.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number entered.");
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
            System.out.println("Hospital billing process completed.");
        }
    }
}
