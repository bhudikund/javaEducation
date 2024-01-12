package timus;

import java.util.Scanner;

public class task_1068 {


    public static int summ(int number){
        int sum = 0;
        if (number > 0){
            for (int i = 1; i<= number; i++ ){
                sum += i;
            }
        }
        else
        {
            for (int i = 1; i>= number; i--){
                sum += i;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int sum = summ(number);
        System.out.println(sum);
    }
}
