package com.projeto.aula5.lista.dublamente.encadeada;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private  int tamanhoLista;

    public ListaDuplamenteEncadeada(){
        primeiroNo = null;
        ultimoNo = null;
        this.tamanhoLista = 0;
    }

    //Método size()
    public int size(){
        return tamanhoLista;
    }
}
