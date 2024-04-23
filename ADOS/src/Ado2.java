import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ado2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome do arquivo: ");

        File arq = new File("./ADOS/Documentos/"+scan.nextLine());
        Scanner leitor = new Scanner(arq);
        String linhas = "";

        while (leitor.hasNextLine()) {
            linhas = leitor.nextLine();
        }
    }
}
