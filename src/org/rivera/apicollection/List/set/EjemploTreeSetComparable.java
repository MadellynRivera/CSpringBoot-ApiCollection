package org.rivera.apicollection.List.set;

import org.rivera.apicollection.List.modelo.Alumno;


import javax.sql.rowset.spi.TransactionalWriter;
import java.util.Set;
import java.util.TreeSet;
//Los metodos set permiten verificar duplicidad
import static java.util.Comparator.comparing;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
        //Compara las notas para ver si alguna se repite con otra
        //Set<Alumno> sa = new TreeSet<>((a,b) -> b.getNota().compareTo(a.getNota()));
        Set<Alumno> sa = new TreeSet<>(comparing(Alumno:: getNota ).reversed());
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata",6));
        sa.add(new Alumno("Luci",4));
        sa.add(new Alumno("Jano",7));
        sa.add(new Alumno("Andres",3));
        sa.add(new Alumno("Zeus",2));
        sa.add(new Alumno("Zeus",8));
        System.out.println(sa);

    }
}
