package lr9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class task6 {

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1,"One");
        hm.put(0,"Two");
        hm.put(3,"Three");
        hm.put(4,"Four");
        hm.put(5,"Five");
        hm.put(6,"Six");
        hm.put(7,"Sevenn");
        hm.put(8,"Eightn");
        hm.put(9,"Nine");
        hm.put(10,"Ten");

        Set<HashMap.Entry<Integer, String>> set = hm.entrySet();
        StringBuilder zeroKey = new StringBuilder();
        HashMap<Integer, String> aboveFive = new HashMap<>();
        int aboveFiveX = 1;
        for (Map.Entry<Integer, String> me : set) {
            if (me.getKey() > 5) {
                aboveFive.put(me.getKey() * me.getValue().length(), me.getValue());
            } else if (me.getKey() == 0) {
                for (Map.Entry<Integer, String> e : set) {
                    zeroKey.append(e.getValue()).append(", ");
                }
            }

            if (me.getValue().length() > 5){
                aboveFiveX *= me.getKey();
            }
        }
        System.out.println("Строки, ключ у которых больше 5: " + aboveFive);
        System.out.println("Значения начиная с ключа 0:" + zeroKey.toString());
        System.out.println("Перемноженные ключи: " + aboveFiveX);
    }
}
