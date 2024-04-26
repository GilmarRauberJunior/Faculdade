public class Mdc {
    public static void main(String[] args) {
        System.out.println(mdc(42, 30));
        System.out.println(produto(5, 6));
    }

    public static int mdc(int m, int n){
        if(n == 0)
            return m;
        return mdc(n, m%n);
    }

    public static int produto(int a, int b){
        if(b == 1)
            return a;
        return produto(a,b-1)+a;
    }

}