import java.util.*;

public class Aula1 {
    
    public static int[][] gerarMatriz(int linhas, int colunas){
        
        int vetor[][] = new int[linhas][colunas];
        
        for(int i = 0; i < vetor.length; i++){
            for(int j = 0; j < vetor[i].length; j++){
                vetor[i][j] = (int) (Math.random()*100);
            }
        }

        return vetor;

    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de colunas: ");
        int col = scan.nextInt();
        System.out.print("Digite a quantidade de linhas: ");
        int linha = scan.nextInt();
        int[][] vetor = gerarMatriz(linha, col);

        for(int i = 0; i < vetor.length; i++){
            System.out.print("[ ");
            for(int j = 0; j < vetor[i].length; j++){
                System.out.printf(" %2d ", vetor[i][j]);
            }
            System.out.println(" ]\n");
        }

        scan.close();

    }
}
