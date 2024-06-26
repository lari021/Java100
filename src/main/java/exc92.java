import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class OrdemDecrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] numeros = new Integer[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número inteiro: ");
            numeros[i] = sc.nextInt();
        }

        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.println("Números em ordem decrescente:");
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}