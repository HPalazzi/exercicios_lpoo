package despesas_pessoais;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DespesaPessoal {
    private String cpf;
    private ArrayList<Despesa> itens;

    public DespesaPessoal(String cpf) {
        this.cpf = cpf;
        this.itens = new ArrayList<Despesa>();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void addDespesa(Despesa despesa) {
        itens.add(despesa);
    }

    public double getTotal() {
        double total = 0;
        for (Despesa d : itens) {
            total += d.getValor();
        }
        return total;
    }

    public double getTotal(int mes, int ano) {
        double total = 0;
        for (Despesa d : itens) {
            LocalDate data = d.getDate();
            if (data.getMonthValue() == mes && data.getYear() == ano) {
                total += d.getValor();
            }
        }
        return total;
    }

    public double getTotal(LocalDate data) {
        double total = 0;
        for (Despesa d : itens) {
            if (d.getDate().isEqual(data)) {
                total += d.getValor();
            }
        }
        return total;
    }

    public void imprime() {
        for (Despesa d : itens) {
            System.out.println(d.toString());
        }
        System.out.println("Total: " + getTotal());
    }

    public void imprime(int mes, int ano) {
        for (Despesa d : itens) {
            LocalDate data = d.getDate();
            if (data.getMonthValue() == mes && data.getYear() == ano) {
                System.out.println(d.toString());
            }
        }
        System.out.println("Total: " + getTotal(mes, ano));
    }

    public void imprime(LocalDate data) {
        for (Despesa d : itens) {
            if (d.getDate().isEqual(data)) {
                System.out.println(d.toString());
            }
        }
        System.out.println("Total: " + getTotal(data));
    }

    public String toString() {
        return "CPF: " + cpf + ", Total: " + getTotal();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DespesaPessoal despesaPessoal = null;

        try {
            System.out.print("Digite o CPF: ");
            String cpf = scanner.nextLine();

            despesaPessoal = new DespesaPessoal(cpf);
        } catch (Exception e) {
            System.out.println("Erro ao criar a DespesaPessoal. Certifique-se de que o CPF foi digitado corretamente.");
            return;
        }

        boolean continuar = true;
        while (continuar) {
            System.out.println("Opções:");
            System.out.println("1. Adicionar despesa");
            System.out.println("2. Imprimir despesas");
            System.out.println("3. Imprimir total de despesas");
            System.out.println("4. Sair");
            System.out.print("Digite a opção desejada: ");

            try {
                int opcao = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer

                switch (opcao) {
                    case 1:
                        System.out.print("Digite a descrição da despesa: ");
                        String descricao = scanner.nextLine();

                        System.out.print("Digite o valor da despesa: ");
                        double valor = scanner.nextDouble();
                        scanner.nextLine(); // Limpar o buffer

                        Despesa despesa = new Despesa(descricao, valor);
                        despesaPessoal.addDespesa(despesa);
                        break;
                    case 2:
                        despesaPessoal.imprime();
                        break;
                    case 3:
                        System.out.print("Digite o mês: ");
                        int mes = scanner.nextInt();

                        System.out.print("Digite o ano: ");
                        int ano = scanner.nextInt();
                        scanner.nextLine(); // Limpar o buffer

                        despesaPessoal.imprime(mes, ano);
                        break;
                    case 4:
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opção inválida. Digite novamente.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Certifique-se de que um valor numérico foi digitado corretamente.");
                scanner.nextLine(); // Limpar o buffer
            }
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
