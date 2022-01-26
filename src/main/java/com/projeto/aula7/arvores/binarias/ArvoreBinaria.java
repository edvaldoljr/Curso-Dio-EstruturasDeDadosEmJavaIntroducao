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

    //Métodos de exibição

    //Exibição in ordem
    public void exibirInOrdem(){
        System.out.println("\n Exibindo em Ordem");
        exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(BinNo<T> atual){
        if (atual != null){
            exibirInOrdem(atual.getNoEsq());
            System.out.println(atual.getConteudo() + ",");
            exibirInOrdem(atual.getNoDir());
        }
    }

    //Método exibição pos ordem
    public void exibirPosOrdem(){
        System.out.println("\n Exibindo PosOrdem");
        exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(BinNo<T> atual){
        if (atual != null){
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.println(atual.getConteudo() + ",");
        }
    }

    //Método exibição pre ordem
    public void exibirPreOrdem(){
        System.out.println("\n Exibindo em PreOrdem");
        exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(BinNo<T> atual){
        if (atual != null){
            System.out.println(atual.getConteudo() + ",");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }
    }

}