import java.util.Scanner;

public class MediaDe5Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número inteiro: ");
            int num = sc.nextInt();
            soma += num;
        }

        double media = (double) soma / 5;
        System.out.println("A média aritmética é: " + media);
    }
}