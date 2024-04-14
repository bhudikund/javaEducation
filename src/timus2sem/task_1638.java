package timus2sem;

import java.util.Scanner;

public class task_1638 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int widthTome = in.nextInt();
        int widthPage = in.nextInt();
        int firstPage = in.nextInt();
        int lastPage = in.nextInt();

        if (lastPage > firstPage){
            System.out.println((lastPage - firstPage - 1) * widthTome + (lastPage - firstPage) * 2 * widthPage);
        }
        if (firstPage > lastPage){
            System.out.println((firstPage - lastPage + 1) * widthTome + (firstPage - lastPage) * 2 * widthPage);
        }
    }
}
