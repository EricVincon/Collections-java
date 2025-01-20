import java.util.*;

public class Hashmap {
    public  void  proceso(){
        System.out.println("HashMap----------------------------------------------------");//sin valores repetidos en su ids/claves
        //Algunos metodos:
        //put:agregar un par clave-valor
        //get:trae un objeto en base a la clave que le pasemos
        //containsKey: verificqa si existe la clave especificada
        //ContainValue: verificqa si existe el valor especificado
        //remove(clave)
        //keySET: devuelve conjunto de claves existentes
        //Values: devuelve conjunto de valores existentes

        Map<Integer,String> mapaEmpleados = new HashMap<>();

        mapaEmpleados.put(123,"Eric Sosa");
        mapaEmpleados.put(143,"Gabriel Sosa");
        mapaEmpleados.put(323,"santiago Sosa");
        mapaEmpleados.put(193,"olga Sosa");
        mapaEmpleados.put(153,"Rosa Sosa");
        mapaEmpleados.put(723,"Ernesto Sosa");
        mapaEmpleados.put(223,"Mago Sosa");
        mapaEmpleados.put(523,"Ramon Sosa");

        if( mapaEmpleados.containsValue("Eric Sosa")){
            System.out.println("El valor esta");
        } else {
            System.out.println("El valor no esta");
        }
        String nombre = mapaEmpleados.get(123);
        System.out.println("El nombre del empleado con id 123 es: " + nombre);
    }
}
