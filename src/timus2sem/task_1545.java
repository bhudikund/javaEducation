package timus2sem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task_1545 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        List<String> array = new ArrayList<>();

        System.out.println();

        for(int i =0; i< number ;i++){
            array.add(in.next());
        }

        String letter = in.next();

        for (String i : array){
            if(i.charAt(0) == letter.charAt(0)){
                System.out.println(i);
            }
        }
    }
}
