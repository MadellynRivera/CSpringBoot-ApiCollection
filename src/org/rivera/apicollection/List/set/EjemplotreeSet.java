package org.rivera.apicollection.List.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemplotreeSet {

    public static void main(String[] args) {
        Set<String> ts = new TreeSet<>((a, b) -> b.compareTo(a));

        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");

        System.out.println("ts = " + ts);

        System.out.println("....................................");

        //Objeto tree set de la clase Set no hay necesidad de utilizar el for
        Set<Integer> numeros = new TreeSet<>(Comparator.reverseOrder());
        numeros.add(1);
        numeros.add(5);
        numeros.add(4);
        numeros.add(2);
        numeros.add(3);
        numeros.add(10);
        System.out.println("numeros = " + numeros);


    }
}
