import java.util.*;

public class Lista1Ex1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] x = new int[n];
        int pos = 0;
        for(int i = 0; i < n; i++){
            x[i] = scan.nextInt();           
        }
        int menor = x[0];
        for(int i = 0; i < n; i++){
            if(x[i] < menor){
                menor = x[i];
                pos = i;
            }
        }
        System.out.printf("Menor valor: %d%nPosição: %d",menor, pos);
        scan.close();
    }

}
