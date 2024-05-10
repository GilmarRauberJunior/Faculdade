import java.util.Arrays;
import java.util.Random;

public class Particao {
    public static void main(String[] args) {
        Random rnd = new Random();

        int[] vetor = new int[15];

        //Criando o vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rnd.nextInt(11);
        }

        System.out.println(Arrays.toString(vetor));

        //Executando e quardando o valor retrnado da função
        int pos = organizador(vetor);

        System.out.printf("%n%nA posição é: %d%n", pos);
        System.out.println(Arrays.toString(vetor));
    }

    public static int organizador(int[] vetor){
        int num = vetor[0];
        int i = 1;
        int j = vetor.length-1;
        int aux;

        //Executando a partição
        while (i <= j) {

            //Quando o valor de vetor[i] for menor ou igual que num a função irá icrementar o i
            if (vetor[i] <= num) i++;
            //Quando o valor de vetor[j] for maior que num a função irá decrementar o j
            else if (vetor[j] > num) j--;
            //Caso não ocorra nenhuma das opções anteriores será feita a substuição dos valores 
            else {
                aux = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = aux;
                i++;
                j--;
            }
        }

        vetor[0] = vetor[j];
        vetor[j] = num;

        return j;
    }

}
