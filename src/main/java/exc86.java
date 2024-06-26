import java.util.Arrays;
import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número inteiro: ");
            numeros[i] = sc.nextInt();
        }

        Arrays.sort(numeros);
        System.out.println("Números em ordem crescente:");
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}