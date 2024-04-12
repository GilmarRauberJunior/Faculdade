import java.util.*;

public class Aula5 {

    public static boolean verificarMatriz(int matriz[][]){
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                if(matriz[i][j] != matriz[j][i]){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        
        Random rnd = new Random();
        int[][] matriz = new int[4][4];

        for(int i = 0; i < matriz.length; i++){
            System.out.print("[");
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = rnd.nextInt(101);
                System.out.printf(" %2d ", matriz[i][j]);
            }
            System.out.println("]");
        }

        if(verificarMatriz(matriz)){
            System.out.println("É simétrica");
        }else{
            System.out.println("Não é simétrica");
        }

    }
}
