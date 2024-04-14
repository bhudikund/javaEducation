package timus2sem;

import java.util.Arrays;
import java.util.Scanner;

public class task_1025 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int result = 0;
        int[] array = new int[number];

        for(int i = 0; i < array.length; i++){
            array[i]= in.nextInt();
        }
        Arrays.sort(array);
        for(int i = 0; i<= array.length/2;i++){
            result += (array[i]/2) + 1;
        }
        System.out.println(result);
    }
}
