import java.util.Scanner;

public class DigitosSeparadosDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        do {
            int digito = num % 10;
            System.out.println(digito);
            num /= 10;
        } while (num > 0);
    }
}
