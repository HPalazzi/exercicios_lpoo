import java.lang.Math;

public class Quadrado extends FormaGeometrica{
	
	double lado;

	public double calculaArea() {
		return area = Math.pow(lado, 2);
	}

	public double calculaPerimetro() {
		return perimetro = 4*lado;
	}

	public void mostraValores() {
		System.out.println("Perimetro: "+calculaPerimetro());
		System.out.println("Area: "+calculaArea());
		System.out.println("Lado: "+lado);
	}
	
	

}