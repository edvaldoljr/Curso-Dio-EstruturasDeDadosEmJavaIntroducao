package com.projeto.aula3.filas;

public class No {

    //Vamos utilizar o Object para podermos criar qualquer tipo de objeto
    private Object object; //object é o conteúdo do meu No

    //Referencia de No
    private No refNo;

    //Construtor vazio
    public No() {
    }

    //Construtor recebendo um Object
    public No(Object object) {
        this.refNo = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }
}
