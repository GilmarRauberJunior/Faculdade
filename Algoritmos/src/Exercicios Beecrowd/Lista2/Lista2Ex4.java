import java.util.Scanner;

public class Lista2Ex4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[][] matriz = new double[12][12];
        String operacao = scan.next();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = scan.nextInt();
            }
        }

        switch(operacao){
            case "M" -> {
                double media = 0;
                
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz.length; j++) {
                        if (j > i && j > matriz.length - i - 1) {
                            media += matriz[i][j];
                        }
                    }
                }
                media /= 33;
                
                System.out.printf("%.1f", media);
            }
            
            case "S" -> {
                double soma = 0;
                
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz.length; j++) {
                        if (j > i && j > matriz.length - i - 1) {
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
