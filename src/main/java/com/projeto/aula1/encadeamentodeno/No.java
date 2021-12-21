package com.projeto.aula1.encadeamentodeno;

/**
 * Utilizando os conceitos de Generics vamos refatorar nossa classe No
 * No momento nossa clase No está recebendo apenas um tipo de dados do tipo String,
 * e queremos receber qualquer tipos de dado
 * então vamos refatorar a nossa classe No.
 * Primeiro deixamos a nossa classe genérica utilizando uma convenção ( <T> ) = No<T> fazendo que agora,
 * nossa classe aceite tipos genéricos
 *
 * Refatoração:
 * Refatoração (do inglês Refactoring) é o processo de modificar um sistema de software para melhorar a estrutura interna do código
 * sem alterar seu comportamento externo. O uso desta técnica aprimora a concepção (design)
 * de um software e evita a deterioração tão comum durante o ciclo de vida de um código. Esta deterioração é
 * geralmente causada por mudanças com objetivos de curto prazo ou por alterações realizadas sem a clara
 * compreensão da concepção do sistema.
 */
public class No<T> {

    //Agora podemos ter nos de varios tipos não só mais Strings
    private T conteudo;
    //Também podemos especificar que nosso próximo no irá receber tipos genéricos <T>
    private No<T> proximoNo;

    public No(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
