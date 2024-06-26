import java.util.Scanner;

public class MediaIdadesAteFim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int somaIdades = 0;
        int count = 0;

        do {
            System.out.print("Digite o nome da pessoa (ou 'fim' para encerrar): ");
            nome = sc.next();
            if (!nome.equalsIgnoreCase("fim")) {
                System.out.print("Digite a idade de " + nome + ": ");
                int idade = sc.nextInt();
                somaIdades += idade;
                count++;
            }
        } while (!nome.equalsIgnoreCase("fim"));

        if (count > 0) {
            double media = (double) somaIdades / count;
            System.out.println("A média das idades é: " + media);
        } else {
            System.out.println("Nenhuma idade foi informada.");
        }
    }
}
