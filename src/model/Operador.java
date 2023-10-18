package model;

public class Operador extends Funcionario {
    private double valor_hora;

    public Operador() {

    }

    public Operador(int idFunc, String nome, String email, String documento, double valor_hora) {
        super(idFunc, nome, email, documento);
        this.valor_hora = valor_hora;
    }

    public double getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(double valor_hora) {
        this.valor_hora = valor_hora;
    }
}
