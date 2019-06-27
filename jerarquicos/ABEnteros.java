
package jerarquicos;

import modelos.ModelosABEnteros;

/**
 *
 * @author Guillermo Leiro Arroyo && Ivan Orosa Gilarranz
 */
public class ABEnteros <E extends Integer> extends ArbolBinario implements ModelosABEnteros{
    
    public ABEnteros(E dato) {
        super(dato);
    }
    
    @Override
    public void comprobarSumas(){  
        root.suma();
    }
    
    public static boolean clavePequenna(ABEnteros arbol){
        return arbol.getRoot().calvePequenna();
    }
    
    @Override
    public void imparesInLevel(int level){
        System.out.println("Impares: "+this.root.imparesLevel(level)+"\n");
    }
    
    @Override
    public void sumaEntreNiveles(int superior, int inferior){
        System.out.println("Suma entre los niveles "+superior+" e "+inferior+" : "+this.root.sumaEntreNiveles(superior, inferior)+"\n");
    }
}
