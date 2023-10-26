package Urano;

import Models.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class urano implements Balanca<Produto> {
    @Override
    public void exportar(List<Produto> produtos, String caminho) {
        try (FileWriter writer = new FileWriter(caminho + "/CADTXT.txt")) {
            for (Produto produto : produtos) {
                String codigo = String.format("%06d", produto.getCodigo());
                String tipoProduto = produto.getTipo();
                String descricao = String.format("%-20s", produto.getDescricao());
                int valorCentavos = (int) (produto.getValor() * 1000);
                String valorFormatado = String.format("%09d", valorCentavos);
                String validade = (produto.getValidade() != null ? produto.getValidade() : "000") + "0";

                String linha = codigo + "*" + tipoProduto + descricao + valorFormatado + validade;

                writer.write(linha + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Erro ao exportar os produtos.");
        }
    }
}
