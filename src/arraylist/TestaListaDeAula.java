/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Thiago
 */
public class TestaListaDeAula {

    public static void main(String[] args) {
        Aula a1 = new Aula("Revisando Arrays", 22);
        Aula a2 = new Aula("Aprendendo Collectors", 30);
        Aula a3 = new Aula("Relacionamento de lisras e objetos", 40);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);

        Collections.sort(aulas);

        System.out.println("");
        System.out.println(aulas);
        System.out.println("");

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));

        System.out.println(aulas);
        System.out.println("");

        aulas.sort((Comparator.comparing(Aula::getTempo)));
        System.out.println(aulas);
    }
}
