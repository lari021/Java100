import java.util.Scanner;

public class MediaIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int somaIdades = 0;

        while (i < 5) {
            System.out.print("Digite o nome da pessoa: ");
            String nome = sc.next();
            System.out.print("Digite a idade de " + nome + ": ");
            int idade = sc.nextInt();

            somaIdades += idade;
            i++;
        }

        double media = (double) somaIdades / 5;
        System.out.println("A média das idades é: " + media);
    }
}
