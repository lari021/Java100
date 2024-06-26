import java.util.Scanner;

public class Aposentadoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite o sexo (M/F): ");
        char sexo = sc.next().charAt(0);

        if ((sexo == 'M' && idade >= 65) || (sexo == 'F' && idade >= 60)) {
            System.out.println("Pode se aposentar.");
        } else {
            System.out.println("Não pode se aposentar.");
        }
    }
}
