
package aplicacion;

import java.util.Scanner;
import jerarquicos.ABEnteros;

/**
 *
 * @author Guillermo Leiro Arroyo && Ivan Orosa Gilarranz
 */
public class Aplicacion {
    
    public static ABEnteros <Integer> ab1, ab2;
    
    public static void main(String[] args){
        menu();
    }
    
    public static void menu(){
        boolean salir=false;
        ABEnteros seleccion;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("\n\nMENU ARBOL BINARIO DE ENTEROS\n" +
            "1. Crear AB de enteros\n" +
            "2. Listado de claves en InOrden\n" +
            "3. Listado de claves en PreOrden\n" +
            "4. Listado de claves en PostOrden\n" +
            "5. Comprobar sumas\n" +
            "6. Comprobar clave pequeña\n" +
            "7. Borrar Árbol Modo 1 (sin recorrer el árbol)\n" +
            "8. Borrar Árbol Modo 2 (recorriendo todos sus nodos)\n" +
            "9. Mostrar ascendientes\n" +
            "10. Suma total de nodos entre dos niveles\n" +
            "11. Número de nodos impares que hay en un nivel\n" +
            "0. Salir\n " +
            "\n\nIntorduzca una pocion: ");
            try{
                switch(sc.nextInt()){
                    case 0:
                        salir=true;
                        System.out.println("Gracias por usar menu arboles enteros.");
                        break;
                    case 1:
                        //Create AB enteros
                        createTree();
                        break;
                    case 2:
                        //Listado de claves en inorden
                        selectAB().inorden();
                        break;
                    case 3:
                        //Listado claves en preorden
                        selectAB().preorden();
                        break;
                    case 4:
                        //Listado claves en post-orden
                        selectAB().postorden();
                        break;
                    case 5:
                        //Comprobar sumas
                        selectAB().comprobarSumas();
                        break;
                    case 6:
                        //Comprobar clave pequeña
                        if(ABEnteros.clavePequenna(selectAB())){
                            System.out.println("El arbol si cumple la propiedad de clave pequeña en cada nodo");
                        }else{
                            System.out.println("\nEl arbol no cumple la propiedad de clave pequeña en cada nodo\n");
                        }
                        break;
                    case 7:
                        //borar sin recorrer el arbol
                        selectAB().delete();
                        break;
                    case 8:
                        //borrar recorriendo el arbol
                        selectAB().eraseAll();
                        break;
                    case 9:
                        //mostrar ascendientes
                        seleccion=selectAB();
                        System.out.print("Introduzca un valor: ");
                        int hit=sc.nextInt();
                        seleccion.ascendientes(hit);
                        break;
                    case 10:
                        //suma nodos entre dos niveles
                        seleccion=selectAB();
                        System.out.print("Introduzca el nivel superior: ");
                        int nivelSuperior=sc.nextInt();
                        System.out.print("Introduzca el nivel inferior: ");
                        int nivelInferior=sc.nextInt();
                        seleccion.sumaEntreNiveles(nivelSuperior, nivelInferior);
                        break;
                    case 11:
                        //numero de nodos impares de un nivel
                        seleccion=selectAB();
                        System.out.print("Introduzca el nivel: ");
                        int level=sc.nextInt();
                        seleccion.imparesInLevel(level);
                        break;
                    default:
                        System.out.println("Opcion no valida.");
                }
            }catch(Exception e){
                //Captura las opciones de null pointer exception
                System.out.println("Opcion no permitida, "+e.toString());
            }
            if (salir==false)
                pressToContinue();
        }while(salir == false);
    }
    
    private static void createTree(){
        
        //Creaccion del arbol binario de enteros numero 1
        ab1=new ABEnteros(2);
        ab1.getRoot().insertRight(5);
        ab1.getRoot().insertLeft(6);
        ab1.getRoot().getRight().insertRight(8);
        ab1.getRoot().getLeft().insertRight(7);
        ab1.getRoot().getLeft().insertLeft(9);
        
        //Creaccion del arbol binario de enteros numero 2
        ab2=new ABEnteros(13);
        ab2.getRoot().insertLeft(12);
        ab2.getRoot().getLeft().insertLeft(8);
        ab2.getRoot().getLeft().insertRight(4);
        ab2.getRoot().getLeft().getRight().insertLeft(2);
        ab2.getRoot().getLeft().getRight().insertRight(2);
        ab2.getRoot().insertRight(34);
        ab2.getRoot().getRight().insertRight(-3);
        ab2.getRoot().getRight().insertLeft(-3);
        ab2.getRoot().getRight().getLeft().insertLeft(0);
        
        System.out.println("\nArboles creados.\n");
    }
    
    private static ABEnteros selectAB(){
        ABEnteros arbol=null;
        boolean salir=false;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Selecione 1 para AB1 o 2 para AB2: ");
            switch(sc.nextInt()){
                case 1:
                    arbol= ab1;
                    salir=true;
                    break;
                case 2:
                    arbol= ab2;
                    salir=true;
                    break;
                default:
            }
        }while(salir==false);
        
        return arbol;
    }
    
    public static void pressToContinue(){
        Scanner scan =new Scanner(System.in);
        System.out.print("Presione intro para continuar...");
        scan.nextLine();
    }
}
