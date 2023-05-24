import java.lang.Math;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Circulo extends FormaGeometrica {

double raio;

public double calculaArea() {
    return area = Math.PI * Math.pow(raio, 2);
}

public double calculaPerimetro() {
    return perimetro = 2 * Math.PI * raio;
}

public void mostraValores() {
    System.out.println("Perímetro: " + calculaPerimetro());
    System.out.println("Área: " + calculaArea());
    System.out.println("Raio: " + raio);
}

public void lerDados() {
    Scanner scanner = new Scanner(System.in);
    boolean inputValido = false;
    
    while (!inputValido) {
        try {
            System.out.print("Digite o raio do círculo: ");
            raio = scanner.nextDouble();
            inputValido = true;
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. O raio deve ser um valor numérico.");
            scanner.nextLine(); // Limpa o buffer do scanner
        }
    }
}

public static void main(String[] args) {
    Circulo circulo = new Circulo();
    circulo.lerDados();
    circulo.mostraValores();
}
