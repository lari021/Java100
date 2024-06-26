import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário atual: ");
        double salario = sc.nextDouble();

        double novoSalario = salario * 1.15;

        System.out.println("Novo salário com aumento de 15%: " + novoSalario);
    }
}