import java.util.Scanner;

public class Lista1Ex2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = scan.nextInt();
            if(vetor[i] <= 0){
                vetor[i] = 1;
            }
        }

        for(int j = 0; j < vetor.length; j++){
            System.out.println("X["+j+"] = "+vetor[j]);
        }

        scan.close();

    }
}
