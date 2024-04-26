public class BuscaBinariaRecursiva {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 44, 68, 79, 80, 100, 120};

        System.out.println(busca(vetor, 100));
    }

    public static int busca(int[] vetor, int x){
        return buscaBinaria2(vetor, x, 0, vetor.length - 1);
    }
    
    public static int buscaBinaria2(int[] vetor, int x, int i, int f){
        if(i > f)
            return -1;

        int meio = (i+f)/2;
        if(vetor[meio] == x)
            return meio;
        
        if (x < vetor[meio])
            return buscaBinaria2(vetor, x, i, meio - 1);
        return buscaBinaria2(vetor, x, meio + 1, f);
    }   

}
