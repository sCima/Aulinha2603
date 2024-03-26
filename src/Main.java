public class Main {
    public static void main(String[] args) {
        int[] x = new int[10];
        lerVetor(x);
        imprimirVetor(x);
        imprimirVetorForeach(x);
    }

    public static void lerVetor(int[] x) {
        for (int i = 0; i < x.length; i++) {
            x[i] = 2*i;
        }
    }

    public static void imprimirVetor(int[] x) {
        for (int j : x) {
            System.out.println(j + "\t");
        }
    }

    public static void imprimirVetorForeach(int[] x) {
        System.out.println("Fóriti");
        for (int numero : x) {
            System.out.println(numero + "\t");
        }
    }
}