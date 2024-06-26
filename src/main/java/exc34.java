import java.util.Scanner;

public class DireitoVoto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        if ((idade >= 18 && idade <= 70) || (idade >= 16 && idade < 18) || (idade > 70)) {
            System.out.println("Pode votar.");
        } else {
            System.out.println("Não pode votar.");
        }
    }
}