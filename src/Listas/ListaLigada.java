package Listas;

import java.util.List;

public class ListaLigada {

    private No primeiroNo, ultimoNo;

    private int quantidadeNo;

    public ListaLigada() {

        primeiroNo = null;

        ultimoNo = null;

        quantidadeNo = 0;
    }

    public void adicionar(Object info) {
        No novoNo;

        if (primeiroNo == null) {

            novoNo = new No(info, null);

            primeiroNo = ultimoNo = novoNo;

        } else {
            novoNo = new No(info, null);

            ultimoNo.setProximo(novoNo);

            ultimoNo = novoNo;
        }

        quantidadeNo++;

    }

    public void adicionar(Object info, int indice) {
        No novoNo;
        // adiciona um novo nó na posição definida pelo índice.
        // se o índice for maior que a quantidadeNó, adiciona na última posição;
        // se o índice for menor que zero, não faz nada.

        if (indice >= 0) {

            if (indice > quantidadeNo - 1) {
                adicionar(info);
            }

        }

        else if (indice == 0) {
            // Para adicionar o Nó na primeira posição
            // é necessário referenciar o primeiroNó ao atual.

            novoNo = new No(info, primeiroNo);

            primeiroNo = novoNo;

            quantidadeNo++;

        }

        else {
            // todos os casos onde será adicionado no meio da lista //
            // aux recebe ref. para nó de índice -1 //
            No aux = percorrerLista(indice - 1);
            // novoNo é criado com a ref. para próximo Nó, como aux ====> proxmoNo
            novoNo = new No(info, aux.getProximo());
            // aux atualiza a ref. para o próximo nó, atribuindo o Novo nó ao próximo
            aux.setProximo(novoNo);

            quantidadeNo++;

        }
    }

    public String exibirLista() {
        String retorno = "Lista: ";

        No aux = primeiroNo;

        while (aux.getProximo() != null) {
            retorno += aux.getInfo() + " ";
            // percorre a lista
            aux = aux.getProximo();
        }

        retorno += aux.getInfo();
        return retorno;
    }

    public String getLista(int indice) {

        return percorrerLista(indice).getInfo().toString();

    }

    public void remover(int indice) {

        No aux;
        if (indice == 0) {
            // remove da primeira posição da lista
            primeiroNo = primeiroNo.getProximo();
            quantidadeNo--;
        }

        else if (indice == quantidadeNo - 1) {
            // remove da última posicao da lista
            aux = percorrerLista(indice-1);
            aux.setProximo(null);
            ultimoNo = aux;
        }

        else {
            // remove de qualquer posição da lista
            aux = percorrerLista(indice - 1);
            aux.setProximo(aux.getProximo().getProximo());
            quantidadeNo--;
        }
    }

    private No percorrerLista(int indice) {

        if (indice >= 0 && indice < quantidadeNo) {
            No aux = primeiroNo;

            for (int i = 0; i < indice; i++) {
                aux = aux.getProximo();
            }

            return aux;
        } else {
            return null;
        }
    }

}
