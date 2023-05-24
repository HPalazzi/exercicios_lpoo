import java.util.InputMismatchException;
import java.util.Scanner;

public class Retangulo extends FormaGeometrica {

    double ladoA;
    double ladoB;

    public double calculaArea() {
        return area = ladoA * ladoB;
    }

    public double calculaPerimetro() {
        return perimetro = 2 * ladoA + 2 * ladoB;
    }

    public void mostraValores() {
        System.out.println("Perimetro: " + calculaPerimetro());
        System.out.println("Area: " + calculaArea());
        System.out.println("LadoA: " + ladoA);
        System.out.println("LadoB: " + ladoB);
    }

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o valor do lado A: ");
            retangulo.ladoA = scanner.nextDouble();

            System.out.print("Digite o valor do lado B: ");
            retangulo.ladoB = scanner.nextDouble();

            retangulo.mostraValores();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, digite um valor numérico válido.");
        }
    }
}
