package Pilhas;

public class PilhaArray {

    Object[] vetorPilha;

    int topo = 0;

    public PilhaArray(int tamanho) {

        vetorPilha = new Object[tamanho];

    }

    public boolean empilhar(Object item) {

        if (vetorPilha.length == topo) {

            return false;

        } else {
            topo++;

            vetorPilha[topo] = item;

            return true;
        }
    }

    public Object desempilhar() {

        if (topo == 0) {

            return null;
        } 
        
        else {

            topo--;

            return vetorPilha[topo];
        }

       
    }

    public boolean pilhaVazia() {

        if (topo == 0) {

            return true;

        }

        else {

            return false;
        }
    }
}
