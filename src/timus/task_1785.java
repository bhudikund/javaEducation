package timus;

import java.util.Scanner;

public class task_1785 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String word = monsterWord(n);
        System.out.println(word);
    }

    public static String monsterWord(int n){
        if (n >= 1 && n <= 4) {
            return "few";
        } else if (n >= 5 && n <= 9) {
            return "several";
        } else if (n >= 10 && n <= 19) {
            return "pack";
        } else if (n >= 20 && n <= 49) {
            return "lots";
        } else if (n >= 50 && n <= 99) {
            return "horde";
        } else if (n >= 100 && n <= 249) {
            return "throng";
        } else if (n >= 250 && n <= 499) {
            return "swarm";
        } else if (n >= 500 && n <= 999) {
            return "zounds";
        } else if (n >= 1000) {
            return "legion";
        } else {
            return "";
        }
    }

}



