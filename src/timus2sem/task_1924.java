package timus2sem;

import java.util.Scanner;

public class task_1924 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        if(number % 4 == 2|| number % 4 == 1){
            System.out.println("grimy");
        }else{
            System.out.println("black");
        }

    }
}
