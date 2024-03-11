package lr9;

public class task2 {

    public static String toBinary(int number){

        if ( number == 0){
            return "";
        }
        return toBinary(number / 2) + (number % 2);
    }

    public static void main(String[] args) {
        int number = 4;
        System.out.println(toBinary(number));

    }
}
