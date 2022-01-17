package com.projeto.aula3.filas;

//Refatorando a classe No
public class No<T> {

    //Vamos utilizar o Object para podermos criar qualquer tipo de objeto
    private T object; //object é o conteúdo do meu No

    //Referencia de No
    private No<T> refNo;

    //Construtor vazio
    public No() {
    }

    //Construtor recebendo um Object
    public No(T object) {
        this.refNo = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
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
