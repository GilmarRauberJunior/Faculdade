import java.util.Scanner;

public class Lista3Ex1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String frase;

        int casos = scan.nextInt();

        while(casos > 0){
            frase = scan.nextLine();
            String[] palavra = frase.split(" ");

            for (int i = 0; i < palavra.length - 1; i++) {
                for (int j = 0; j < palavra.length - 1 - i; j++) {
                    if (palavra[j].compareTo(palavra[j+1]) > 0) {
                        String aux = palavra[j];
                        palavra[j] = palavra[j + 1];
                        palavra[j + 1] = aux;
                    }
                    System.out.printf("%s ", palavra[j]);
                }
            }

            casos --;
        }

        scan.close();

    }
}
