import java.util.*;

class IrrArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][];
        int i = 0, j, n = 0, temp = 0;
        for (i = 0; i < 4; i++) {
            System.out.print("Enter the number of elements in row " + (i + 1) + ": ");
            n = sc.nextInt();
            arr[i] = new int[n];
            if (n > temp)
                temp = n;
            for (j = 0; j < n; j++) {
                System.out.print("Enter element " + (j + 1) + ": ");
                arr[i][j] = sc.nextInt();
                System.out.println();
            }
        }
        System.out.println("The Irregular Array is:");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}