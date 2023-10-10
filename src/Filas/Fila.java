package Filas;

import java.util.ArrayList;
import java.util.List;

public class Fila {
    // variável fila está sendo DECLARADA
    private List<Object> fila;

    public Fila() {
        // variável fila está sendo INSTANCIADA
        fila = new ArrayList<Object>();
    }

    public void adicionar(Object item) {
        this.fila.add(item);
    }

    public Object remover() {

        if (!fila.isEmpty()) {
            return fila.remove(0);
        }
        return null;
    }

    public Object exibirInicio() {
        return fila.get(0);
    }

    public int tamanho() {
        return fila.size();
    }

}
