import java.util.Scanner;

public class SomaParesDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        int i = 1;
        int soma = 0;

        do {
            if (i % 2 == 0) {
                soma += i;
            }
            i++;
        } while (i <= num);

        System.out.println("A soma de todos os números pares entre 1 e " + num + " é: " + soma);
    }
}
