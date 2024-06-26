import java.util.Scanner;

public class NumeroPrimoDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        boolean ehPrimo = true;
        int i = 2;

        do {
            if (num % i == 0) {
                ehPrimo = false;
                break;
            }
            i++;
        } while (i <= num / 2);

        if (ehPrimo && num > 1) {
            System.out.println(num + " é um número primo.");
        } else {
            System.out.println(num + " não é um número primo.");
        }
    }
}
