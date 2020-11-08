/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Thiago
 */
public class Aulas {

    public static void main(String[] args) {
        String aula1 = "Conhecendo Array";
        String aula2 = "Modelando a Classe Atual";
        String aula3 = "Aula ArrayList";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);
        System.out.println("");
        System.out.println("");

        String remove = aulas.remove(0);

        System.out.println(aulas);
        System.out.println("");
        System.out.println("");

        for (String aula : aulas) {
            System.out.println("AULA: " + aula);
        }

        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é: " + primeiraAula);

        String segundaAula = aulas.get(1);
        System.out.println("A segunda aula é: " + segundaAula);

        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("AULA: " + aulas.get(i));
        }

        System.out.println("TAMANHO DO VETOR: " + aulas.size());
        System.out.println("");

        aulas.forEach(aula -> {
            System.out.println("Percorrendo: ");
            System.out.println("Aula " + aula);
        });

        aulas.add("Aumentando a Lista");
        System.out.println(aulas);

        Collections.sort(aulas);
        System.out.println("Depois de ordenado: ");
        System.out.println(aulas);
        System.out.println("");

        String carro1 = "FORD";
        String carro2 = "BMW";

        ArrayList<String> carros = new ArrayList<>();
        carros.add(carro1);
        carros.add(carro2);

        System.out.println(carros);
        System.out.println("");

    }

}
