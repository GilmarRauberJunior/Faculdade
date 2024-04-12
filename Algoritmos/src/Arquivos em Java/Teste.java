import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Teste {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        //Criando o arquivo a ser lido
        FileReader arq = new FileReader("entrada.txt");
        //Criando o Buffer que irá ler o arquivo desejado
        BufferedReader leBufferizado = new BufferedReader(arq);
        String linha;
        //Lendo o arquivo dejesado usando uma estrutura de repetição
        while((linha = leBufferizado.readLine()) != null){
            System.out.println(linha);
        }
        leBufferizado.close();

    }
}
