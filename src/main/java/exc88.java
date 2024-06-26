import java.util.Scanner;

public class MediaParesImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int somaPares = 0, countPares = 0;
        int somaImpares = 0, countImpares = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número inteiro: ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                somaPares += num;
                countPares++;
            } else {
                somaImpares += num;
                countImpares++;
            }
        }

        double mediaPares = countPares > 0 ? (double) somaPares / countPares : 0;
        double mediaImpares = countImpares > 0 ? (double) somaImpares / countImpares : 0;

        System.out.println("Média dos valores pares: " + mediaPares);
        System.out.println("Média dos valores ímpares: " + mediaImpares);
    }
}