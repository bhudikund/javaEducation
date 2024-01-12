package timus;

import java.util.Objects;
import java.util.Scanner;

public class task_1585 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = 0,e = 0,l= 0, maxValue=0;
        int n = in.nextInt();
        String max;
        String[] names = new String[n];
        for (int i = 0; i < names.length; i++) {
            names[i]= in.nextLine();
            if (Objects.equals(names[i], "Emperor Penguin")) {
                e += 1;
            }
            if (Objects.equals(names[i], "Little Penguin")) {
                l += 1;
            }
            if (Objects.equals(names[i], "Macaroni Penguin")) {
                m += 1;
            }
        }
            if (e > l) {
                maxValue = e;
                max = "Emperor Penguin";
                }
                else {
                    maxValue = l;
                max="Little Penguin";
                }
                if (m>maxValue) {
                    maxValue=m;
                    max="Macaroni Penguin";
                }
        System.out.println(max);
        System.out.println(names[0]);
    }
}
