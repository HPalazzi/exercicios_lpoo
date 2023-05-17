
public class Losango extends FormaGeometrica{
	
	double lado;
	double diagonalMaior;
	double diagonalMenor;

	public double calculaArea() {
		return area = (diagonalMaior*diagonalMenor)/2;
	}

	public double calculaPerimetro() {
		return perimetro = lado*4;
	}

	public void mostraValores() {
		System.out.println("Perimetro: "+calculaPerimetro());
		System.out.println("Area: "+calculaArea());
		System.out.println("Lado: "+lado);
		System.out.println("Diagonal Maior: "+diagonalMaior);
		System.out.println("Diagonal Menor: "+diagonalMenor);
	}
	
	

}