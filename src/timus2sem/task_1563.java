package timus2sem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task_1563 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<String> shops = new ArrayList<>();
        int repeatedShops = 0;
        for (int i = 0; i <= n ; i++){
            String shop = in.nextLine();
            if(shops.contains(shop)){
                repeatedShops++;
            }
            shops.add(shop);
        }
        System.out.println(repeatedShops);
    }
}
