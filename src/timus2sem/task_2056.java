package timus2sem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task_2056 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> marks = new ArrayList<>();

        for (int i = 0; i < n; i++){
            marks.add(in.nextInt());
        }

        double marksSum = 0;

        for (int i = 0; i< marks.size(); i++){
            marksSum += marks.get(i);
        }
        double marksAvg = marksSum / n;

        if( marks.contains(3)){
            System.out.println("None");
            return;
        }if (marksAvg < 4.5){
            System.out.println("Common");
        }if (marksAvg == 5.0){
            System.out.println("Named");
        }if (marksAvg >= 4.5 & marksAvg <= 4.9){
            System.out.println("High");
        }

    }
}
