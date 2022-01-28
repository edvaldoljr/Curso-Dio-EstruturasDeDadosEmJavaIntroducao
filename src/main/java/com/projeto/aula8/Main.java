package com.projeto.aula8;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Fiat"));
        listaCarros.add(new Carro("Honda"));

        System.out.println(listaCarros.contains(new Carro("Honda")));
        System.out.println(new Carro("Honda").hashCode());
        System.out.println(new Carro("Honda1").hashCode());


        Carro carro = new Carro("Ford");
        Carro carro2 = new Carro("Honda");

        //Comparando
        System.out.println(carro.equals(carro2));
    }
}
