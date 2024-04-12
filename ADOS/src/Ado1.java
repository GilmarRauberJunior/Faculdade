/*
Entrega a Atividade 1 - Algoritmos e Programação II

Eu,

Gilmar Rauber Junior

declaramo que

As respostas contidas nesse trabalho, não copiamos respostas de colegas externos à equipe,
não disponibilizamos nossas respostas para colegas externos ao grupo e
não realizamos quaisquer outras atividades desonestas para nos beneficiar ou prejudicar outros.
*/

import java.util.*;

public class Ado1 {

    /*
        Nessa função o vetor será criado e populacionado com números aleatórios, e terá um valor máximo que poderá conter 
        nesse vetor que será inserido pelo usuário juntamente com o tamanho do vetor
    */
    
    public static int[] criarVetor(int tamanho, int max){
        Random rnd = new Random();

        int[] vetor = new int[tamanho];

        //Populando o vetor com o núemero máximo que o usuário inseriu no método main
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = rnd.nextInt(-max, max);
        }

        return vetor;
    }

    //Nessa função o vetor será exibido para o usuário
    public static void mostrarVetor(int vetor[]){
        System.out.print("[");
        for(int i = 0; i < vetor.length; i++){
            System.out.printf(" %1d ", vetor[i]);
        }
        System.out.print("]");
    }

    //Nessa função será feita uma verificação de um número inserido pelo usuário dentro do vetor
    public static int procurarNumExistente(int[] vetor, int numExis){

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == numExis){
                return i;
            }
        }

        return -1;        
    }

    //Nessa função será feita uma busca no vetor para encontrar o maior número presente nele
    public static int procurarMaiorNum(int[] vetor){
        int maior = vetor[0];
        
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }

        return maior;
    }

    //Nessa função será feita uma média simples de todos o números pares presentes no vetor
    public static double calcularMediaPares(int[] vetor){
        double media = 0, qtdPares = 0;
        
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i]%2 == 0){
                
                //Verificando se o numero for igual a 0
                if(vetor[i] == 0){
                    continue;
                }

                qtdPares ++;
                media += (vetor[i]);
            }
        }

        media /= qtdPares;

        return media;
    }

    //Nessa função será feita a porcentagem de números impares contidos no vetor
    public static double calcPercentuaImpares(int vetor[]){
        double percImpares = 0;
        int qtdImpares = 0;
        
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i]%2 != 0){
                qtdImpares++;
            }
        }

        percImpares = qtdImpares*100 / vetor.length;

        return percImpares;
    }

    //Nessa função será realizada a soma "centralizada" do vetor
    public static double calcMediaCentralizada(int[] vetor){
        double media = 0;
        int maior = 0, menor = 0, cont = 0;;

        //Descobrindo o maior valor dentro do vetor
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }

        //Descobrindo o menor valor do vetor
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] < menor){
                menor = vetor[i];
            }
        }

        //Calculando a media "centralizada" do vetor
        for(int i = 0; i < vetor.length; i++){
            if(menor == vetor[i] || maior == vetor[i]){
                cont ++;
                if(cont == 1 || cont == 2){
                    continue;
                }
            }

            if(cont > 1){
                media += vetor[i];
            }
        }

        media /= vetor.length;

        return media;
    }

    //Nessa função será somados valores em posições distintas e verifica se a soma entre eles é igual ao valor passado pelo usuário
    public static boolean somaDistinta(int[] vetor, int valor){
        int valorSomado = 0;

        for(int i = 0; i < vetor.length; i++){
            for(int j = 0; j < vetor.length; j++){
                valorSomado = vetor[i] + vetor[j];
                if(valorSomado == valor){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        //Declaração de variaveis
        int opcao = 0, procurarNum  = 0, posNum = 0, maiorNum = 0;
        double mediaPares = 0, percImpar = 0, mediaCentralizada = 0;
        boolean somaNumDistinto = false;

        //Variavel cridada pra poder validar a opção escolhida pelo usuário
        boolean verif = false;

        //Mostrando o menu para o usuário
        System.out.println("----------------------------------------------------");
        System.out.print("1- Criar vetor\n2- Imprimir vetor\n3- Verificar número existente\n4- Buscar maior número\n5- Calcular média de números pares\n6- Calcular percentual de números impares\n7- Calcular média centralizada\n8- Buscar número por soma de dois números em posições distintas");
        System.out.println("\n----------------------------------------------------\n");
        System.out.print("Selecione uma opção: ");
        opcao = scan.nextInt();

        //Validando a opção inserida pelo usuário
        if(opcao != 1){
            do{
                System.out.println("\nA opreção desejada, não poderá ser executada, pois o vetor ainda não criado e/ou a opção digitada não existe.");
                System.out.println("----------------------------------------------------\n");
                System.out.print("Selecione uma opção: ");
                opcao = scan.nextInt();
            }while(opcao != 1);
        }

        //Criando o vetor
        System.out.print("Insira o tamanho do vetor: ");
        int tamanho = scan.nextInt();

        //Pedindo ao usuário para inserir o valor máximo contido nesse vetor
        System.out.print("Insira o valor máximo que pode conter nesse vetor: ");
        int max = scan.nextInt();
        int[] vetor = criarVetor(tamanho, max);

        System.out.println("\nDeseja continuar?\n1- Sim 2- Não");
        opcao = scan.nextInt();

        //Verificando a opção inserida pelo usuário
        if(opcao == 2){
            scan.close();
            return;
        }else{
            System.out.println("----------------------------------------------------");
            System.out.print("1- Criar vetor\n2- Imprimir vetor\n3- Verificar número existente\n4- Buscar maior número\n5- Calcular média de números pares\n6- Calcular percentual de números impares\n7- Calcular média centralizada\n8- Buscar número por soma de dois números em posições distintas");
            System.out.println("\n----------------------------------------------------\n");
            System.out.print("Selecione uma opção: ");
            opcao = scan.nextInt();
        }

        do {
            switch (opcao) {
                case 1:

                    //Nesse switch case será onde acontece a operação de criar um vetor novemante se for solicitado pelo usuário

                    System.out.print("Insira o tamanho do vetor: ");
                    tamanho = scan.nextInt();

                    //Pedindo ao usuário para inserir o valor máximo contido nesse vetor
                    System.out.print("Insira o valor máximo que pode conter nesse vetor: ");
                    max = scan.nextInt();
                    vetor = criarVetor(tamanho, max);
                
                    //Verificando se o usuário deseja continuar na aplicação
                    System.out.println("\nDeseja continuar?\n1- Sim 2- Não");
                    opcao = scan.nextInt();

                    //Validando opção do usuário
                    if(opcao > 2 || opcao < 1){
                        do{
                            System.out.println("\n--------------------------------------------------------");
                            System.out.println("\nA opção inserida não existe.");
                            System.out.println("----------------------------------------------------\n");
                            System.out.print("Selecione uma opção: ");
                            opcao = scan.nextInt();
                        }while(opcao > 2 || opcao < 1);
                    }
                    
                    //Verificando a opção inserida pelo usuário
                    if(opcao == 2){
                        scan.close();
                        return;
                    }else{
                        System.out.println("----------------------------------------------------");
                        System.out.print("1- Criar vetor\n2- Imprimir vetor\n3- Verificar número existente\n4- Buscar maior número\n5- Calcular média de números pares\n6- Calcular percentual de números impares\n7- Calcular média centralizada\n8- Buscar número por soma de dois números em posições distintas");
                        System.out.println("\n----------------------------------------------------\n");
                        System.out.print("Selecione uma opção: ");
                        opcao = scan.nextInt();
                    }

                break;
                case 2:

                    //Nessa parte será onde o vetor será mostrado ao usuário  

                    mostrarVetor(vetor);

                    //Verificando se o usuário deseja continuar na aplicação
                    System.out.println("\n\nDeseja continuar?\n1- Sim 2- Não");
                    opcao = scan.nextInt();

                    //Validando opção do usuário
                    if(opcao > 2 || opcao < 1){
                        do{
                            System.out.println("\n--------------------------------------------------------");
                            System.out.println("\nA opção inserida não existe.");
                            System.out.println("----------------------------------------------------\n");
                            System.out.print("Selecione uma opção: ");
                            opcao = scan.nextInt();
                        }while(opcao > 2 || opcao < 1);
                    }

                    //Verificando a opção inserida pelo usuário
                    if(opcao == 2){
                        verif = false;
                    }else{
                        verif = true;
                        System.out.println("----------------------------------------------------");
                        System.out.print("1- Criar vetor\n2- Imprimir vetor\n3- Verificar número existente\n4- Buscar maior número\n5- Calcular média de números pares\n6- Calcular percentual de números impares\n7- Calcular média centralizada\n8- Buscar número por soma de dois números em posições distintas");
                        System.out.println("\n----------------------------------------------------\n");
                        System.out.print("Selecione uma opção: ");
                        opcao = scan.nextInt();
                    }

                break;
                case 3:

                    //Nessa parte será executada uma função que procura o valor inserido pelo usuário dentro do vetor

                    //Pedindo ao usuário o valor a ser procurado no vetor
                    System.out.print("Digite um valor a ser procurado no vetor: ");
                    procurarNum = scan.nextInt();

                    posNum = procurarNumExistente(vetor, procurarNum);
                    if(posNum != -1){
                        System.out.print("Número encontrado, no indice: "+posNum);
                    }else{
                        System.out.print("Número não encontrado");
                    }

                    //Verificando se o usuário deseja continuar na aplicação
                    System.out.println("\n\nDeseja continuar?\n1- Sim 2- Não");
                    opcao = scan.nextInt();

                    //Validando opção do usuário
                    if(opcao > 2 || opcao < 1){
                        do{
                            System.out.println("\n--------------------------------------------------------");
                            System.out.println("\nA opção inserida não existe.");
                            System.out.println("----------------------------------------------------\n");
                            System.out.print("Selecione uma opção: ");
                            opcao = scan.nextInt();
                        }while(opcao > 2 || opcao < 1);
                    }

                    //Verificando a opção inserida pelo usuário
                    if(opcao == 2){
                        verif = false;
                    }else{
                        verif = true;
                        System.out.println("----------------------------------------------------");
                        System.out.print("1- Criar vetor\n2- Imprimir vetor\n3- Verificar número existente\n4- Buscar maior número\n5- Calcular média de números pares\n6- Calcular percentual de números impares\n7- Calcular média centralizada\n8- Buscar número por soma de dois números em posições distintas");
                        System.out.println("\n----------------------------------------------------\n");
                        System.out.print("Selecione uma opção: ");
                        opcao = scan.nextInt();
                    }

                break;
                case 4:

                    //Nessa árte será feita uma busca no vetor para poder achar o maior valor contido no vetor

                    maiorNum = procurarMaiorNum(vetor);
                    System.out.print("O maior número presente no vetor é: "+maiorNum);

                    //Verificando se o usuário deseja continuar na aplicação
                    System.out.println("\n\nDeseja continuar?\n1- Sim 2- Não");
                    opcao = scan.nextInt();

                    //Validando opção do usuário
                    if(opcao > 2 || opcao < 1){
                        do{
                            System.out.println("\n--------------------------------------------------------");
                            System.out.println("\nA opção inserida não existe.");
                            System.out.println("----------------------------------------------------\n");
                            System.out.print("Selecione uma opção: ");
                            opcao = scan.nextInt();
                        }while(opcao > 2 || opcao < 1);
                    }

                    //Verificando a opção inserida pelo usuário
                    if(opcao == 2){
                        verif = false;
                    }else{
                        verif = true;
                        System.out.println("----------------------------------------------------");
                        System.out.print("1- Criar vetor\n2- Imprimir vetor\n3- Verificar número existente\n4- Buscar maior número\n5- Calcular média de números pares\n6- Calcular percentual de números impares\n7- Calcular média centralizada\n8- Buscar número por soma de dois números em posições distintas");
                        System.out.println("\n----------------------------------------------------\n");
                        System.out.print("Selecione uma opção: ");
                        opcao = scan.nextInt();
                    }

                break;
                case 5:

                    //Nessa parte será claculada a media dos números pares presentes no vetor

                    mediaPares = calcularMediaPares(vetor);
                    System.out.printf("A média entre os numeros pares contidos no vetor é: %.1f", mediaPares);

                    //Verificando se o usuário deseja continuar na aplicação
                    System.out.println("\n\nDeseja continuar?\n1- Sim 2- Não");
                    opcao = scan.nextInt();

                    //Validando opção do usuário
                    if(opcao > 2 || opcao < 1){
                        do{
                            System.out.println("\n--------------------------------------------------------");
                            System.out.println("\nA opção inserida não existe.");
                            System.out.println("----------------------------------------------------\n");
                            System.out.print("Selecione uma opção: ");
                            opcao = scan.nextInt();
                        }while(opcao > 2 || opcao < 1);
                    }

                    //Verificando a opção inserida pelo usuário
                    if(opcao == 2){
                        verif = false;
                    }else{
                        verif = true;
                        System.out.println("----------------------------------------------------");
                        System.out.print("1- Criar vetor\n2- Imprimir vetor\n3- Verificar número existente\n4- Buscar maior número\n5- Calcular média de números pares\n6- Calcular percentual de números impares\n7- Calcular média centralizada\n8- Buscar número por soma de dois números em posições distintas");
                        System.out.println("\n----------------------------------------------------\n");
                        System.out.print("Selecione uma opção: ");
                        opcao = scan.nextInt();
                    }

                break;
                case 6:

                    //Nessa parte será calculada a porcnetagem de números impares presentes no vetor    

                    percImpar = calcPercentuaImpares(vetor);
                    System.out.printf("O percentual de números impares presente no vetor é: %.2f%%", percImpar);

                    //Verificando se o usuário deseja continuar na aplicação
                    System.out.println("\n\nDeseja continuar?\n1- Sim 2- Não");
                    opcao = scan.nextInt();

                    //Validando opção do usuário
                    if(opcao > 2 || opcao < 1){
                        do{
                            System.out.println("\n--------------------------------------------------------");
                            System.out.println("\nA opção inserida não existe.");
                            System.out.println("----------------------------------------------------\n");
                            System.out.print("Selecione uma opção: ");
                            opcao = scan.nextInt();
                        }while(opcao > 2 || opcao < 1);
                    }

                    //Verificando a opção inserida pelo usuário
                    if(opcao == 2){
                        verif = false;
                    }else{
                        verif = true;
                        System.out.println("----------------------------------------------------");
                        System.out.print("1- Criar vetor\n2- Imprimir vetor\n3- Verificar número existente\n4- Buscar maior número\n5- Calcular média de números pares\n6- Calcular percentual de números impares\n7- Calcular média centralizada\n8- Buscar número por soma de dois números em posições distintas");
                        System.out.println("\n----------------------------------------------------\n");
                        System.out.print("Selecione uma opção: ");
                        opcao = scan.nextInt();
                    }

                break;
                case 7:

                    //Nessa parte será calculada a média "centralizada" do vetor, onde se pula o menor e o maior valor do vetor e após isso 

                    mediaCentralizada = calcMediaCentralizada(vetor);
                    System.out.printf("A média centralizada do vetor é: %.2f", mediaCentralizada);

                    //Verificando se o usuário deseja continuar na aplicação
                    System.out.println("\n\nDeseja continuar?\n1- Sim 2- Não");
                    opcao = scan.nextInt();

                    //Validando opção do usuário
                    if(opcao > 2 || opcao < 1){
                        do{
                            System.out.println("\n--------------------------------------------------------");
                            System.out.println("\nA opção inserida não existe.");
                            System.out.println("----------------------------------------------------\n");
                            System.out.print("Selecione uma opção: ");
                            opcao = scan.nextInt();
                        }while(opcao > 2 || opcao < 1);
                    }

                    //Verificando a opção inserida pelo usuário
                    if(opcao == 2){
                        verif = false;
                    }else{
                        verif = true;
                        System.out.println("----------------------------------------------------");
                        System.out.print("1- Criar vetor\n2- Imprimir vetor\n3- Verificar número existente\n4- Buscar maior número\n5- Calcular média de números pares\n6- Calcular percentual de números impares\n7- Calcular média centralizada\n8- Buscar número por soma de dois números em posições distintas");
                        System.out.println("\n----------------------------------------------------\n");
                        System.out.print("Selecione uma opção: ");
                        opcao = scan.nextInt();
                    }


                break;
                case 8:
                
                    //Nessa parte será feito uma soma de dois números em posições distintas e verifica se a soma for verdadeira

                    System.out.print("Insira um valor: ");
                    int valor = scan.nextInt();
                    somaNumDistinto = somaDistinta(vetor, valor);
                    System.out.printf("A soma de dois valores é igual ao valor informado pelo usuário?%n%nR:%b", somaNumDistinto);

                    //Verificando se o usuário deseja continuar na aplicação
                    System.out.println("\n\nDeseja continuar?\n1- Sim 2- Não");
                    opcao = scan.nextInt();

                    //Validando opção do usuário
                    if(opcao > 2 || opcao < 1){
                        do{
                            System.out.println("\n--------------------------------------------------------");
                            System.out.println("\nA opção inserida não existe.");
                            System.out.println("----------------------------------------------------\n");
                            System.out.print("Selecione uma opção: ");
                            opcao = scan.nextInt();
                        }while(opcao > 2 || opcao < 1);
                    }

                    //Verificando a opção inserida pelo usuário
                    if(opcao == 2){
                        verif = false;
                    }else{
                        verif = true;
                        System.out.println("----------------------------------------------------");
                        System.out.print("1- Criar vetor\n2- Imprimir vetor\n3- Verificar número existente\n4- Buscar maior número\n5- Calcular média de números pares\n6- Calcular percentual de números impares\n7- Calcular média centralizada\n8- Buscar número por soma de dois números em posições distintas");
                        System.out.println("\n----------------------------------------------------\n");
                        System.out.print("Selecione uma opção: ");
                        opcao = scan.nextInt();
                    }

                break;
            }
        } while (verif);

        scan.close();

    }
}
