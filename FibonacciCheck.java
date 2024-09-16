import java.util.Scanner;

public class FibonacciCheck {

    public static String isFibonacci(int n) {
        int a = 0, b = 1;

        if (n == 0) {
            return "O número 0 pertence à sequência de Fibonacci.";
        } else if (n == 1) {
            return "O número 1 pertence à sequência de Fibonacci.";
        }

        while (b < n) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        if (b == n) {
            return "O número " + n + " pertence à sequência de Fibonacci.";
        } else {
            return "O número " + n + " NÃO pertence à sequência de Fibonacci.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int num = scanner.nextInt();

        String resultado = isFibonacci(num);
        System.out.println(resultado);
    }
}
