import java.util.Scanner;

public class ContarPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countPares = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número inteiro: ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                countPares++;
            }
        }

        System.out.println("Quantidade de números pares: " + countPares);
    }
}
