package org.rivera.apicollection.List;

import org.rivera.apicollection.List.modelo.Alumno;

import java.util.ArrayList;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {
        List<Alumno> al = new ArrayList<>();
        System.out.println(al + " size = "+ al.size());
        System.out.println("está vacía = " + al.isEmpty());
        al.add(new Alumno("Pato", 5 ));
        al.add(new Alumno("Cata", 6 ));
        al.add(new Alumno("Luci", 4));
        al.add(2, new Alumno("Jano", 7));
        al.set(3, new Alumno("Andres",3));

        System.out.println(al + ", size = " + al.size());

        al.remove(new Alumno("Jano", 7));

        //Remover por index
        //al.remove(0);
        System.out.println(al + ", size = " + al.size());

        boolean b = al.contains(new Alumno("Cata", 6));
        System.out.println("La lista contiene a Cata = " + b);

        //Se convierte un arrayList a un array
        Object a[] = al.toArray();
        for (int i=0; i<a.length; i++){
            System.out.println("Desde el arreglo = " + a[i]);
        }
    }
}
