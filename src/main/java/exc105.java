import java.util.Scanner;

public class SomaColunasMatriz4x4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int[] somaColunas = new int[4];

        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = sc.nextInt();
                somaColunas[j] += matriz[i][j];
            }
        }

        System.out.println("Soma dos elementos de cada coluna:");
        for (int j = 0; j < 4; j++) {
            System.out.println("Coluna " + (j + 1) + ": " + somaColunas[j]);
        }
    }
}