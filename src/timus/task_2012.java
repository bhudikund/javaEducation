package timus;

import java.util.Scanner;

public class task_2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int doneTasks = in.nextInt();
        boolean getAnswer;
        int numberOfTasks = 12;
        int remainingTasks = numberOfTasks - doneTasks;
        int remainingTime = 240 - (remainingTasks* 45);

        if ( remainingTime >=0){
            getAnswer = true;
            System.out.println("YES");
        }
        else{
            getAnswer = false;
            System.out.println("NO");
        }

    }
}
