import java.util.Scanner;

public class Lista1Ex3 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[] array = new int[10];
        int valor = scan.nextInt();

        for(int i = 0; i < array.length; i++){
            array[i] = valor;
            System.out.println("X["+i+"] = "+array[i]);
            valor *= 2;
        }

        scan.close();

    }
}
