import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class QtdOcorrencia {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        
        Scanner scan = new Scanner(System.in);

        int qtdOcorrencia = 0;

        System.out.print("Digite uma letra: ");
        String letra = scan.next();

        File arq = new File("./Algoritmos/Documentos/arquivo.txt");
        Scanner leitor = new Scanner(arq);
        String linha;

        while(leitor.hasNextLine()){
            linha = leitor.nextLine();
            for(int i = 0; i < linha.length(); i++){
                if(letra.equals(linha.charAt(i))){
                    qtdOcorrencia++;
                }
            }
        }

        System.out.printf("A quantidade de %s no arquivo.txt é: %d", letra, qtdOcorrencia);
        leitor.close();
        scan.close();
    }
}
