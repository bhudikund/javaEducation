package lr9;

import java.sql.SQLOutput;
import java.util.Scanner;

public class task3 {
    private static int arrayindex;
    private static int[] array;

    public static String fillArray(int i){
        Scanner in = new Scanner(System.in);
        if ( i < arrayindex){
            System.out.println("Введите " + i + " число: ");
            array[i]= in.nextInt();
            fillArray(i + 1);
        }
        return "";
    }
    public static String printArray(int i){
        if ( i < arrayindex){
            System.out.print(array[i] + " ");
            printArray(i + 1);
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        arrayindex = in.nextInt();
        array = new int[arrayindex];
        fillArray(0);
        printArray(0);
    }
}
