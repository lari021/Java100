import java.util.Scanner;

public class SomaDe10Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número inteiro: ");
            int num = sc.nextInt();
            soma += num;
        }

        System.out.println("A soma dos números digitados é: " + soma);
    }
}