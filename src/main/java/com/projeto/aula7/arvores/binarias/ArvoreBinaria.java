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

    //Método remover
    public void remover(T conteudo){
        try {
            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temp = null;

            while (atual != null && atual.getConteudo().equals(conteudo)){
                pai = atual;
                if (conteudo.compareTo(atual.getConteudo()) < 0){
                    atual = atual.getNoEsq();
                }else {
                    atual = atual.getNoDir();
                }
            }

            if (atual == null){
                System.out.println("Conteudo não encontrado, bloco try");
            }

            if (pai == null){
                if (atual.getNoDir() == null){
                    this.raiz = atual.getNoEsq();
                }else if (atual.getNoEsq() == null){
                    this.raiz = atual.getNoDir();
                }else {
                    for (temp = atual, filho = atual.getNoEsq();
                         filho.getNoDir() != null;
                         temp = filho, filho = filho.getNoEsq()
                    ){
                        if (filho != atual.getNoEsq()){
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(raiz.getNoEsq());
                        }
                    }
                    filho.setNoDir(raiz.getNoDir());
                    raiz = filho;
                }

            }else if (atual.getNoDir() == null){
                if (pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoEsq());
                }else {
                    pai.setNoDir(atual.getNoEsq());
                }
            }else if (atual.getNoEsq() == null){
                if (pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoDir());
                }else {
                    pai.setNoDir(atual.getNoDir());
                }
            }else {

            }

        }catch (NullPointerException erro){
            System.out.println("Conteudo não encontrado, bloco catch ");
        }
    }
}
