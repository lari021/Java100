import java.util.Scanner;

public class SituacaoAlunoNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.next();

        System.out.print("Digite a nota do aluno: ");
        double nota = sc.nextDouble();

        if (nota >= 7) {
            System.out.println(nome + " está aprovado.");
        } else {
            System.out.println(nome + " está em recuperação.");
        }
    }
}
