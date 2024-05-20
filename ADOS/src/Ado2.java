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
import java.util.Scanner;

public class Ado2 {

    //A variavel abaixo é uma variavel constante, ou seja seu valor não será mudado dentro do programa
    //USAR ESSA VARIAVEL PARA PODER LER OS ARQUIVOS DE TEXTOS
    public static final String CAMINHO_DO_ARQUIVO = "./ADO/Documentos/texto.txt";

    public static void main(String[] args) throws Exception {

        String[] dicionario = leitorDeTexto(CAMINHO_DO_ARQUIVO);
        apresenta(dicionario);

    }

    //Criando a função para poder apresentar o dicionario para o usuário
    public static void apresenta(String[] dicionario){
        int i;

        for(i = 0; dicionario[i] != null; i++ ){
            System.out.println(dicionario[i]);
        }
        System.out.printf("A quantidade de palavras no dicionario é: %d", i);
    }

    //Criando a função para ler o arquivo desejado
    public static String[] leitorDeTexto(String localArq) throws Exception{
        String[] dicionario = new String[1000];
        int tamanhoDicionario = 0;

        File arq = new File(localArq);
        Scanner leitor = new Scanner(arq);
        String linhas = "";

        while (leitor.hasNextLine()) {
            linhas = leitor.nextLine();
            String[] palavras = linhas.split("\\s+");
			
            for (String palavra : palavras) {
                palavra = palavra.toLowerCase();
                int pos = buscaPalavras(dicionario, tamanhoDicionario, palavra);
                if (pos == -1 && !palavra.equals("")) {
                    inserirPalavras(dicionario, tamanhoDicionario, palavra);
                    tamanhoDicionario ++;
                }
            }
            
        }

        leitor.close();

        return dicionario;
    }

    //Criando a função para poder ordenar e colocar as palavras já ordenadas no dicionario
    public static void inserirPalavras(String[] dicionario, int tamanho, String palavra){
        int k = tamanho;

        //Utilizando o while para poder ordenar as palavras dentro do dicionario
        while (k > 0 && palavra.compareTo(dicionario[k -1]) < 0) {
            dicionario[k] = dicionario[k-1];
            k--;
        }
    }

    // Criando a função para poder verificar se existem palaras duplicadas no dicionario
    public static int buscaPalavras(String[] dicionario, int tamanho, String palavra){
        int inicio, meio, fim;
        inicio = 0;
        fim = tamanho - 1;

        //Utilizando a buscaBinaria para poder verifiar se exitem palavras iguais no dicionaio
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;

            if(palavra.equals(dicionario[meio])){
                return meio;
            }

            if (palavra.compareTo(dicionario[meio]) < 0) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }

        }

        return -1;
    }

}