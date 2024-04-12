
import java.util.Random;

import java.util.*;

public class Aula2 {
    
    public static int[][] mudarMariz(int matriz[][]){
        int[][] matrizTranposta = new int[matriz[0].length][matriz.length];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matrizTranposta[j][i] = matriz[i][j];
            }   
        }

        return matrizTranposta;
    }
    
    public static void main(String[] args) {
        
        int[][] matriz = new int[3][2];
        Random rnd = new Random();

        for(int i = 0; i < matriz.length; i++){
            System.out.print("[");
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = rnd.nextInt(11);
                System.out.printf(" %2d ", matriz[i][j]);
            }
            System.out.println("]");
        }

        int[][] matrizT = mudarMariz(matriz);

        System.out.println("\nMatriz transposta: ");

        for(int i = 0; i < matrizT.length; i++){
            System.out.println(Arrays.toString(matrizT[i]));
        }

    }
}
