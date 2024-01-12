package timus;

import java.util.Scanner;

public class task_1313 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int tmp = 0;
        int[][] matrix = new int[s][s];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = in.nextInt();

            }
        }
        for (int i = 0; i < s; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print(matrix[j][i-j] + " ");
            }
        }

        for (int i = 1; i < s; i++) {
           for (int j = s -1; j >= i; j--) {
               System.out.print(matrix[j][s - j + i -1] + " ");
            }
        }


    }

}