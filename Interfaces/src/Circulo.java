import java.lang.Math;

public class Circulo extends FormaGeometrica{
	
	double raio;

	public double calculaArea() {
		return area = PI*Math.pow(raio, 2);
	}

	public double calculaPerimetro() {
		return perimetro = 2*PI*raio;
	}

	public void mostraValores() {
		System.out.println("Perimetro: "+calculaPerimetro());
		System.out.println("Area: "+calculaArea());
	}
	
	

}
