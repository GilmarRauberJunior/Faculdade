import java.util.Scanner;

public class Calculaora {

    //Exemplo de recursividade
    public static int fatorial(int num) {
        if(num == 0)
            return 1;
        else
            return num * fatorial(num-1);
    }

    public static int potencia(int num, int pot){
        int res = 0;
        
        //Base da recursão
        if(pot == 0)
            return 1;
        //Passo da recursão
        else{
            res = num * potencia(num,pot-1);
            return res;
        }    
    }

    public static String binario(int num){
        if(num < 2)
            return "" + num;
        else{
            return binario(num/2) + num % 2;
        }
    }

    public static void main(String[] args) {
        System.out.println(fatorial(12));
        System.out.println(potencia(5,5));
        System.out.print(binario(128));
    }
}
