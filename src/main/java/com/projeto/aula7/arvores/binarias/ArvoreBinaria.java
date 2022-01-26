package com.projeto.aula7.arvores.binarias;

public class ArvoreBinaria<T extends  Comparable<T>> {

    private BinNo<T> raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }

    //Método para chamar o método inserir
    public void inserir(T conteudo){
        BinNo<T> novoNo = new BinNo<T>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    //Método inserir onde vamos inserir nos na nossa árvore
    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo){
        if (atual == null){
            return novoNo;
        }else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        }else {
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        return atual;
    }
}
