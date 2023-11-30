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
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix.length; k++) {
                    for (int l = 0; l < matrix[k].length; l++) {
                        if (matrix[i][j] <= matrix[k][l]) {
                            tmp = matrix[i][j];
                            matrix[i][j] = matrix[k][l];
                            matrix[k][l] = tmp;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix.length; j++) {
               System.out.print(matrix[i][j] + " ");
            }
        }


    }

}