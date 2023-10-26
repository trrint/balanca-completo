package Filizola;

import Models.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class filizola implements Balanca<Produto> {
    @Override
    public void exportar(List<Produto> produtos, String caminho) {
        try (FileWriter writer = new FileWriter(caminho + "/PRODUTOS.txt")) {
            for (Produto produto : produtos) {
                String codigo = String.format("%06d", produto.getCodigo());
                String tipoProduto = produto.getTipo();
                String descricao = String.format("%-22s", produto.getDescricao());
                int valorCentavos = (int) (produto.getValor() * 1000);
                String valorFormatado = String.format("%07d", valorCentavos);
                String validade = (produto.getValidade() != null ? produto.getValidade() : "000");

                String linha = codigo + tipoProduto + descricao + valorFormatado + validade + "D";

                System.out.println(linha);
                writer.write(linha + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Erro ao exportar os produtos para o arquivo.");
        }
    }
}
