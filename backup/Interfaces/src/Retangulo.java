public class Retangulo extends FormaGeometrica{
	
	double ladoA;
	double ladoB;

	public double calculaArea() {
		return area = ladoA * ladoB;
	}

	public double calculaPerimetro() {
		return perimetro = 2*ladoA + 2*ladoB;
	}

	public void mostraValores() {
		System.out.println("Perimetro: "+calculaPerimetro());
		System.out.println("Area: "+calculaArea());
		System.out.println("LadoA: "+ladoA);
		System.out.println("LadoB: "+ladoB);
	}
	
	

}