package lr6;

public class task6 {

    public static int[] getArray(int[] array, int k){
        if ( k > array.length){
            int[] copy= new int[array.length];
            System.arraycopy(array,0,copy,0,array.length);
            return copy;
        }
        else{
            int[] newArray = new int[k];
            for (int i = 0; i<k;i++){
                newArray[i]= array[i];
            }
            return newArray;
        }

    }

    public static void main(String[] args) {


    }
}
