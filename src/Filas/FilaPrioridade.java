package Filas;

import java.util.ArrayList;
import java.util.List;

public class FilaPrioridade {
    private List<Object> filaPrioridade;

    public FilaPrioridade() {

        filaPrioridade = new ArrayList<Object>();
    }

    public void adicionar(Object item) {

        boolean foiAdicionado = false;

        if (filaPrioridade.isEmpty()) {

            this.filaPrioridade.add(item);
            foiAdicionado = true;
        } 
        else {
            for (int i = 0; i < filaPrioridade.size(); i++) {

                if (Integer.parseInt(filaPrioridade.get(i).toString()) > Integer.parseInt(item.toString())) {

                    filaPrioridade.add(i, item);
                    foiAdicionado = true;

                    break;
                }
            }
        }
        if (foiAdicionado == false) {
            filaPrioridade.add(item);
        }

    }

    public Object remover() {

        if (!filaPrioridade.isEmpty()) {
            return filaPrioridade.remove(0);
        }
        return null;
    }

    public Object exibirInicio() {
        return filaPrioridade.get(0);
    }

    public int tamanho() {
        return filaPrioridade.size();
    }
}