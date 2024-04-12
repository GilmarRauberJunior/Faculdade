import java.util.Scanner;
import java.util.Random;

public class Lista1Ex4 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        double[] array = new double[100];

        for(int i = 0; i < array.length; i++){
            array[i] = rnd.nextDouble();
            if(array[i] <= 10){
                System.out.printf("A[%d] = %.1f%n", i, array[i]);
            }
        }

        scan.close();

    }
}
