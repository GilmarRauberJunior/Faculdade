import java.util.*;

public class Aula6 {

    public static int[][] somarMatriz(int[][] a, int[][] b){
        int[][] c = new int[a.length][b[0].length];

        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c[i].length; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        return c;
    }

    public static void main(String[] args) {
        
        Random rnd = new Random();

        int[][] a = new int[4][4];
        int[][] b = new int[4][4];

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = rnd.nextInt(11);
                b[i][j] = rnd.nextInt(11);
            }
        }

        int[][] res = somarMatriz(a, b);

        for(int i = 0; i < res.length; i++){
            System.out.println(Arrays.toString(res[i]));
        }

    }
}
