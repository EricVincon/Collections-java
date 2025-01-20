Introduccion a la colecciones(LIST,SET,MAP) de java.

Este proyecto presenta un menú interactivo que muestra ejemplos básicos del funcionamiento de diferentes colecciones en Java: ArrayList, LinkedList, Stack, y HashMap. Estas colecciones se usan como alternativas a los clásicos vectores y otras estructuras de datos. Son dinámicas, heterogéneas y permiten manipular datos de manera eficiente en diversas situaciones.

Requisitos:

Java 8 o superior.
Un IDE compatible con Java.

Descripción:

El programa presenta un menú interactivo que permite a los usuarios elegir entre diferentes colecciones de Java. Cada opción proporciona ejemplos básicos de cómo usar ArrayList, LinkedList, Stack y HashMap, mostrando las diferencias entre estas estructuras de datos.
Cabe aclarar que todavia no desarrolle el paso a paso del funcionamiento de las colacciones(proximo update), sino que por comentarios en el codigo se permite hacerle un seguimiento del mismo.

Colecciones utilizadas:

ArrayList: Una implementación de la interfaz List, permite almacenar elementos en un array dinámico. Permite el acceso rápido por índice, pero las operaciones de inserción y eliminación pueden ser costosas si no se realizan al final de la lista.

LinkedList: Una implementación de la interfaz List que almacena elementos de manera enlazada. Permite inserciones y eliminaciones más eficientes en cualquier posición, pero el acceso a los elementos es más lento en comparación con un ArrayList.

Stack: Una estructura de datos de tipo "LIFO" (último en entrar, primero en salir), donde solo se pueden añadir y eliminar elementos desde el extremo superior.
HashMap: Una implementación de la interfaz Map, almacena pares clave-valor. Ofrece acceso rápido a los elementos mediante una clave única.

Cómo usar:

Clonar el repositorio
Abrir el proyecto en tu IDE preferido:
Dentro de tu IDE, localiza la clase Menu.java dentro de la estructura de paquetes.
Haz clic derecho sobre Menu.java y selecciona "Run 'Menu.main()'" para ejecutar el programa.
El programa iniciará y te mostrará el menú interactivo donde podrás seleccionar diferentes colecciones para ver ejemplos de su uso.

Estructura del Proyecto:

src: Contiene el código fuente de Java.
Menu.java: La clase principal que contiene el menú interactivo.
Arraylist.java, Linkedlist.java, Stackk.java, Hashmap.java: Clases que contienen los ejemplos básicos de cada colección.
out: Carpeta generada por IntelliJ IDEA(mi ide) que contiene los archivos compilados.

