
package modelos;

/**
 *
 * @author Guillermo Leiro Arroyo && Ivan Orosa Gilarranz
 */
public interface ModelosABEnteros extends ModelosAB{
    
    /***
     * Este metodo comprueba que las sumas de los subarboles equivalentes sean iguales
     */
    public void comprobarSumas();
    
    /***
     * Este metodo comprueba los nodos con contenidos impares en un nivel pasado por parametro
     */
    public void imparesInLevel(int level);
    
    /***
     * Este metodo suma los nodos que se encuentran entre los niveles indicados
     */
    public void sumaEntreNiveles(int superior, int inferior);
    
}
