package lr9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Для того чтобы вывести ArrayList нажмите 1, чтобы вывести LinkedList нажмите 2");
        int number = in.nextInt();
        switch (number) {
            case (1):
                ArrayList<Integer> humanCircleArrayList = new ArrayList<>();
                for (int i = 1; i <= 10; i++) {
                    humanCircleArrayList.add(i);
                }
                int indexAl = 0;
                int secondRemoveAl = 2;
                while (humanCircleArrayList.size() > 1) {
                    indexAl = (indexAl + secondRemoveAl - 1) % humanCircleArrayList.size();
                    humanCircleArrayList.remove(indexAl);
                }
                System.out.println(humanCircleArrayList);
                break;
            case (2):
                LinkedList<Integer> humanCircleLinkedList = new LinkedList<>();
                for (int i = 1; i <= 10; i++) {
                    humanCircleLinkedList.add(i);
                }
                int indexLl = 0;
                int secondRemoveLl = 2;
                while (humanCircleLinkedList.size() > 1) {
                    indexLl = (indexLl + secondRemoveLl - 1) % humanCircleLinkedList.size();
                    humanCircleLinkedList.remove(indexLl);
                }
                System.out.println(humanCircleLinkedList);
                break;
        }
    }
}
