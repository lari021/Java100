import java.util.Scanner;

public class Poupanca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do depósito mensal: ");
        double deposito = sc.nextDouble();

        System.out.print("Digite a taxa de juros mensal (em %): ");
        double taxaJuros = sc.nextDouble() / 100;

        double montante = 0;

        for (int i = 0; i < 12; i++) {
            montante += deposito;
            montante += montante * taxaJuros;
        }

        System.out.println("Montante após 12 meses: " + montante);
    }
}
