package Java.core_java_practice.gcr_codebase.scenerioBased;

import java.util.*;

public class WareHouseStore {

    public static int[] rotateArray(int[] arr, int k,int n) {

        k = k % n;

        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }

        return rotated;
    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items : ");
        int n = sc.nextInt();

        System.out.println("Enter the quantities of items");
        int items[] = new int[n];
        for(int i = 0; i < n; i++){
            items[i] = sc.nextInt();
        }

        int max = 0;
        int min = items[0];
        int totalStock=0;
        for(int i = 0; i < n; i++){
            totalStock +=items[i];
            if(items[i]>max){
                max = items[i];
            }
            if(items[i]<min){
                min = items[i];
            }
        }
        System.out.println("Max Stock is: "+ max);
        System.out.println("Min Stock is: "+min);
        System.out.println("Total Stock is : "+ totalStock);

        boolean isContainDuplicate = false;
        Arrays.sort(items);
        for(int i=1;i<n;i++){
            if(items[i-1] == items[i]){
                isContainDuplicate = true;
                break;
            }
        }
        System.out.println("Contains Duplicate:" + isContainDuplicate);


        //For Arrays Rotated

        System.out.print("Enter the kth position of rotation : ");
        int k = sc.nextInt();
        int[] rotated = rotateArray(items, k,n);

        System.out.println("Rotated Array: " + Arrays.toString(rotated));


        int[][] shelfGrid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] transposed = transpose(shelfGrid);

        System.out.println("Transposed array: ");
        for (int[] row : transposed) {
            System.out.println(Arrays.toString(row));
        }
    }
}
