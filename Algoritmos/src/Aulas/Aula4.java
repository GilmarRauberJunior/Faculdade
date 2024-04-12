import java.util.*;

public class Aula4 {

    public static int somarTracoMatriz(int matriz[][]){
        int soma = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(i == j){
                    soma += matriz[i][j];
                }
            }
        }

        return soma;
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        
        int linhas = 0, colunas = 0;

        System.out.print("Digite a qtd. de linhas: ");
        linhas = scan.nextInt();
        System.out.print("Digite a qtd. de colunas: ");
        colunas = scan.nextInt();
        if(colunas != linhas){
            do{
                System.out.println("A matriz deve ser quadrada, insira o valor novamente.");
                System.out.print("Digite a qtd. de colunas: ");
                colunas = scan.nextInt();
            }while(colunas != linhas);
        }
        int[][] matriz = new int[linhas][colunas];

        for(int i = 0; i < matriz.length; i++){
            System.out.print("[");
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = rnd.nextInt(101);
                System.out.printf(" %2d" , matriz[i][j]);
            }
            System.out.println("]");
        }

        System.out.println("A soma do traço é: "+somarTracoMatriz(matriz));

        scan.close();

    }
}