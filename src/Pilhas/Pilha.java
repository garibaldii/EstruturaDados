package Pilhas;

public class Pilha implements InterfacePilha {

    @Override
    public void empilhar(Object item) {

        pilha.add(item);

    }

    @Override
    public Object desempilhar() {

        if (!pilha.isEmpty()) {

            return pilha.remove(pilha.size() - 1);
        } else {

            return null;

        }
    }

    @Override

    public boolean pilhaVazia() {

        return pilha.isEmpty();

    }

    public static boolean validaBalanceamento(String expressao) {

        PilhaString p = new PilhaString();

        for (int i = 0; i < expressao.length(); i++) {

            p.empilhar(Character.toString((expressao.charAt(i))));
        }

        return false;
    }

    public static void main(String[] args) {

        // PilhaString pString = new PilhaString();

        // pString.empilhar("A");
        // pString.empilhar("B");
        // pString.empilhar("C");

        // while (!pString.pilhaVazia()) {

        //     System.out.println(pString.desempilhar());

        // }

        // System.out.println(ExercicioPilha.palindromo("[({{}})]"));



        PilhaInteger pilhaEntrada = new PilhaInteger();

        pilhaEntrada.empilhar(1);
        pilhaEntrada.empilhar(3);
        pilhaEntrada.empilhar(2);
        pilhaEntrada.empilhar(5);
        pilhaEntrada.empilhar(4);

        System.out.println(ExercicioPilha.ordenaPilhaInteger(pilhaEntrada));

    }

}
