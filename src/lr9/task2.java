package lr9;

public class task2 {

    public static String toBinary(int number){

        if ( number == 0){
            return "";
        }
        return toBinary(number / 2) + (number % 2);
    }

    public static void main(String[] args) {
        int number = 3;
        //int lenght = 15;
        System.out.println(toBinary(number));
        //String binary = String.format("%0" + lenght + "d", Integer.valueOf(toBinary(number)));
                //System.out.println(binary);
    }
}
