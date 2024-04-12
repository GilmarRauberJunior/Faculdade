import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class ArquivosEmJava {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner scan = new Scanner(System.in);

        //Pedindo ao usuário o nome do arquivo
        System.out.print("Digite o nome do arquivo: ");

        File arq = new File("./Algoritmos/Documentos/"+scan.nextLine());
        Scanner leitor = new Scanner(arq);
        String linhas = "";

        while (leitor.hasNextLine()) {
            linhas = leitor.nextLine();
            if(!linhas.startsWith("//")){
                System.out.println(linhas);
            }
        }

        leitor.close();
        scan.close();

    }
}
