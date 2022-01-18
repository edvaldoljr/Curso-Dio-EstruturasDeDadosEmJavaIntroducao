package com.projeto.Aula4.listas.encadeadas;

public class No<T> {

    private T conteudo;

    private No proximoNo;

    //Contrutor vazio
    public No(){
        this.proximoNo = null;
    }

    //Construtor passando apenas o conteúdo
    public No(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    //Construtor passando o conteúdo e o próximo No
    public No(T conteudo, No proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }

    public String toStringEncadeado(){
        String str = "No{" +
                "conteudo=" + conteudo +
                '}';

        if (proximoNo != null) {
            str += "->" + proximoNo.toString();
        }else {
            str += "-> null";
        }
        return str;
    }
}