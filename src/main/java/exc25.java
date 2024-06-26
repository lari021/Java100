import java.util.Scanner;

public class SituacaoFaltas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de faltas: ");
        int faltas = sc.nextInt();

        if (faltas > 15) {
            System.out.println("Reprovado por faltas.");
        } else {
            System.out.println("Aprovado.");
        }
    }
}