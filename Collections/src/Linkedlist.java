import java.util.*;

public class Linkedlist {
    public void proceso(){
        System.out.println("--------------------------------------------------------------------" );
        //las  listas enlazadas no se guardan en posiciones contiguas de memoria(no tengo un indice, no tengo unacceso aleatorio)
        System.out.println("Linkedlist" );//metodos extra:getlast(),getfirst(),size(),isEmpty()(igual que arraylist)
        List<Persona> ListaEnlazada = new LinkedList<>();

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
    }
}
