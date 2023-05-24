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

    public static void main(String[] args) {
        try {
            LocalDate data = LocalDate.of(2023, 5, 24);
            String descDespesa = "Exemplo de despesa";
            double valor = Double.parseDouble("10.5"); // Aqui você pode substituir pela entrada do usuário

            Despesa despesa = new Despesa(data, descDespesa, valor);
            System.out.println(despesa.toString());
        } catch (NumberFormatException e) {
            System.out.println("Erro: o valor inserido não é um número válido.");
        }
    }
}
