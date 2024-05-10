import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        Random rnd = new Random();

        int[] vetor = new int[20];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rnd.nextInt(11);
        }

        System.out.println(Arrays.toString(vetor));

        int pos = particao(vetor, 0, vetor.length - 1);

        System.out.printf("%nA posição é: %d%n", pos);
        System.out.println(Arrays.toString(vetor));

        quickSort(vetor, 0, vetor.length - 1);
        System.out.println("\nUsando QuickSort:");
        System.out.println(Arrays.toString(vetor));

        
    }

    public static void quickSort(int[] vetor, int p, int r) {
        if (p < r) {
            int c = particao(vetor, p, r);
            quickSort(vetor, p, c - 1);
            quickSort(vetor, c + 1, r);
        }
    }

    public static int particao(int[] vetor, int p, int r){
        int c = vetor[p];
        int i = p + 1;
        int j = r;
        int aux;

        while (i <= j) {
            if (vetor[i] <= c) i++;
            else if (vetor[j] > c) j--;
            else {
                aux = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = aux;

                i++;
                j--;
            }
        }

        
        vetor[0] = vetor[j];
        vetor[j] = c;

        return j;
    }
}
