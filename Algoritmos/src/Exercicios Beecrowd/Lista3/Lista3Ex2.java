import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lista3Ex2 {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader scan = new BufferedReader(ir);
        
        String[] numeros = scan.readLine().split(" ");
        int qtdAluno = Integer.parseInt(numeros[0]);
        int sorteado = Integer.parseInt(numeros[1]);

        String[] alunos = new String[qtdAluno];
        for(int i = 0; i < qtdAluno; i++){
            alunos[i] = scan.readLine();
        }

        Arrays.sort(alunos);

        System.out.printf("%S%n", alunos[sorteado - 1]);

    }
}
