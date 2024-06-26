import java.util.Scanner;

public class DiasDeVida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade em anos: ");
        int anos = sc.nextInt();

        System.out.print("Digite a idade em meses: ");
        int meses = sc.nextInt();

        System.out.print("Digite a idade em dias: ");
        int dias = sc.nextInt();

        int totalDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("Você tem " + totalDias + " dias de vida.");
    }
}