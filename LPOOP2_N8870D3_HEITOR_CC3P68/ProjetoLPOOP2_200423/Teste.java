import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        try {
            Gerente g = new Gerente("Heitor", "1234", getDoubleInput("Digite o salário do gerente: "));
            Assistente a = new Assistente("Palazzi", "5678", getDoubleInput("Digite o salário do assistente: "));
            Vendedor v = new Vendedor("Oliveira", "9101112", getDoubleInput("Digite o salário do vendedor: "), getIntInput("Digite a quantidade de vendas do vendedor: "));

            double salarioGerente = g.calculaSalario();
            double salarioAssistente = a.calculaSalario();
            double salarioVendedor = v.calculaSalario();

            System.out.println("Salário total: " + (salarioGerente + salarioAssistente + salarioVendedor));
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um valor numérico válido.");
        }
    }

    private static double getDoubleInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                scanner.nextLine(); // Limpar o buffer do scanner
                System.out.println("Valor inválido. Por favor, digite um número válido.");
                System.out.print(message);
            }
        }
    }

    private static int getIntInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine(); // Limpar o buffer do scanner
                System.out.println("Valor inválido. Por favor, digite um número inteiro válido.");
                System.out.print(message);
            }
        }
    }
}
