package despesas_pessoais;

import java.time.LocalDate;
import java.util.ArrayList;

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
}