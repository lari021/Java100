import java.util.Scanner;

public class SomaElementosMatriz2x2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[2][2];
        int soma = 0;

        System.out.println("Digite os elementos da matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = sc.nextInt();
                soma += matriz[i][j];
            }
        }

        System.out.println("A soma dos elementos da matriz é: " + soma);
    }
}
