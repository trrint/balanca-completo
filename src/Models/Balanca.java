package Models;

import java.util.List;
public interface Balanca<T> {
    void exportar(List<T> produtos, String caminho);
}
