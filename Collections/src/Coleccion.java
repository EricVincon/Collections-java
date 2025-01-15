import java.util.*;

public class Coleccion {
    public static void main(String[] args) {
        System.out.println("ArrayList");
        List <Persona> ListaDePersonas = new ArrayList<> ();

        //Agrego personas al arraylist instanciando la clase persona..
        ListaDePersonas.add(new Persona(1,"eric",26));
        ListaDePersonas.add(new Persona(2,"luisina",26));
        ListaDePersonas.add(new Persona(3,"marcos",26));
        ListaDePersonas.add(new Persona(4,"estefano",26));
        ListaDePersonas.add(new Persona(5,"gaston",26));
        ListaDePersonas.add(new Persona(6,"lucas",26));
        ListaDePersonas.add(new Persona(7,"Mauro",26));
        ListaDePersonas.add(new Persona(8,"Sonia",26));

        //hay 2 formas de recorrer la los arraylist ,mediante el for(recorrer por indice,a una posicion en particular)
        //con el bucle for controlo manualmente las iteraciones con acceso a los indices

        System.out.println("Remove en arraylist(le paso el indice que quiero eliminar, el indice de sonia)" );
        ListaDePersonas.remove(7);

        for(int i=0;i <ListaDePersonas.size(); i++ ){
            System.out.println("prueba: " + ListaDePersonas.get(i).getNombre());
        }
        System.out.println("--------------------------------------------------------------------" );

        //2da for:  mediante el foreach, el cual no proporciona acceso directo a los indices, no podre modificarlos...
        for (Persona perso:ListaDePersonas){
            System.out.println("prueba: " + perso.getNombre());
        }



        System.out.println("--------------------------------------------------------------------" );
        System.out.println("Linkedlist" );//metodos extra:getlast(),getfirst(),size(),isEmpty()(igual que arraylist)
        List<Persona>ListaEnlazada = new LinkedList<>();

        ListaEnlazada.add(new Persona(1,"eric",22));
        ListaEnlazada.add(new Persona(2,"maria",12));
        ListaEnlazada.add(new Persona(3,"lourdes",32));
        ListaEnlazada.add(new Persona(4,"santiago",42));
        ListaEnlazada.add(new Persona(6,"Sonia",26));

        //posbilidad de agregar un elemento al principio(Diferencia arraylist)
        ListaEnlazada.add(0,new Persona(5,"laureano",22));

        System.out.println("Remove en Linkedlist(le paso el elemento que quiero eliminar, en este caso 'sonia')" );
        String nombreBorrar = "Sonia";
        for(Persona personaAeliminar: ListaEnlazada){
            if(personaAeliminar.getNombre().equals(nombreBorrar)){
                ListaEnlazada.remove(personaAeliminar);
                break;
            }
        }


        System.out.println(" RECORRIDO FOR EACH");
        //al no contar con un indice, recorremos la linkedlist con un foreach
            for(Persona perso2:ListaEnlazada){
                System.out.println("Nombre: " + perso2.getNombre());
            }


        System.out.println(" --------------------------------------------------------------------------");
        System.out.println(" Stacks/Pilas");
        Stack<Integer> pila = new Stack<>();

        System.out.println(" pila vacia:" + pila);
        System.out.println(" esta vacia?" + pila.isEmpty());

        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        pila.push(6);

        for(Integer pila2:pila){
            System.out.println(pila2);
        }
        System.out.println(" pila:" + pila);

        pila.pop();//elimina el ultimo elemento que entro a la pila
        System.out.println(" esta el 3?" + pila.search(3));
        System.out.println(" Tope de la pila: " + pila.peek());

        System.out.println(" --------------------------------------------------------------------------");


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
