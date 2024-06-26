import java.util.Scanner;

public class MatrizesIguais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        boolean iguais = true;

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
                if (matriz1[i][j] != matriz2[i][j]) {
                    iguais = false;
                    break;
                }
            }
            if (!iguais) {
                break;
            }
        }

        if (iguais) {
            System.out.println("As matrizes são iguais.");
        } else {
            System.out.println("As matrizes não são iguais.");
        }
    }
}