import java.util.*;

public class Lista2Ex3 {
    public static void main(String[] args) {
        
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);

        int[][] matriz = new int[12][12];

        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rnd.nextInt(11);
            }
        }

        for(int i = 0; i < matriz.length; i++){
            System.out.print("[");
            for (int j = 0; j < matriz[i].length; j++) {
                if(j > i){
                    System.out.printf("%3d", matriz[i][j]);
                }
            }
            System.out.println("]");
        }

        scan.close();

    }
}
