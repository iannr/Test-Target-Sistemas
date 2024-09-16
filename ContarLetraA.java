import java.util.Scanner;

public class ContarLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();

        int contador = 0;

        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a') {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vezes.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }
    }
}
