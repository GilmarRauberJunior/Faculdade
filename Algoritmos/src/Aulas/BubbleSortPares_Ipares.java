import java.util.Arrays;
import java.util.Random;

public class BubbleSortPares_Ipares {
    public static void main(String[] args) {
        
        Random rnd = new Random();
        int[] vetor = new int[20];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rnd.nextInt(101);
        }

        System.out.println(Arrays.toString(vetor));

        for (int i = 0; i < vetor.length - 1; i++) {
            //No for abaixo, o j faz o papel de não fazer comparaçãoes a mais para organizar o vetor
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if(vetor[j]%2 != 0){
                    int aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }

        System.out.println(Arrays.toString(vetor));

    }
}
