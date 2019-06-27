
package jerarquicos;

/**
 * 
 * @author Guillermo Leiro Arroyo && Ivan Orosa Gilarranz
 */
public class NodoAB <E> {
    
    private NodoAB right, left;
    private E content;
    
    public NodoAB(E content){
        this.content=content;
    }

    public void insertRight(E dato){
       this.right=new NodoAB(dato);
    }
    
    public void insertLeft(E dato){
       this.left=new NodoAB(dato);
    }
    
    public NodoAB getRight(){
        return right;
    }
    
    public NodoAB getLeft(){
        return left;
    }
    
    public E getContent(){
        return content;
    }
    
    public void inorden(){
        if(left!=null){
            left.inorden();
        }
        System.out.print(content+" ");
        if(right!=null){
            right.inorden();
        }
    }
    
        public void postorden(){
        if(left!=null){
            left.postorden();
        }
        if(right!=null){
            right.postorden();
        }
        System.out.print(content+" ");
    }
        
    public void preorden(){
        System.out.print(content+" ");
        if(left!=null){
            left.preorden();
        }
        if(right!=null){
            right.preorden();
        }
    }
    
    public int suma(){
        int r=0,l=0;
        int sum=0;
        if(left!=null)
           l=left.suma();
        if(right!=null)
            r=right.suma();
        if(r!=l){
             System.out.println("No se cumple para el nodo "+content);
        }else{
            System.out.println("Si se cumple para el nodo "+content);
        }
            
        sum = sum+(Integer)content+r+l;
        return sum;
    }
    
    public boolean calvePequenna(){
        if(left!=null){
            if((Integer)content<=(Integer)left.content){
                if(!left.calvePequenna()){
                    return false;
                }
            }else{
                return false;
            }
        }
        if(right!=null){
            if((Integer)content<=(Integer)right.content){
                if(!right.calvePequenna()){
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }
    
    public void eraseAll(){
        if(right!=null)
            right.eraseAll();
        if(left!=null)
            left.eraseAll();
        right=null;
        left=null;
    }
    
    public boolean ascendientes(E hit){
        boolean l=false,r=false;
        if(right!=null)
            r=right.ascendientes(hit);
        if(left!=null)
            l=left.ascendientes(hit);
        if(content==hit || (l || r))
            System.out.print(content+" ");
        return (content==hit || (l || r));
    }
    
    public int imparesLevel(int level){
        int countL=0, countR=0;
        if(level!=0){
            if(left!=null)
                countL=left.imparesLevel(level-1);
            if(right!=null)
                countR=right.imparesLevel(level-1);
        }
        return ((Integer)content%2!=0 && level==0)?countR+countL+1:countR+countL;
    }
    
    public int sumaEntreNiveles(int inferior, int up){
        int countL=0, countR=0;
        if(inferior!=0){
            if(left!=null)
                countL=left.sumaEntreNiveles(inferior-1,up-1);
            if(right!=null)
                countR=right.sumaEntreNiveles(inferior-1,up-1);
        }
        return (up==0)?countR+countL+(Integer)content:countR+countL;
    }
}
