import java.util.Scanner;

public class ContarPositivosNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countPositivos = 0, countNegativos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número inteiro: ");
            int num = sc.nextInt();
            if (num > 0) {
                countPositivos++;
            } else if (num < 0) {
                countNegativos++;
            }
        }

        System.out.println("Quantidade de números positivos: " + countPositivos);
        System.out.println("Quantidade de números negativos: " + countNegativos);
    }
}