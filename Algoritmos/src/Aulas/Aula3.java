import java.util.Random;

public class Aula3 {
    
    public static int acharMenorValor(int vetor[][]){
        
        int maior = 0;
        for(int i = 0; i < vetor.length; i++){
            System.out.print("[");
            for(int j = 0; j < vetor[i].length; j++){
                System.out.printf(" %2d ", vetor[i][j]);
                if(vetor[i][j] > maior){
                    maior = vetor[i][j];
                }
            }
            System.out.println("]");
        }

        return maior;
    }
    
    public static void main(String[] args) {
        
        Random rnd = new Random();

        int[][] vetor = new int[10][10];
        for(int i = 0; i < vetor.length; i++){
            for(int j = 0; j < vetor[i].length; j++){
                vetor[i][j] = rnd.nextInt(101);
            }
        }

        System.out.println("O maior valor é: "+acharMenorValor(vetor));

    }
}
