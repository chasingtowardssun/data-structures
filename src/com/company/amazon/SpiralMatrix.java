package com.company.amazon;

public class SpiralMatrix {

    public static void main(String[] args) {

        int a[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        printSpiralMatrix(a);

        System.out.println("\n================================");
        a = new int[][]{{1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18}
        };

        printSpiralMatrix(a);
    }

    public static void printSpiralMatrix(int[][] arr) {
        int k = 0; // Start of Row
        int l = 0; // Start of Column
        int m = arr.length; // Total Rows
        int n = arr[0].length; // Total Cols
        int i = 0; // Simple Iterator

        while (k < m && l < n) {

            // Print 1st Row of the remaining rows
            for (i = l; i <= n - 1; i++) {
                System.out.print(arr[k][i] + ",");
            }
            k++; // First Row is traversed so increment the row

            // Print Last Column of the remaining cols
            for (i = k; i <= m - 1; i++) {
                System.out.print(arr[i][n - 1] + ",");
            }
            n--; // Last Col is traversed the decrement the total cols

            if (m > k) { // Only if some row left to be traversed

                // Print the Last Row of the remaining rows
                for (i = n - 1; i >= l; i--) {
                    System.out.print(arr[m - 1][i] + ",");
                }
                m--;
            }

            if (n > l) { // Only if some col left to be traversed

                // Print the first column of the
                for (i = m - 1; i >= k; i--) {
                    System.out.print(arr[i][l] + ",");
                }
                l++;
            }
        }
    }
}
