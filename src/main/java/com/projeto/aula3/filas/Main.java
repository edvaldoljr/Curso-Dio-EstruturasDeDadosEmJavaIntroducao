package com.projeto.aula3.filas;

public class Main {
    public static void main(String[] args) {

        //Instanciando a Fila
        Fila minhaFila =  new Fila();

        //Infileirando um novo No
        minhaFila.enqueue(new No("Primeiro"));
        minhaFila.enqueue(new No("Segundo"));
        minhaFila.enqueue(new No("Terceiro"));
        minhaFila.enqueue(new No("Quarto"));

        System.out.println(minhaFila);

        //Vamos chamar o primeiro da Fila
        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enqueue(new No("Ultimo"));

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

        System.out.println(minhaFila);
    }
}
