package Listas;

public class No {

    private Object info;

    private No proximo;

    public No (Object info, No proximo){
        this.info = info;
        this.proximo = proximo;
    }

    //Getter's //

    public Object getInfo() {
        return info;
    }

    public No getProximo() {
        return proximo;
    }

    // ### //

    // Setter's //

    public void setInfo(Object info) {
        this.info = info;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    // ### // 



}
