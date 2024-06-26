import java.util.Scanner;

public class FibonacciDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        int a = 0, b = 1, c;
        System.out.println("Sequência de Fibonacci até " + num + ":");

        do {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        } while (a <= num);
    }
}
