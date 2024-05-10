import java.util.Random;
import java.util.Scanner;

public class Lista2Ex4 {
    public static void main(String[] args) {
        
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);

        double[][] matriz = new double[12][12];
        //String operacao = scan.next();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rnd.nextInt(101);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (j > i && j > matriz.length - i - 1) {
                }
            }
        }

        scan.close();

    }
}
