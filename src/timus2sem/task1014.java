package timus2sem;

import java.util.Scanner;

public class task1014 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        String result = "";
        if (number == 0){
            System.out.println(10);
        } else if ( number == 1) {
            System.out.println(number);
        }else {
            int i = 9;
            while (i >= 2) {
                while (number % i == 0) {
                    result += Integer.toString(i);
                    number /= i;
                }
                i--;
            }
            if (number == 1) {
                System.out.println(new StringBuilder(result).reverse());
            } else {
                System.out.println(-1);
            }
        }
    }
}
