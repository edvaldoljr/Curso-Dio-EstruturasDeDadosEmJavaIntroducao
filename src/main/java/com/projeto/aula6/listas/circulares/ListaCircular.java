package com.projeto.aula6.listas.circulares;

public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    //Método isEmpty()
    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }

    //Método size()
    public int size() {
        return this.tamanhoLista;
    }

}
