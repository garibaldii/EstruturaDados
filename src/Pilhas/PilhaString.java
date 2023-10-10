package Pilhas;

import java.util.*;

public class PilhaString {

    private List<String> pilha = new ArrayList<String>();

    public void empilhar(String item) {
        pilha.add(item);
    }

    public String desempilhar() {

        if (!pilha.isEmpty()) {

            return pilha.remove(pilha.size() - 1);

        }

        return null;

    }

    public String exibirTopo() {

        if (!pilha.isEmpty()) {

            return pilha.get(pilha.size() - 1);

        }

        return null;

    }

    public boolean pilhaVazia() {

        return pilha.isEmpty();

    }
}
