
public class Teste {

	public static void main(String[] args) {
		Gerente g = new Gerente("Heitor", "1234", 10000);
		Assistente a = new Assistente("Palazzi", "5678", 1500);
		Vendedor v = new Vendedor("Oliveira", "9101112", 1500, 3);
		
		double salarioGerente = g.calculaSalario();
		double salarioAssistente = a.calculaSalario();
		double salarioVendedor = v.calculaSalario();
		
		System.out.println(salarioGerente + salarioAssistente + salarioVendedor);
	}
}
