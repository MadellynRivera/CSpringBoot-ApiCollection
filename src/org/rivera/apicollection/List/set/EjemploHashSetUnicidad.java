package org.rivera.apicollection.List.set;

import org.rivera.apicollection.List.modelo.Alumno;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EjemploHashSetUnicidad extends Alumno{

    public static void main(String[] args) {
        Set<Alumno> sa = new HashSet<>(); {
            sa.add(new Alumno("Paco",5));
            sa.add(new Alumno("Juan",6));
            sa.add(new Alumno("Maria",7));
            sa.add(new Alumno("Henry",9));
            sa.add(new Alumno("Paco",5));
            sa.add(new Alumno("Luis",9));
            sa.add(new Alumno("Ramiro",2));
            sa.add(new Alumno("Irvin",10));
            sa.add(new Alumno("Zeus",9));
            sa.add(new Alumno("Jeny",8));


            System.out.println(sa);


              System.out.println("iterando con foreach");

             for(Alumno a: sa){
                System.out.println(a.getNombre());
            }
             System.out.println("Iterando usando while y iterador");

                Iterator<Alumno> it = sa.iterator();
                while(it.hasNext()){
                    Alumno a = it.next();
                    System.out.println(a.getNombre());
                }

                    System.out.println("iterando usando stream foreach");

                sa.forEach(  System.out::println);
        }
    }
}
