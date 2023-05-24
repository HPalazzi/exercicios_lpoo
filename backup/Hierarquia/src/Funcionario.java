
public abstract class Funcionario {
	
	//Variaveis e métodos
	
	String nome;
	String matricula;
	double salario_base;
	
	public double calculaSalario() {
		return salario_base;
		
	};
	
	//Contrutor da classe funcionario
	
	public Funcionario(String nome, String matricula, double salario_base) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.salario_base = salario_base;
	}
	
	//Ecapsulamento
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getSalario_base() {
		return salario_base;
	}
	public void setSalario_base(double salario_base) {
		this.salario_base = salario_base;
	}
	
	
}
