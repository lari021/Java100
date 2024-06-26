import java.util.Scanner;

public class SalariosMinimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do salário-mínimo: ");
        double salarioMinimo = sc.nextDouble();

        System.out.print("Digite o salário do funcionário: ");
        double salarioFuncionario = sc.nextDouble();

        double quantidade = salarioFuncionario / salarioMinimo;

        System.out.println("O funcionário recebe " + quantidade + " salários-mínimos.");
    }
}
