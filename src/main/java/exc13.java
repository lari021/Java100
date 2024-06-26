import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 % num2 == 0) {
            System.out.println(num1 + " é múltiplo de " + num2);
        } else {
            System.out.println(num1 + " não é múltiplo de " + num2);
        }
    }
}