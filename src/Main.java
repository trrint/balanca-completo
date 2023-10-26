import Filizola.filizola;
import Models.*;
import Toledo.toledo;
import Urano.urano;

import java.io.*;
import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Coloque o seu diretorio que deseja exportar os arquivos: ");
        String caminho = s.nextLine();

        if(s.nextLine() != null){
            List<Produto> listProduct = new ArrayList<>();
            Produto produto1 = new Produto(184, "P", "QUEIJO GRUYERE KG", 21.90);
            Produto produto2 = new Produto(288, "P", "QUEIJO PROVOLETE KG", 12.29);
            listProduct.add(produto1);
            listProduct.add(produto2);

            urano u = new urano();
            u.exportar(listProduct, caminho);

            toledo t = new toledo();
            t.exportar(listProduct, caminho);

            filizola f = new filizola();
            f.exportar(listProduct, caminho);
        }
    }
}