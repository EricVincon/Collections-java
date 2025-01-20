import java.util.Stack;

public class Stackk {
    public void proceso(){
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

    }
}
