package Pilhas;

import java.util.*;

public class PilhaInteger {
    
    private List<Integer> pilha = new ArrayList<Integer>();

    public void empilhar(Integer item){
        pilha.add(item);
    }


    public Integer desempilhar(){

        if (!pilha.isEmpty()){
            
            return pilha.remove(pilha.size() - 1);
        
        }

        return null;

    }

        public Integer exibirTopo(){

        if (!pilha.isEmpty()){
            
            return pilha.get(pilha.size() - 1);
        
        }

        return null;

    }

    public boolean pilhaVazia(){

        return pilha.isEmpty();

    }
}
