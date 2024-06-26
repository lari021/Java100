import java.util.Scanner;

public class SaudacaoTurno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.next();

        System.out.print("Digite o turno (M/V): ");
        char turno = sc.next().charAt(0);

        if (turno == 'M') {
            System.out.println("Bom dia, " + nome);
        } else if (turno == 'V') {
            System.out.println("Boa tarde, " + nome);
        } else {
            System.out.println("Turno inválido.");
        }
    }
}