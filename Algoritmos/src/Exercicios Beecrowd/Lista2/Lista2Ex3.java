import java.util.*;

public class Lista2Ex3 {
    public static void main(String[] args) {
        
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);

        int[][] matriz = new int[12][12];

        String operacao = scan.next();

        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rnd.nextInt(11);
            }
        }

        switch(operacao){
            case "M" -> {
                double media = 0;
                
                for(int i = 0; i < matriz.length; i++){
                    for(int j = i + 1; j < matriz[i].length; j++){
                        media = media + matriz[i][j];
                    }
                }
                media /= 66;
                
                System.out.printf("%.1f", media);
            }
            
            case "S" -> {
                double soma = 0;
                
                for(int i = 0; i < matriz.length; i++){
                    for(int j = 0; j < matriz[i].length; j++){
                        soma += matriz[i][j];
                    }
                }
                
                System.out.printf("%.1f", soma);
            }
        }
        
        scan.close();

    }
}
