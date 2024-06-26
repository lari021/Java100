import java.util.Scanner;

public class MediaDe5NumerosDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int soma = 0;

        do {
            System.out.print("Digite um número inteiro: ");
            int num = sc.nextInt();
            soma += num;
            i++;
        } while (i < 5);

        double media = (double) soma / 5;
        System.out.println("A média aritmética é: " + media);
    }
}
