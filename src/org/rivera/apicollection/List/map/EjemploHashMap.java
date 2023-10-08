package org.rivera.apicollection.List.map;

/*import java.util.Collection;
import java.util.HashMap;
import java.util.Map;*/
import java.util.*;

public class EjemploHashMap {
    public static void main(String[] args) {
        /*Objeto de tipo HashMap <Clave de tipo String, Objeto de cualquier tipo> llamado persona que es una lista
          HashMap ayuda a que no muestre datos duplicados
          No puedo instalar directamente desde Map asi que instancio desde la clase HashMap*/
        Map<String, Object> persona = new HashMap<>();
        System.out.println("Contiene elementos = " + !persona.isEmpty());
        //(clave, valor)
        persona.put(null,"1234");
        persona.put(null,"12345");
        persona.put("nombre","John");
        persona.put("apellido","Doe");
        persona.put("apellidoPaterno","Doe");
        persona.put("email","john.doe@email.com");
        persona.put("edad", 30);

        //Otra Lista del tipo String
        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado","California");
        direccion.put("ciudad","Santa Barbara");
        direccion.put("calle","One Street");
        direccion.put("numero","120");

        //Agrega dirección a persona
        persona.put("direccion", direccion);

        System.out.println("persona = " + persona);

        //Convertir nombre (es la clave) de tipo HashMap a String
        String nombre = (String) persona.get("nombre");
        System.out.println("nombre = " + nombre);
        String apellido = (String) persona.get("apellido");
        System.out.println("apellido = " + apellido);

        //casting para convertir el objeto persona de tipo Map<String, Object> a tipo Map<String,String>
        Map<String, String> direccionPersona = (Map<String, String>) persona.get("direccion");

        //Almacena el valor por clave -> pais : almacena USA, ciudad : Santa barbara, etc
        String pais = direccionPersona.get("pais");
        String ciudad = direccionPersona.get("ciudad");

        //Se asigna el valor asociado a la clave barrio y si no existe se toma el valor por default "La playa"
        String barrio = direccionPersona.getOrDefault("barrio","La playa");
        System.out.println("El pais de " + nombre + " es: " + pais);
        System.out.println("La ciudad de " + nombre + " es: " + ciudad);
        System.out.println("El barrio de " + nombre + " es " + barrio);

        //String apellidoPaterno = persona.remove("apellidoPaterno");
        System.out.println("========================= remove");
        boolean b = persona.remove("apellidoPaterno", "Doe");
        System.out.println("eliminando: " + b);
        System.out.println("persona" + persona);
        System.out.println("persona = " + direccionPersona);


        //verifica que existe la clave apellidoPaterno
        boolean b2 = persona.containsKey("apellidoPaterno");
        System.out.println("b2 = " + b2);

        //verificar si contiene el valor john.doe@gmail.com
        b2 = persona.containsValue("john.doe@gmail.com");
        System.out.println("b2 = " + b2);

        System.out.println("===================== values");
        //Crea una colección que contiene todos los valores del mapa persona
        Collection<Object> valores = persona.values();
        //recorre el objeto v en la colección valores
        for (Object v : valores){
            System.out.println("v = " + v);
        }

        System.out.println("===================== keySet");
        //obtiene las llaves del map persona
        Set<String> llaves = persona.keySet();
        for (String k : llaves){
            System.out.println("k = " + k);
        }

        System.out.println("====================== entrySet");
        for (Map.Entry<String, Object> par : persona.entrySet()){
            Object valor = par.getValue();
            if (valor instanceof Map){
                String nom = (String) persona.get("nombre");
                Map<String, String> direccionMap = (Map<String, String>) valor;
                for (Map.Entry<String, String> parDir: direccionMap.entrySet()){
                    System.out.println(parDir.getKey() + "=> " + parDir.getValue());
                }
            }
            else{
                System.out.println(par.getKey() + " => " + valor);
            }
        }

        System.out.println("======================== ketSet");
        for (String llave: persona.keySet()){
            Object valor = persona.get(llave);

            if (valor instanceof Map){
                String nom = (String) persona.get("nombre");
                Map<String, String> direccionMap = (Map<String, String>) valor;
                System.out.println("El pais de " + nom + ": " + direccionMap.get("pais"));

                System.out.println("El estado de " + nom + ": " + direccionMap.get("estado"));
                System.out.println("La ciudad de " + nom + ": " + direccionMap.get("ciudad"));

            }else {
                System.out.println(llave + " => " + valor);

            }
        }
        System.out.println("=========================== java 8 forEach");
        persona.forEach((llave,valor) ->{
            System.out.println(llave + "=> " + valor);
        });

        System.out.println("total " + persona.size());
        System.out.println("contiene elementos= " + !persona.isEmpty());
        boolean b3 = persona.replace("nombre", "john", "Andrés");
        System.out.println("b3 = " + b3);
        System.out.println("persona = " + persona);



    }
}
