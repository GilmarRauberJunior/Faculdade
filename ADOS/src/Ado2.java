import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ado2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int contPalavra = 0;
        
        //Scanner scan = new Scanner(System.in);

        //System.out.print("Digite o nome do arquivo: ");

        File arq = new File("./ADOS/Documentos/texto.txt");
        Scanner leitor = new Scanner(arq);
        String linhas = "";

        while (leitor.hasNextLine()) {
            linhas = leitor.nextLine();
            String palavras = linhas.toLowerCase();
            String[] dicionario = linhas.split(" ");
        }

        System.out.printf("A quantidade de palavras adicionadas é : %s", contPalavra);
    }
}
