import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        int fatorial = 1;
        for (int i = num; i > 0; i--) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + num + " é: " + fatorial);
    }
}