import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BuscaBinaria {

    public static int[] criarVetor(){
        Random rnd = new Random();
        int[] vetor = new int[100];
        
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = rnd.nextInt(101);
        }

        return vetor;
    }

    public static int buscaBinaria(int[] vetor, int valor){
        int inicio, meio, fim;
        inicio = 0;
        fim = vetor.length - 1;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;

            if(valor == vetor[meio]){
                return meio;
            }

            if(valor < vetor[meio]){
                fim = meio - 1;
            }else{
                inicio = meio + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[] vetor = criarVetor();
        Arrays.sort(vetor);
        System.out.println(Arrays.toString(vetor));        

        System.out.print("Digite um valor a ser procurado: ");
        int num  = scan.nextInt();

        int pos = buscaBinaria(vetor, num);
        
        if(pos >= 0){
            System.out.printf("Valor encontrado na posição %d.", pos);
        }else{
            System.out.println("Valor não encontrado.");
        }

        scan.close();
        
    }
}
