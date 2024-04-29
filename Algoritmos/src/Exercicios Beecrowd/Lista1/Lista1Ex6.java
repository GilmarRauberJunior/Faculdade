import java.util.Random;

public class Lista1Ex6 {
    public static void main(String[] args) {
        
        Random rnd = new Random();
        int[] vetorPar = new int[5];
        int[] vetorImpar = new int[5];
        int numero = 0;

        for(int i = 0; i < 15; i++){
            numero = rnd.nextInt(11);
            if(numero%2 == 0 && (numero > 1 || numero < -1)){
                vetorPar[i] = numero;
                System.out.printf("par[%d] = %d%n", i, vetorPar[i]);
            }else if(numero != 0){
                vetorImpar[i] = numero;
                System.out.printf("impar[%d] = %d%n", i, vetorImpar[i]);
            }    
        }

    }
}
