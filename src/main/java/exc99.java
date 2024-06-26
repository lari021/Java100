import java.util.Scanner;

public class SomaDuasMatrizes2x2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] resultado = new int[2][2];

        System.out.println("Digite os elementos da primeira matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite os elementos da segunda matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz2[i][j] = sc.nextInt();
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Resultado da soma das duas matrizes 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultado[i][j] + "\t");
            }
            System.out.println();
        }
    }
}