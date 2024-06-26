import java.util.Scanner;

public class DivisoresDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int num = sc.nextInt();

        int i = 1;
        System.out.println("Divisores de " + num + ":");
        do {
            if (num % i == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= num);
    }
}
