package Pilhas;

import java.util.ArrayList;
import java.util.List;

public interface InterfacePilha {
    
    List<Object> pilha = new ArrayList<>();

    public void empilhar(Object item);

    public Object desempilhar();

    public boolean pilhaVazia();
}
