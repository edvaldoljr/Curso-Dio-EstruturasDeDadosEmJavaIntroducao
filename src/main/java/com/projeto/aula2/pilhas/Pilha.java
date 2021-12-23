package com.projeto.aula2.pilhas;

public class Pilha {

    private No proximoNoEntradaNaPilha;

    public Pilha() {
        this.proximoNoEntradaNaPilha = null;
    }

    // Método para Inserir elementos na Pilha
    public  void push(No novoNo){
        //estamos criando um variável para guarda a referência de entrada
        No auxiliar = proximoNoEntradaNaPilha;
        proximoNoEntradaNaPilha = novoNo;
        proximoNoEntradaNaPilha.setProximoNo(auxiliar);
    }

    // Método para Retirar elementos da Pilha
    public No Pop() {
        //Se minha pilha não estiver fazia
        if (!this.isEmpty()) {
            No noPoped = proximoNoEntradaNaPilha;
            proximoNoEntradaNaPilha =proximoNoEntradaNaPilha.getProximoNo();
            return noPoped;

        }
        return null;
    }

    // com top vamos retorna a referência do topo, mais ele ainda vai continuar na pilha só vamos visualizar o elemento.
    public No top() {
        return proximoNoEntradaNaPilha;
    }

    //Verifica se nosso No ou lista esta null ou vazio
    public boolean isEmpty() {
//
//        if (proximoNoEntradaNaPilha == null) {
//            return true;
//        }

        return proximoNoEntradaNaPilha == null ? true : false;
    }
}
