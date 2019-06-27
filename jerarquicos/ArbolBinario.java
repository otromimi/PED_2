
package jerarquicos;

import modelos.ModelosAB;

/**
 *
 * @author Guillermo Leiro Arroyo && Ivan Orosa Gilarranz
 */
public class ArbolBinario <E> implements ModelosAB <E>{
    
    protected NodoAB <E> root;
    
    public ArbolBinario(E dato){
        this.root=new NodoAB<>(dato);
    }
    
    
    public NodoAB getRoot(){
        return root;
    }

    @Override
    public void inorden(){
        System.out.print("\n\nIn-orden: ");
        root.inorden();
        System.out.print("\n\n");
    }
    
    @Override
    public void postorden(){
        System.out.print("\n\nPost-orden: ");
        root.postorden();
        System.out.print("\n\n");
    }
    
    @Override
    public void preorden(){
        System.out.print("\n\nPre-orden: ");
        root.preorden();
        System.out.print("\n\n");
    }
    
    @Override
    public void delete(){
        this.root=null;
        System.out.println("\nArbol borrado con exito.\n");
    }
    
    @Override
    public void eraseAll(){
        this.root.eraseAll();
        this.root=null;
        System.out.println("\nArbol borrado con exito.\n");
    }
    
    @Override
    public void ascendientes(E hit){
        System.out.print("Ascendientes: ");
        this.root.ascendientes(hit);
        System.out.print("\n\n");
    }
    
}
