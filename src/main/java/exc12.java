import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o peso (em kg): ");
        double peso = sc.nextDouble();

        System.out.print("Digite a altura (em metros): ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Índice de Massa Corporal (IMC): " + imc);
    }
}
