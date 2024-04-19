import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        
        Random rnd = new Random();

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(101);
        }

        System.out.println(Arrays.toString(array));
        
        for (int i = 1; i < array.length; i++) {
            int j = i;
            int x = array[j];
            while (j > 0 && x < array[j-1]) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = x;
        }

        System.out.println(Arrays.toString(array));

    }
}
