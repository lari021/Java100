import java.util.Scanner;

public class SomaPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        int soma = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }

        System.out.println("A soma de todos os números pares entre 1 e " + num + " é: " + soma);
    }
}
