import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        int a = 0, b = 1, c;
        System.out.println("Sequência de Fibonacci até " + num + ":");

        while (a <= num) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
