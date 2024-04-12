import java.util.Arrays;

public class Ex1Aula {
    public static void main(String[] args) {

        int[] vetor = {3, 5, 9, 11, 15, 17, 19, 6};
        int var = vetor.length-1;
        int aux = vetor[vetor.length-1];
        
        while ( var > 0 && vetor[var - 1] > aux) {
            vetor[var] = vetor[var-1];
            var--;
        }

        vetor[var] = aux;

        System.out.println(Arrays.toString(vetor));

    }
}
