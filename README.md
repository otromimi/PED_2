# PED_2
Practica sobre arboles binarios

Práctica 2: TAD AB (Árbol Binario)

Objetivos:
• Diseñar, implementar y usar TADs jerárquicos.
PARTE 1: DISEÑO DE TADs
1) TAD AB:
a. Realizar la especificación lógica del TAD Árbol Binario (AB) siguiendo las
distintas etapas de la “técnica de abstracción de datos” que hemos estudiado.
b. Implementar el TAD AB en memoria dinámica:
 Paquete modelos: Interfaz ModeloAB
 Paquete jerárquicos: Clases NodoAB (nodo), AB (árbol binario)
2) TAD ABEnteros:
a. Realizar la especificación lógica del TAD Árbol Binario de elementos enteros
(ABEnteros) siguiendo las distintas etapas de la “técnica de abstracción de datos”
que hemos estudiado.
b. Implementar el TAD ABEnteros haciendo uso del TAD básico AB - será un AB
pero considerando solo claves enteras.
 Paquete modelos: Interfaz ModeloABEnteros
 Paquete jerárquicos: Clase ABEnteros
Importante:
• Debeis hacer un estudio previo para determinar qué operaciones son básicas en un
AB, y por tanto, forman parte del modelo AB. (Repetir el proceso para el modelo
ABEnteros).
• Además, consideraremos básicas todas las operaciones que se llevan a cabo en las
distintas opciones del menú, por tanto, debéis decidir a qué modelo pertenecerán
(TAD AB o TAD ABEnteros).
• Considerad la posibilidad de aplicar herencia entre interfaces y herencia entre clases y
justificad en la memoria de la práctica la decisión que habeis tomado al respecto al
realizar el diseño de las interfaces y clases consideradas.

2
PARTE 2: USO DE TADs
3) Implementar una aplicación que presente en pantalla, de forma repetitiva, el siguiente menú
de opciones:
MENÚ AB de enteros
1. Crear AB de enteros
2. Listado de claves en InOrden
3. Listado de claves en PreOrden
4. Listado de claves en PostOrden
5. Comprobar sumas
6. Comprobar clave pequeña
7. Borrar Árbol Modo 1 (sin recorrer el árbol)
8. Borrar Árbol Modo 2 (recorriendo todos sus nodos)
9. Mostrar ascendientes
10. Suma total de nodos entre dos niveles
11. Número de nodos impares que hay en un nivel
0. Salir
A continuación se detalla la tarea que se debe llevar a cabo al ejecutar cada una de las distintas
opciones del menú de la aplicación:
Opción 1.- “Crear AB de enteros”: Al ejecutar esta opción se crean los siguientes AB de claves
enteras: (Método CrearABEnteros)
Opción 2.- “Listado de claves en InOrden”: Solicita al usuario que indique cuál es el árbol que
desea considerar (1 – AB1 o 2 – AB2) y, a continuación, realiza un recorrido del AB considerado
mostrando en pantalla las claves en InOrden. (Método recursivo InOrden)
Opción 3.- “Listado de claves en PreOrden”: Solicita al usuario que indique cuál es el árbol que
desea considerar (1 – AB1 o 2 – AB2) y, a continuación, realiza un recorrido del AB considerado
mostrando en pantalla las claves en PreOrden. (Método recursivo PreOrden)

3
Opción 4.- “Listado de claves en PostOrden”: Solicita al usuario que indique cuál es el árbol
que desea considerar (1 – AB1 o 2 – AB2) y, a continuación, realiza un recorrido del AB
considerado mostrando en pantalla las claves en PostOrden. (Método recursivo PostOrden)
Opción 5.- “Comprobar sumas”: Solicita al usuario que indique cuál es el árbol que desea
considerar (1 – AB1 o 2 – AB2) y, a continuación, realiza un recorrido del árbol para comprobar
si se cumple la siguiente condición: “Para cada nodo la suma de los elementos de su subárbol
izquierdo es igual a la suma de los elementos del subárbol derecho del mismo”. Tened en cuenta
que si el árbol está vacío la condición sí se cumple. Finalmente mostrará un mensaje en pantalla:
“El AB1 no cumple la condición de suma considerada”, o bien, “El AB2 si cumple la condición
de suma considerada”. (Método recursivo ComprobarSumas)
Opción 6.- “Comprobar clave pequeña”: Solicita al usuario que indique cuál es el árbol que
desea considerar (1 – AB1 o 2 – AB2) y, a continuación, comprueba si es un árbol binario en el
que cada nodo cumple la siguiente propiedad: “El valor almacenado en un nodo es menor o
igual que el valor almacenado en sus hijos”. Al ejecutar esta opción se debe ejecutar un método
que devuelva un valor booleano (true/false) indicando si el árbol que recibe como parámetro
cumple la propiedad anterior. Tened en cuenta que si el árbol está vacío la condición sí se
cumple. Finalmente, se mostrará un mensaje indicando el resultado obtenido, por ejemplo, “El
AB1 si cumple la propiedad de clave pequeña en cada nodo” o bien, “El AB2 no cumple la
propiedad de clave pequeña en cada nodo”. (Método recursivo ABClavePequeña)
Opción 7.- “Borrar Árbol Modo 1 (sin recorrer el árbol)” : Solicita al usuario que indique cuál
es el árbol que desea considerar (1 – AB1 o 2 – AB2) y, a continuación, elimina el árbol
considerado sin recorrerlo, haciendo uso exclusivamente del recolector automático de basura que
existe en Java. (Método BorrarArbolModo1)
Opción 8.- “Borrar Árbol Modo 2 (recorriendo todos sus nodos)”: Solicita al usuario que
indique cuál es el árbol que desea considerar (1 – AB1 o 2 – AB2) y, a continuación, elimina el
árbol considerado realizando un recorrido completo y borrando cada uno de sus nodos
(evidentemente, la tarea de liberación de espacios de memoria en Java la lleva a cabo el
recolector automático de basura). (Método recursivo BorrarArbolModo2)
Pregunta1:
Si estuviésemos trabajando con un lenguaje que no tenga implementado el Recolector
automático de basura (por ej. Lenguaje C), ¿Cuáles serían los distintos pasos que debería llevar a
cabo el algoritmo que borra un árbol?.. Escriba el algoritmo en pseudocódigo e inclúyalo en la
memoria de la práctica.
Opción 9.- “Mostrar ascendientes”: Se solicita al usuario una clave entera y se muestra por
pantalla todos sus ascendientes. Si la clave no existe en el árbol, se mostrará en pantalla el
correspondiente mensaje de error. (Método recursivo MostrarAscendientes)
Ejemplo:
Considerando el árbol AB1 y el nodo 7, sus ascendientes son 7, 6, 2

4
Opción 10.- “Suma total de nodos entre dos niveles”: Se solicita al usuario que introduzca por
teclado dos niveles K1 y K2 (con valores comprendidos entre 0 y N-1 , donde N es el número de
niveles que tiene el árbol , y considerando K1 <= K2), y a continuación, se recorre el ABB
sumando todas las claves que se encuentren en los distintos niveles comprendidos entre los
mismos (incluídos K1 y K2). (Método recursivo SumaNodosNiveles)
Ejemplo: Considerando el árbol AB1, la salida en pantalla será la siguiente:
Introduzca nivel K1: 1
Introduzca nivel K2: 2
La suma de elementos entre estos niveles es 29
Opción 11.- “Número de nodos impares en un nivel”: Al ejecutar esta opción, se solicita al
usuario que introduzca por teclado un nivel y se muestra en pantalla un mensaje indicando el
número total de nodos impares que hay en el mismo. Si el nivel indicado por el usuario no existe
en el árbol, se muestra el mensaje “Error: ese nivel no existe”. (Método recursivo
TotalImparesNivel)
Ejemplo:
Considerando el árbol AB2 y el nivel 2, el número de nodos impares que hay en ese nivel es 2.
Opción 0.- “Salir” (Menú Principal): Finaliza la ejecución del programa mostrando un mensaje
de despedida (“Gracias por utilizar nuestro TAD ABEnteros”).
Observaciones:
- Las opciones 2..11 del menú sólo podrán ser ejecutadas si con anterioridad se ha ejecutado la
opción 1 (“Crear AB de enteros”).
- Podeis diseñar las excepciones que considereis oportunas.
Pregunta 2:
Una vez finalizada la realización de la práctica, plantearos la siguiente cuestión: ¿Cómo habría
cambiado la implementación de la misma si en lugar de considerar AB trabajásemos con ABB
(árbol binario de búsqueda)?. Justificad vuestra respuesta y anotadlo en la memoria de la
práctica.

5
NORMAS DE REALIZACIÓN DE LA PRÁCTICA:
- Elaborar una memoria (en papel) en la que se recoja la especificación lógica completa de
los TADs considerados (AB, ABEnteros). Además deberá contener un listado de todo el
código fuente desarrollado, así como pruebas de ejecución de las distintas opciones de
menú.
- La memoria y el código fuente deberán ser entregados a través del campus virtual de
acuerdo a las instrucciones que allí se detallan.
DOCUMENTACIÓN A ENTREGAR
Será preciso realizar una MEMORIA que contenga la siguiente información:
1.- Portada: Indicando Asignatura, Título de la práctica, Grupo de prácticas, Autor/es, Curso 2º
y Fecha de entrega.
2.- Objetivos (Enunciado de la práctica)
3.- Especificación lógica de los TADs considerados (AB, ABEnteros).
4.- Diseño de los métodos recursivos (Análisis del problema /Identificación de caso/s base /
Identificación de caso/s recursivo/s).
5.- Descripción detallada del funcionamiento de cada método implementado (Breve comentario).
6.- Listado del código fuente de la aplicación desarrollada. El código fuente deberá estar
correctamente comentado (Cabeceras descriptivas en cada método, etc)
7.- Pruebas de ejecución de la aplicación: Pruebas de ejecución de cada una de las opciones del
menú de la aplicación.
