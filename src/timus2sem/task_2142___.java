package timus2sem;

import java.util.Scanner;

public class task_2142___ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long lands[] = new long[3];
        long mana[] = new long[3];
        long landA = 0;
        long landB = 0;

        for(int i = 0; i < lands.length; i++){
            lands[i] = in.nextInt();
        }
        for(int i = 0; i < mana.length; i++){
            mana[i] = in.nextInt();
        }

        if (mana[0] > lands[0])
        {
            if (mana[2] >= (mana[0] - lands[0]))
            {
                lands[2] -= (mana[0] - lands[2]);
            } else {
                System.out.println("There are no miracles in life");
                return;
            }
        } else if (mana[0] < lands[0]) landA = lands[0] - mana[0];



        if (mana[1] > lands[1])
        {
            if (lands[2] >= (lands[1] - mana[1])) lands[2] -= (lands[1] - mana[1]);
            else {
                System.out.println("There are no miracles in life");
                return;
            }
        } else if (mana[1] < lands[1]) {
            landB = lands[1] - mana[1];
        }

        if (mana[2] <= (lands[2] + landA + landB))
        {
            System.out.println("It is a kind of magic");
        }
        else {
            System.out.println("There are no miracles in life");
        }

    }
}
