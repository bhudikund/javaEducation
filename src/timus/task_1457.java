package timus;

import java.util.Scanner;

public class task_1457 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int key = in.nextInt();
        float numbers = 0;
        for (int i = 0; i< key; i++){
            numbers += in.nextFloat();
        }
        float avg = numbers / key;
        System.out.println(numbers/key);
    }
}
