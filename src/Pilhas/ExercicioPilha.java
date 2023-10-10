package Pilhas;

import java.util.ArrayList;
import java.util.List;

public class ExercicioPilha {

    public static boolean palindromo(String palavra) {

        String palavraInvertida = "";

        palavra = palavra.toLowerCase();

        PilhaString p = new PilhaString();

        for (int i = 0; i < palavra.length(); i++) {

            p.empilhar(Character.toString((palavra.charAt(i))));
        }
        while (!p.pilhaVazia()) {

            palavraInvertida += p.desempilhar();

        }

        if (palavra.equals(palavraInvertida)) {

            return true;

        }

        else
            return false;

    }

    public static PilhaInteger ordenaPilhaInteger(PilhaInteger pilhaEntrada) {

        List<PilhaInteger> aux = new ArrayList<PilhaInteger>();

        aux.add(new PilhaInteger());

        boolean empilhado = false;

        PilhaInteger pilhaSaida = new PilhaInteger();

        //int temp = 0;

        //int indiceTemp = 0;

        while (!pilhaEntrada.pilhaVazia()) {

            if (aux.get(0).pilhaVazia()) {

                aux.get(0).empilhar(pilhaEntrada.desempilhar());

            }

            else {

                for (int i = 0; i < aux.size(); i++) {

                    if (pilhaEntrada.exibirTopo() >= aux.get(i).exibirTopo()) {

                        aux.get(i).empilhar(pilhaEntrada.desempilhar());

                        empilhado = true;

                        break;

                    }

                }

                if (empilhado == false) {

                    aux.add(new PilhaInteger());

                    aux.get(aux.size() - 1).empilhar(pilhaEntrada.desempilhar());
                }
            }
        }

        while (!aux.isEmpty()) {

            for (int i = 0; i < aux.size(); i++) {

                if ( pilhaSaida.exibirTopo() >= aux.get(i).exibirTopo()){

                    pilhaSaida.empilhar(aux.get(i).desempilhar());

                    
                }

            }

        }

        return pilhaSaida;
    }
}