import java.util.Scanner;

public class SomaPositivosNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int somaPositivos = 0, somaNegativos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número inteiro: ");
            int num = sc.nextInt();
            if (num > 0) {
                somaPositivos += num;
            } else if (num < 0) {
                somaNegativos += num;
            }
        }

        System.out.println("Soma dos valores positivos: " + somaPositivos);
        System.out.println("Soma dos valores negativos: " + somaNegativos);
    }
}
