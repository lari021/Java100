
    import java.util.Scanner;

    public class Tabuada {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um número inteiro: ");
            int num = sc.nextInt();

            int i = 1;
            while (i <= 10) {
                System.out.println(num + " x " + i + " = " + (num * i));
                i++;
            }
        }
    }

