import java.util.*;

public class Lista2Ex1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);;
        Random rnd = new Random();
        double[][] matriz = new double[12][12];
        
        int linha = scan.nextInt();
        String operacao = scan.next();
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = rnd.nextDouble();
            }
        }
        
        switch (operacao){
            case "M" ->{
                double media = 0;
                for(int i = 0; i < matriz.length; i++){
                    for(int j = 0; j < matriz[i].length; j++){
                        if(i == linha){
                            media += matriz[i][j];
                        }
                    }
                }
                media /= matriz.length;
                
                System.out.printf("%.1f", media);
            }
            case "S" ->{
                double soma = 0;
                for(int i = 0; i < matriz.length; i++){
                    for(int j = 0; j < matriz[i].length; j++){
                        if(i == linha){
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
