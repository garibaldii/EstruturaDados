package Listas;

public class PrincipalLista {

    public static void adicionarLista(){

        ListaLigada lista = new ListaLigada();
        lista.adicionar(1); // índice 0
        lista.adicionar(2); // índice 1
        lista.adicionar(3); // índie 2
        System.out.println(lista.exibirLista());
        lista.adicionar(8, 1);
        System.out.println(lista.exibirLista());
        lista.remover(0);
        System.out.println(lista.exibirLista());

    }



}
