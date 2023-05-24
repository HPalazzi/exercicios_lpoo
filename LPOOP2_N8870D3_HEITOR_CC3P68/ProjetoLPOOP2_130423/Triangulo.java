import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangulo extends FormaGeometrica {
	
	double ladoEsquerdo;
	double ladoBase;
	double ladoDireito;
	double altura;

	public double calculaArea() {
		return area = (ladoBase * altura) / 2;
	}

	public double calculaPerimetro() {
		return perimetro = ladoBase + ladoDireito + ladoEsquerdo;
	}

	public void mostraValores() {
		System.out.println("Perímetro: " + calculaPerimetro());
		System.out.println("Área: " + calculaArea());
		System.out.println("Lado Esquerdo: " + ladoEsquerdo);
		System.out.println("Lado Direito: " + ladoDireito);
		System.out.println("Lado Base: " + ladoBase);
		System.out.println("Altura: " + altura);
	}

	public void lerValores() {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Digite o valor do Lado Esquerdo: ");
			ladoEsquerdo = scanner.nextDouble();

			System.out.print("Digite o valor do Lado Direito: ");
			ladoDireito = scanner.nextDouble();

			System.out.print("Digite o valor do Lado Base: ");
			ladoBase = scanner.nextDouble();

			System.out.print("Digite o valor da Altura: ");
			altura = scanner.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Erro: Valor inválido. Certifique-se de inserir um número válido.");
			scanner.nextLine(); // Limpa o buffer do scanner
			                      // para evitar loops infinitos em caso de erro de entrada
			lerValores(); // Chama recursivamente o método para ler os valores corretos
		}
	}
}
