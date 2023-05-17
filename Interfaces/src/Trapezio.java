
public class Trapezio extends FormaGeometrica{
	
	double altura;
	double baseMaior;
	double baseMenor;
	double ladoEsquerdo;
	double ladoDireito;

	public double calculaArea() {
		return area = ((baseMaior+baseMenor)*altura)/2;
	}

	public double calculaPerimetro() {
		return perimetro = baseMaior+baseMenor+ladoDireito+ladoEsquerdo;
	}

	public void mostraValores() {
		System.out.println("Perimetro: "+calculaPerimetro());
		System.out.println("Area: "+calculaArea());
		System.out.println("altura: "+altura);
		System.out.println("Base Maior: "+baseMaior);
		System.out.println("Base Menor: "+baseMenor);
		System.out.println("Lado Esquerdo: "+ladoEsquerdo);
		System.out.println("Lado Direito: "+ladoDireito);
	}
	
	

}