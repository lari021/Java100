import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário base do funcionário: ");
        double salarioBase = sc.nextDouble();

        double salarioLiquido = salarioBase + (salarioBase * 0.05);

        System.out.println("Salário líquido: " + salarioLiquido);
    }
}