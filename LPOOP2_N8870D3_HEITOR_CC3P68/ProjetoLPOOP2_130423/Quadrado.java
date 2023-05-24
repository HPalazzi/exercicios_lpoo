import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

public class Quadrado extends FormaGeometrica {

double lado;

public double calculaArea() {
	return Math.pow(lado, 2);
}

public double calculaPerimetro() {
	return 4 * lado;
}

public void mostraValores() {
	System.out.println("Perímetro: " + calculaPerimetro());
	System.out.println("Área: " + calculaArea());
	System.out.println("Lado: " + lado);
}

public void lerLado() {
	Scanner scanner = new Scanner(System.in);
	boolean inputValido = false;
	
	do {
		try {
			System.out.print("Digite o valor do lado: ");
			lado = scanner.nextDouble();
			inputValido = true;
		} catch (InputMismatchException e) {
			System.out.println("Erro: Valor inválido. Por favor, digite um número válido.");
			scanner.nextLine(); // Limpa o buffer do scanner
		}
	} while (!inputValido);
	scanner.close();
}