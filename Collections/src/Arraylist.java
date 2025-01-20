import java.util.*;

public class Arraylist {

    public void proceso (){
        System.out.println("ArrayList");
        List<Persona> ListaDePersonas = new ArrayList<>();//interfaz List

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
    }
}
