package Models;
public class Produto {
    private int codigo;
    private String descricao, tipo, validade;
    private double valor;

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public String getValidade() {
        return validade;
    }

    public Produto(int codigo, String descricao, String tipo, double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.valor = valor;
    }

}
