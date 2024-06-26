import java.util.Scanner;

public class ValorProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigo = sc.nextInt();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = sc.nextInt();

        double preco;
        switch (codigo) {
            case 1:
                preco = 10.0;
                break;
            case 2:
                preco = 20.0;
                break;
            case 3:
                preco = 30.0;
                break;
            default:
                preco = 0.0;
                System.out.println("Código de produto inválido.");
                return;
        }

        double total = preco * quantidade;
        System.out.println("O valor total a ser pago é: " + total);
    }
}
