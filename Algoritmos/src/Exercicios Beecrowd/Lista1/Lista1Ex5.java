import java.util.*;

public class Lista1Ex5{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        int[] vetor = new int[20];
        int mudar = 0;

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = rnd.nextInt(11);
            System.out.printf("N[%d] = %d%n", i, vetor[i]);
        }
        System.out.println("\n\n\n\n");
        for(int j = 0; j < 10; j++){
            mudar = vetor[(19 - j)];
            vetor[(19 - j)] = vetor[j];
            vetor[j] = mudar;
        }

        for(int k = 0; k < vetor.length; k++){
            System.out.printf("N[%d] = %d%n", k, vetor[k]);
        }

        scan.close();

    }
}