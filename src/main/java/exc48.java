import java.util.Scanner;

public class DigitosSeparados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        while (num > 0) {
            int digito = num % 10;
            System.out.println(digito);
            num /= 10;
        }
    }
}
