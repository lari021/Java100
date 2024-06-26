import java.util.Scanner;

public class MediaIdadeDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int somaIdades = 0;

        do {
            System.out.print("Digite o nome da pessoa: ");
            String nome = sc.next();
            System.out.print("Digite a idade de " + nome + ": ");
            int idade = sc.nextInt();

            somaIdades += idade;
            i++;
        } while (i < 5);

        double media = (double) somaIdades / 5;
        System.out.println("A média das idades é: " + media);
    }
}
