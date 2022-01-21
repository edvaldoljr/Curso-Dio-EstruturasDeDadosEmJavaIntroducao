package com.projeto.aula6.listas.circulares;

public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    //Método get()
    public  T get(int index){
        return this.getNo(index).getConteudo();
    }

    //Método getNo()
    private No<T> getNo(int index){
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("A Lista está vazia");
        }
        if (index == 0){
            return this.cauda;
        }
        No<T> noAuxiliar = this.cauda;
        for (int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    //Método isEmpty()
    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }

    //Método size()
    public int size() {
        return this.tamanhoLista;
    }

}
