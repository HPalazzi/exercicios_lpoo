
public class Vendedor extends Funcionario{
	
	double comissao;
	
	public Vendedor(String nome, String matricula, double salario_base, double comissao) {
		super(nome, matricula, salario_base);

	}
	
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double calculaSalario() {
		return salario_base * comissao;
		
	};
}
