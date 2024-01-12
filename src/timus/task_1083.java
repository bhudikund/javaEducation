package timus;

import java.util.Scanner;

public class task_1083 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.next().length();
        int factorial = 1;
        while (n>0){
            factorial *= n;
            n -=k;
        }
        System.out.println(factorial);
    }
}
