
public class Triangulo extends FormaGeometrica{
	
	double ladoEsquerdo;
	double ladoBase;
	double ladoDireito;
	double altura;

	public double calculaArea() {
		return area = (ladoBase*altura)/2;
	}

	public double calculaPerimetro() {
		return perimetro = ladoBase+ladoDireito+ladoEsquerdo;
	}

	public void mostraValores() {
		System.out.println("Perimetro: "+calculaPerimetro());
		System.out.println("Area: "+calculaArea());
		System.out.println("Lado Esquerdo: "+ladoEsquerdo);
		System.out.println("Lado Direito: "+ladoDireito);
		System.out.println("Lado Base: "+ladoBase);
		System.out.println("Altura: "+altura);
	}
	
	

}