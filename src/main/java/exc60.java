public class Fibonacci20DoWhile {
    public static void main(String[] args) {
        int a = 0, b = 1, c;
        int count = 0;

        System.out.println("Os primeiros 20 números da sequência de Fibonacci:");
        do {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
            count++;
        } while (count < 20);
    }
}
