package timus;

import java.util.Scanner;

public class task_1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int L = in.nextInt();
        int all = H + L - 1;
        int notShotH = all - H;
        int notShotL = all - L;
        System.out.println(notShotH + " "+ notShotL);
    }
}
