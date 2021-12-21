package com.projeto.atribuicaoreferencia;

public class Main {

    public static void main(String[] args) {

        /**
         * Podemos ver nesse exemplo que o número será copiado o valor não a referência de memória e quando
         * modificar o valor de A, o valor de B não irá mudar na outra por que fizemos
         * uma cópia.
         * Saida:
         * intA = 1 intB = 1
         * intA = 2 intB = 1
         */
        int intA = 1;
        int intB = intA;

        System.out.println("intA = " + intA + " intB = " + intB);
        intA = 2;
        System.out.println("intA = " + intA + " intB = " + intB);

        /**
         * Já com objetos isso mudará porque não iremos fazer uma cópia do valor e sim referenciar
         * o endereço em memória então quando modificarmos o valor de A também será modificado o valor de B
         * porque ele busca no endereço de memória.
         * Saida:
         * objA = 1 objB = 1
         * objA = 2 objB = 2
         */

        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        System.out.println("objA = " + objA + " objB = " + objB);
        objA.setNum(2);
        System.out.println("objA = " + objA + " objB = " + objB);



    }
}
