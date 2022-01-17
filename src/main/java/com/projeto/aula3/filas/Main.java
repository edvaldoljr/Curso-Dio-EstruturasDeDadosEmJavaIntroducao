package com.projeto.aula3.filas;

public class Main {
    public static void main(String[] args) {

        //Instanciando a Fila
        Fila<String> minhaFila =  new Fila();

        //Infileirando um novo No
        minhaFila.enqueue("Primeiro");
        minhaFila.enqueue("Segundo");
        minhaFila.enqueue("Terceiro");
        minhaFila.enqueue("Quarto");

        System.out.println(minhaFila);

        //Vamos chamar o primeiro da Fila
        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enqueue("Ultimo");

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

        System.out.println(minhaFila);
    }
}
