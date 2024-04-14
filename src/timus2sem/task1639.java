package timus2sem;

import java.util.Scanner;

public class task1639 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f = in.nextInt();
        int s = in.nextInt();

        if((f*s) % 2 != 0){
            System.out.println("[second]=:]");
        }else{
            System.out.println("[:=[first]");
        }
    }
}
