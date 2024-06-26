import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = sc.nextInt();

        double total = preco * quantidade;

        if (quantidade > 10) {
            total *= 0.9;
        }

        System.out.println("Valor total a ser pago: " + total);
    }
}