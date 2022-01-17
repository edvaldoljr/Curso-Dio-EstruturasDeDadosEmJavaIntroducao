package com.projeto.aula2.pilhas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Instanciando nossa classe pilha
        Pilha minhaPilha = new Pilha();

        //Agora vamos empilhar alguns números
        minhaPilha.push(new No(1));
        minhaPilha.push(new No(2));
        minhaPilha.push(new No(3));
        minhaPilha.push(new No(4));
        minhaPilha.push(new No(5));
        minhaPilha.push(new No(6));

        System.out.println(minhaPilha);

        //Removendo um obj
        System.out.println(minhaPilha.pop());

        System.out.println(minhaPilha);

        //Agora vamos empilhar mais 1 números
        minhaPilha.push(new No(99));

        System.out.println(minhaPilha);
    }
}


