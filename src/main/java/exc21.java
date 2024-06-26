import java.util.Scanner;

public class ConceituacaoNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = sc.nextDouble();

        String conceito;
        if (nota >= 9.0) {
            conceito = "A";
        } else if (nota >= 7.0) {
            conceito = "B";
        } else if (nota >= 5.0) {
            conceito = "C";
        } else {
            conceito = "D";
        }

        System.out.println("A conceituação da nota é: " + conceito);
    }
}