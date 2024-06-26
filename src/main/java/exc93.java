import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[7];

        System.out.println("Digite 7 números inteiros:");
        for (int i = 0; i < 7; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.println("Números pares:");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}