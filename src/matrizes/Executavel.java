package matrizes;

import java.util.Arrays;
import java.util.Random;

public class Executavel {
    public static void main(String[] args) {
        int[][] matriz = new int [2][2];
        //matriz[0] = new int[2];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        //matriz[1] = new int[2];
        matriz[1][0] = 3;
        matriz[1][1] = 4;

        Random r = new Random();
        int[][] matrix = new int[2][2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = r.nextInt(101);
            }
        }

        for (int[] numero:
             matriz) {
            System.out.println(Arrays.toString(numero));
        }

        for (int[] numero:
                matrix) {
            System.out.println(Arrays.toString(numero));
        }
    }
}
