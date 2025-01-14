package ArrayList;
import  java.util.List;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {

        List <Persona> ListaDePersonas = new ArrayList<Persona> ();

        //Agrego personas al arraylist instanciando la clase persona
        ListaDePersonas.add(new Persona(1,"eric",26));
        ListaDePersonas.add(new Persona(2,"luisina",26));
        ListaDePersonas.add(new Persona(3,"marcos",26));
        ListaDePersonas.add(new Persona(4,"estefano",26));
        ListaDePersonas.add(new Persona(5,"gaston",26));
        ListaDePersonas.add(new Persona(6,"lucas",26));
        ListaDePersonas.add(new Persona(6,"Mauro",26));
        ListaDePersonas.add(new Persona(6,"Sonia",26));

        //hay 2 formas de recorrer la los arraylist ,mediante el for(recorrer por indice,a una posicion en particular)
        //con el bucle for controlo manualmente las iteraciones con acceso a los indices

        for(int i=0;i <ListaDePersonas.size(); i++ ){
            System.out.println("prueba: " + ListaDePersonas.get(i).getNombre());
        }
        System.out.println("--------------------------------------------------------------------" );

        //2da for: mediante el foreach..., el cual no proporciona acceso directo a los indices, no podre modificarlos...
        for (Persona perso:ListaDePersonas){
            System.out.println("prueba: " + perso.getNombre());
        }

    }
}