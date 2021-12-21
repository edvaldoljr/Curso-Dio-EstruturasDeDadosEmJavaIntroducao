package com.projeto.aula1.encadeamentodeno;

public class Main {

    public static void main(String[] args) {

        //Criando e instanciando o no1
        No<String> no1 = new No<>("Conteudo no1");

        //Criando e instanciando o no2
        No<String> no2 = new No<>("Conteudo no2");

        /**
         * Vamos fazer o encadeamento do no1 com o no 2,
         * vamos a referencia do no1 aponta no no2
         * no1 -> no2 -> no3 -> no4 -> null
         */

        //Apontando no1 para o no2
        no1.setProximoNo(no2);

        //Criando e instanciando o no3
        No<String> no3 = new No<>("Conteudo no3");

        //Apontando no2 para o no3
        no2.setProximoNo(no3);

        //Criando e instanciando o no4
        No<String> no4 = new No<>("Conteudo no4");

        //Apontando no3 para o no4
        no3.setProximoNo(no4);

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2);

        System.out.println("--------------");

        System.out.println(no1);

        // no1 -> no2
        System.out.println(no1.getProximoNo());

        //no1 -> no2 -> no3
        System.out.println(no1.getProximoNo().getProximoNo());

        //no1 -> no2 -> no3 -> no4
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());

        //no1 -> no2 -> no3 -> no4 -> null
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }
}
