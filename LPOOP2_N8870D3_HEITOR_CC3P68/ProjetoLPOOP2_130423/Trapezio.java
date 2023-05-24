import java.util.InputMismatchException;
import java.util.Scanner;

public class Trapezio extends FormaGeometrica {
	
	double altura;
	double baseMaior;
	double baseMenor;
	double ladoEsquerdo;
	double ladoDireito;

	public double calculaArea() {
		return area = ((baseMaior + baseMenor) * altura) / 2;
	}

	public double calculaPerimetro() {
		return perimetro = baseMaior + baseMenor + ladoDireito + ladoEsquerdo;
	}

	public void mostraValores() {
		System.out.println("Perímetro: " + calculaPerimetro());
		System.out.println("Área: " + calculaArea());
		System.out.println("Altura: " + altura);
		System.out.println("Base Maior: " + baseMaior);
		System.out.println("Base Menor: " + baseMenor);
		System.out.println("Lado Esquerdo: " + ladoEsquerdo);
		System.out.println("Lado Direito: " + ladoDireito);
	}
	
	public void lerValores() {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("Altura: ");
			altura = scanner.nextDouble();
			
			System.out.print("Base Maior: ");
			baseMaior = scanner.nextDouble();
			
			System.out.print("Base Menor: ");
			baseMenor = scanner.nextDouble();
			
			System.out.print("Lado Esquerdo: ");
			ladoEsquerdo = scanner.nextDouble();
			
			System.out.print("Lado Direito: ");
			ladoDireito = scanner.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Erro: Entrada inválida. Certifique-se de inserir um valor numérico válido.");
			// Limpa o buffer do scanner para evitar loop infinito
			scanner.nextLine();
		}
	}
}
