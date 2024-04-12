import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        
        Random rnd = new Random();

        int[] vetor = new int[20];
        int aux;

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = rnd.nextInt(101);
        }

        System.out.println(Arrays.toString(vetor));

        //Modo do jeito arcaico ruim e executa mais operaçãoes
        for(int i = 0; i < vetor.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < vetor.length; j++){
                if(vetor[j] < vetor[min]){
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }

        System.out.println(Arrays.toString(vetor));

        //Modo um pouco melhor que o anterior, ele executa menos passos que o anerior
        for(int i = 0; i < vetor.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < vetor.length; j++){
                if(vetor[j] < vetor[min]){
                    min = j;
                }
            }
            if(i != min){
                aux = vetor[i];
                vetor[i] = vetor[min];
                vetor[min] = aux;
            }
        }

        System.out.println(Arrays.toString(vetor));

    }
}
