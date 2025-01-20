import java.util.*;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int contador = 0;

        while (flag) {

            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Introduccion basica sobre el funcionamiento de algunas colecciones en Java. ");
            System.out.println("Seleccione la coleccion a la cual desea ver su funcionamiento basico: ");

            if (contador >= 1) {
                System.out.println("-------------------------------------");
                System.out.println("Por favor vuelva a ingresar una opcion:");
                System.out.println("-------------------------------------");
            }
            System.out.println("-----------------------------------------------");
            System.out.println("1: ArrayList");
            System.out.println("2: LinkedList");
            System.out.println("3: Stacks");
            System.out.println("4: HashMap");
            System.out.println("5: Salir del menu?");
            System.out.println("-------------------------------------");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion >= 1 && opcion <= 5) {
                System.out.println("Opcion registrada, procesando la coleccion.....");
                System.out.println("-------------------------------------");
            } else {
                System.out.println("Ingresaste una opcion incorrecta, por favor ingresa una opción del 1 al 5 :");
                continue;
            }


            switch (opcion) {
                case 1:
                    Arraylist arraylist = new Arraylist();
                    arraylist.proceso();
                    contador++;
                    continue;

                case 2:
                    Linkedlist linkedlist = new Linkedlist();
                    linkedlist.proceso();
                    contador++;
                    continue;

                case 3:
                    Stackk stack = new Stackk();
                    stack.proceso();
                    contador++;
                    continue;

                case 4:
                    Hashmap hashmap = new Hashmap();
                    hashmap.proceso();
                    contador++;
                    continue;
                case 5:
                    System.out.println("SALIENDO....");
                    System.out.println("Nos vemos pronto!");
                    flag = false;
                    break;

                default:
                    System.out.println("Por favor, ingrese una opcion del 1 al 5 segun lo desee...");


            }
        }

    }
}
