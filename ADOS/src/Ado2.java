/*
Entrega a Atividade 2 - Algoritmos e Programação II

Eu,

Gilmar Rauber Junior

declaro que

todas as respostas contidas nesse trabalho são fruto de esforço próprio,
não copiei respostas de colegas externos à equipe,
não disponibilizei minhas respostas para colegas externos ao grupo e
não realizai quaisquer outras atividades desonestas para nos beneficiar ou prejudicar outros.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ado2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int contPalavra = 0;
        String[] dicionario = new String[1000];

        File arq = new File("./ADOS/Documentos/texto.txt");
        Scanner leitor = new Scanner(arq);
        String linhas = "";

        while (leitor.hasNextLine()) {
            linhas = leitor.nextLine();
            String[] palavras = linhas.split("\\s+");
			
            //Adiconandos as palavras ao dicionario
            for (int i = 0; i < palavras.length; i++) {
                if(palavras[i].matches("[a-zA-Z]+")){
                    dicionario[contPalavra] = palavras[i].toLowerCase();
                    contPalavra ++;
                }
            }
        }

        //Apresentando ao usuário as palacras contidas no dicionario
        for (int i = 0; i < contPalavra; i++) {
            System.out.println(dicionario[i]);
        }

        //Apresentando a quantidade de palavras adicionadas ao dicionario
        System.out.printf("A quantidade de palavras adicionadas é: %s", contPalavra);

        leitor.close();
    }

}