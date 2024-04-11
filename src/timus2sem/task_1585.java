package timus2sem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task_1585 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<String> penguins = new ArrayList<>();
        int m = 0,l = 0,e = 0;
        for (int i = 0; i <= n ; i++){
            String penguin = in.nextLine();
            if(penguin.equals("Macaroni Penguin")){
                m++;
            }if(penguin.equals("Little Penguin")){
                l++;
            }if (penguin.equals("Emperor Penguin")){
                e++;
            }
            penguins.add(penguin);
        }

        if( (m > l) & (m > e) ){
            System.out.println("Macaroni Penguin");
        }if( (l > m) & (l > e) ){
            System.out.println("Little Penguin");
        }if ( (e > m) & (e > l) ){
            System.out.println("Emperor Penguin");
        }
    }
}
