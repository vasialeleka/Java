import java.util.Arrays;
import java.util.Random;

public class array {
    public static void main(String[] args) {
        System.out.println("Hello!");

        int[] array1 =new int[5];

        for (int i =0;i<array1.length;i++) {array1[i]= i+1;}

        int[] array2 = new int[5];

        for(int i=0;i<array1.length;i++){
            array2[i]= array1[i];
             array1[i]=0;
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));



    }
}
