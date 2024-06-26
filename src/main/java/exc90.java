import java.util.Scanner;

public class VerificarZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean encontrouZero = false;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número inteiro: ");
            int num = sc.nextInt();
            if (num == 0) {
                encontrouZero = true;
            }
        }

        if (encontrouZero) {
            System.out.println("Pelo menos um dos números digitados é igual a zero.");
        } else {
            System.out.println("Nenhum dos números digitados é igual a zero.");
        }
    }
}
