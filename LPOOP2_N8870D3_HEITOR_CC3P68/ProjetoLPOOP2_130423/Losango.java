import java.util.InputMismatchException;
import java.util.Scanner;

public class Losango extends FormaGeometrica {
	
	double lado;
	double diagonalMaior;
	double diagonalMenor;

	public void lerValores() {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("Digite o lado do losango: ");
			lado = scanner.nextDouble();
			
			System.out.print("Digite a diagonal maior do losango: ");
			diagonalMaior = scanner.nextDouble();
			
			System.out.print("Digite a diagonal menor do losango: ");
			diagonalMenor = scanner.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Erro: Entrada inválida. Certifique-se de digitar valores numéricos corretos.");
			// Realizar alguma ação adicional, se necessário
			
			// Definir valores padrão ou sair do programa, conforme necessário
			System.exit(1);
		} finally {
			scanner.close();
		}
	}

	public double calculaArea() {
		return area = (diagonalMaior * diagonalMenor) / 2;
	}

	public double calculaPerimetro() {
		return perimetro = lado * 4;
	}

	public void mostraValores() {
		System.out.println("Perímetro: " + calculaPerimetro());
		System.out.println("Área: " + calculaArea());
		System.out.println("Lado: " + lado);
		System.out.println("Diagonal Maior: " + diagonalMaior);
		System.out.println("Diagonal Menor: " + diagonalMenor);
	}
}
