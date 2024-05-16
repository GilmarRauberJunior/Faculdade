import java.util.Scanner;

public class Lista1Ex6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] vetorPar = new int[5];
        int[] vetorImpar = new int[5];
        int numero, k = 0, l = 0;

        for(int i = 0; i < 15; i++){
            numero = scan.nextInt();
            if(numero%2 == 0){
                vetorPar[k] = numero;
                k++;
                if (k == 5) {
                    k = 0;
                    for(int j = 0; j < 5; j++){
                        System.out.printf("par [%d] = %d%n", j, vetorPar[j]);
                    }
                }
            }else{
                vetorImpar[l] = numero;
                l++;
                if(l == 5){
                    l = 0;
                    for(int m = 0; m < 5; m++){
                        System.out.printf("impar [%d] = %d%n", m, vetorImpar[m]);
                    }
                }
            }
        }

        for (int i = 0; i < l; i++){
            System.out.printf("impar [%d] = %d%n", i, vetorImpar[i]);
        }
      
        for (int i = 0; i < k; i++){
            System.out.printf("par [%d] = %d%n", i, vetorPar[i]);
        }

        scan.close();

    }
}
