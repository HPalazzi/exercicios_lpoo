public abstract class Funcionario {

    // Variáveis e métodos

    String nome;
    String matricula;
    double salario_base;

    public double calculaSalario() {
        return salario_base;
    }

    // Construtor da classe Funcionario

    public Funcionario(String nome, String matricula, double salario_base) {
        super();
        this.nome = nome;
        this.matricula = matricula;
        this.salario_base = salario_base;
    }

    // Encapsulamento

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

    // Método para tratar exceções ao ler um valor double

    public double lerDouble(String mensagem) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print(mensagem);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido. Por favor, digite um número válido.");
            }
        }
    }
}
