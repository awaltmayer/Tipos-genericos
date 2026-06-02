package br.edu.atitus.augusto_wolfart_altmayer;

public class Pedido {
    private int numero;
    private double valor;

    public Pedido(int numero, double valor) {
        this.numero = numero;
        this.valor = valor;
    }

    public int getNumero()  { return numero; }
    public double getValor() { return valor; }

    @Override
    public String toString() {
        return "Pedido{numero=" + numero + ", valor=R$" + String.format("%.2f", valor) + "}";
    }
}