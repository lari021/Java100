import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int somaIdades = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome da pessoa: ");
            String nome = sc.next();
            System.out.print("Digite a idade de " + nome + ": ");
            int idade = sc.nextInt();

            somaIdades += idade;
        }

        double media = (double) somaIdades / 5;
        System.out.println("A média das idades é: " + media);
    }
}
