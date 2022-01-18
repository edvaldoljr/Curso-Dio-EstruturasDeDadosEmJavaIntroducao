package com.projeto.Aula4.listas.encadeadas;

public class ListaEncadeada<T> {

    No<T> referenciaEntrada;

    public ListaEncadeada(){
        this.referenciaEntrada = null;
    }

    //Método size vai retornar o tamanho da minha lista
    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;
        while (true){
            if (referenciaAux != null){
                tamanhoLista++;
                if (referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                }else {
                    break;
                }
            }else {
                break;
            }
        }

        return tamanhoLista;
    }

    //Método para verificar se minha Lista está vazia
    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }


}
