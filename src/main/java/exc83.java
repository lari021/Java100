import java.util.Scanner;

public class MediaDe7Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Digite um número inteiro: ");
            int num = sc.nextInt();
            soma += num;
        }

        double media = (double) soma / 7;
        System.out.println("A média aritmética é: " + media);
    }
}