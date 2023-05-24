package despesas_pessoais;

import java.time.LocalDate;

public class Despesa {
    private LocalDate data;
    private String descDespesa;
    private double valor;

    public Despesa(LocalDate data, String descDespesa, double valor) {
        this.data = data;
        this.descDespesa = descDespesa;
        this.valor = valor;
    }

    public LocalDate getDate() {
        return data;
    }

    public void setDate(LocalDate data) {
        this.data = data;
    }

    public String getDescDespesa() {
        return descDespesa;
    }

    public void setDescDespesa(String descDespesa) {
        this.descDespesa = descDespesa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String toString() {
        return "Data: " + data.toString() + ", Descrição: " + descDespesa + ", Valor: " + valor;
    }
}