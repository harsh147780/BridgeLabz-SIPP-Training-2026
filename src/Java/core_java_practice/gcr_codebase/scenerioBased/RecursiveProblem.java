package Java.core_java_practice.gcr_codebase.scenerioBased;

import java.util.Scanner;

public class RecursiveProblem {

    static int moveCount = 0;

    static void towerOfHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            moveCount++;
            return;
        }

        towerOfHanoi(n - 1, source, destination, auxiliary);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        moveCount++;
        towerOfHanoi(n - 1, auxiliary, source, destination);
    }

    static int binarySearch(int[] arr, int low, int high, int key) {
        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == key)
            return mid;
        else if (key < arr[mid])
            return binarySearch(arr, low, mid - 1, key);
        else
            return binarySearch(arr, mid + 1, high, key);
    }

    static int sumOfDigits(int n) {
        if (n == 0)
            return 0;

        return (n % 10) + sumOfDigits(n / 10);
    }

    static void reverseString(String str) {
        if (str.isEmpty())
            return;

        reverseString(str.substring(1));
        System.out.print(str.charAt(0));
    }

    static boolean checkBalanced(String str, int index, int count) {
        if (count < 0)
            return false;

        if (index == str.length())
            return count == 0;

        char ch = str.charAt(index);

        if (ch == '(')
            return checkBalanced(str, index + 1, count + 1);
        else if (ch == ')')
            return checkBalanced(str, index + 1, count - 1);
        else
            return checkBalanced(str, index + 1, count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();

        System.out.println("Tower of Hanoi Moves:");
        towerOfHanoi(n, 'A', 'B', 'C');
        System.out.println("Total Moves = " + moveCount);

        int[] prices = {10, 20, 30, 40, 50, 60, 70};

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int result = binarySearch(prices, 0, prices.length - 1, key);

        if (result != -1)
            System.out.println("Element found at index " + result);
        else
            System.out.println("Element not found.");

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Sum of digits = " + sumOfDigits(num));

        sc.nextLine();

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Reversed string: ");
        reverseString(str);
        System.out.println();

        System.out.print("Enter parentheses expression: ");
        String exp = sc.nextLine();

        if (checkBalanced(exp, 0, 0))
            System.out.println("Balanced Parentheses");
        else
            System.out.println("Not Balanced");

        sc.close();
    }
}
