import java.util.Scanner;

public class MediaMatriz4x4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int soma = 0;

        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = sc.nextInt();
                soma += matriz[i][j];
            }
        }

        double media = (double) soma / (4 * 4);
        System.out.println("A média aritmética dos elementos da matriz é: " + media);
    }
}
