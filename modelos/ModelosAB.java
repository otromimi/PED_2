
package modelos;

/**
 *
 * @author Guillermo Leiro Arroyo && Ivan Orosa Gilarranz
 */
public interface ModelosAB <E>{
    
    /***
     * Este metodo desempeña la impresion del arbol en inorden 
     */
    public void inorden();
    
    /***
     * Este metodo desempeña la impresion del arbol en postorden
     */
    public void postorden();
    
    /***
     * Este metodo desempeña la impresion del arbol en preorden
     */
    public void preorden();
    
    /***
     * Este metodo elimina el arbol de raiz
     */
    public void delete();
    
    /***
     * Este metodo elimina el atbol recorriendolo y eliminando nodo por nodo
     */
    public void eraseAll();
    
    /***
     * Este metodo imprime los ascendientes del nodo pasado por parametro
     */
    public void ascendientes(E hit);
    
}
