import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int somaIdades = 0;
        int count = 0;

        while (true) {
            System.out.print("Digite o nome da pessoa (ou 'fim' para encerrar): ");
            nome = sc.next();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = sc.nextInt();

            somaIdades += idade;
            count++;
        }
        