public class Recorrencia {

    // Exemplo de recursividade
    public static long fatorial(int num) {
        if (num == 0)
            return 1;
        else
            return num * fatorial(num - 1);
    }

    public static int potencia(int num, int pot) {
        int res = 0;

        // Base da recursão
        if (pot == 0)
            return 1;
        // Passo da recursão
        else {
            res = num * potencia(num, pot - 1);
            return res;
        }
    }

    public static String binario(int num) {
        if (num < 2)
            return "" + num;
        else {
            return binario(num / 2) + num % 2;
        }
    }

    public static int fibonacci(int num){
        if (num < 2)
            return num;
        return fibonacci(num-1) + fibonacci(num-2);
    }

    public static int profundidade(int num){
        if (num < 2) 
            return 0;

        return profundidade(num - 1) + profundidade(num - 2) + 2;
    }   

    public static void main(String[] args) {
        //System.out.println(fatorial(20));
        //System.out.println(potencia(100, 4));
        //System.out.print(binario(128));
        System.out.println("\n"+fibonacci(30));
        System.out.println(profundidade(5));
    }
}
