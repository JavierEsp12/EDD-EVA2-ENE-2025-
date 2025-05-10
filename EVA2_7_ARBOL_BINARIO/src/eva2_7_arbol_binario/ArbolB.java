/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_7_arbol_binario;

/**
 *
 * @author Usuario
 */
public class ArbolB {
    private Nodo root;

    public ArbolB(){
        root = null; //arbol vacio
    }
    
    //ADD NODO (OPERACIONES RECURSIVAS)
    //big(o) = logN
    public void add(int valor){
        //Hay nodos
        //no hay nodos
        Nodo nuevo = new Nodo(valor);
        if(root == null){
            root = nuevo;
        }else{
            addRec(valor, root);
        }
    }
    
    private void addRec(int valor, Nodo actual){
        if(valor < actual.getValor()){
            if(actual.getIzquierda() == null){
                actual.setIzquierda(new Nodo(valor));
            }else{
                addRec(valor, actual.getIzquierda());
            }
        }else if(valor > actual.getValor()){
            if(actual.getDerecha() == null){
                actual.setDerecha(new Nodo(valor));
            }else{
                addRec(valor, actual.getDerecha());
            }
        }
    }
    
    //big(o) = N
    public void inorder(){
        inorderRec(root);
        System.out.println("");
    }
    
    public void inorderRec(Nodo actual){
        if(actual != null){
           //recorrer todo el lado izquierdo
           inorderRec(actual.getIzquierda());
           //leer el valor
           System.out.print("[" + actual.getValor() + "]");
           //recorrer todo el lado derecho
           inorderRec(actual.getDerecha()); 
        }  
    }
    
    public void preorder(){
        preorderRec(root);
        System.out.println("");
    }
    
    public void preorderRec(Nodo actual){
        if(actual != null){
           System.out.print("[" + actual.getValor() + "]");
           preorderRec(actual.getIzquierda());
           preorderRec(actual.getDerecha()); 
        }  
    }
    
    public void posorder(){
        posorderRec(root);
        System.out.println("");
    }
    
    public void posorderRec(Nodo actual){
        if(actual != null){
           posorderRec(actual.getIzquierda());
           posorderRec(actual.getDerecha());
           System.out.print("[" + actual.getValor() + "]"); 
        }  
    }
}
