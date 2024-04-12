import java.util.*;

public class Lista2Ex2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double[][] matriz = new double[12][12];
                
        int coluna = scan.nextInt();
        String operacao = scan.nextLine();
        
        for(int i = 0; i < matriz.length; i ++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = scan.nextDouble();
            }
        }
        
        switch(operacao){
            case "M" -> {
                double media = 0;
                
                for(int i = 0; i < matriz.length; i++){
                    for(int j = 0; j < matriz[i].length; j++){
                        if(j == coluna){
                            media += matriz[i][j];
                        }
                    }
                }
                media /= 12;
                
                System.out.printf("%.1f", media);
            }
            
            case "S" -> {
                double soma = 0;
                
                for(int i = 0; i < matriz.length; i++){
                    for(int j = 0; j < matriz[i].length; j++){
                        if(j == coluna){
                            soma += matriz[i][j];
                        }
                    }
                }
                
                System.out.printf("%.1f", soma);
            }
        }
        
        scan.close();
 

    }
}
