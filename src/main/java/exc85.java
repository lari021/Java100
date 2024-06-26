import java.util.Scanner;

public class MaiorMenorValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número inteiro: ");
            int num = sc.nextInt();
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }

        System.out.println("Maior valor digitado: " + maior);
        System.out.println("Menor valor digitado: " + menor);
    }
}