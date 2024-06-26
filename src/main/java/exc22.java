import java.util.Scanner;

public class CalculoBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double salario = sc.nextDouble();

        double bonus;
        if (salario > 2000) {
            bonus = salario * 0.10;
        } else {
            bonus = salario * 0.05;
        }

        System.out.println("O valor do bônus é: " + bonus);
    }
}
