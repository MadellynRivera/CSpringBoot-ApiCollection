import java.util.HashSet;
import java.util.Set;

//Ejercicio para deteccion de duplicados
public class EjemploHashSetAgregar {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        System.out.println(hs.add("Uno"));
        System.out.println(hs.add("dos"));
        System.out.println(hs.add("tres"));
        System.out.println(hs.add("cuatro"));
        System.out.println(hs.add("cinco"));
        System.out.println(hs);

        boolean b = hs.add("tres");
        System.out.println("Permite elementos duplicados = " + b);
        System.out.println(hs);
    }
}
