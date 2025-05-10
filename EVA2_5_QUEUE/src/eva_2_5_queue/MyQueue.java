/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_2_5_queue;

/**
 *
 * @author Usuario
 */
public class MyQueue {
    private Nodo inicio;
    private Nodo fin;
    
    public MyQueue(){
        inicio = null; //no hay nodos en la lista
        fin = null;
    }
    
    //AGREGAR UN NODO AL FINAL DE LA LISTA
    public void add(int valor){
        //CREAR UN NODO CON ESE VALOR
        Nodo nuevo = new Nodo(valor);
        //no se puede acceder al nodo final de manera directa
        // Y si la lista esta vacia
        if(inicio == null){
            inicio = nuevo;
            fin = nuevo;
        }else{
            //MOVERNOS AL FINAL (ULTIMO NODO)
            /*Nodo temp = inicio; 
            while(temp.getSiguiente() != null){
                //COMO ME MUEVO AL SIGUIENTE NODO
                temp = temp.getSiguiente();
            }
            //TEMP YA SE ENCUENTRA EN EL ULTIMO NODO
            temp.setSiguiente(nuevo); */
            //cnonectamos
            // ahora es O(1)
            fin.setSiguiente(nuevo);
            // se mueve fin al nuevo nodo (nuevo final de la lista)
            fin = nuevo;
        }
    }
    
    public int printList(){
        int cont = 0;
        Nodo temp = inicio; 
        while(temp != null){
            System.out.println("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }
        return cont;
    }
    
    public int size(){
        int cont = 0;
        Nodo temp = inicio; 
        while(temp != null){
            cont++;
            temp = temp.getSiguiente();
        }
        return cont;
    }
    
    public void inserAt(int valor, int posicion) throws Exception{
        //VERIFICAR EL ESTADO DE LA LISTA
        //POSICION ES VALIDA
        //0 (CERO -- PRIMER NODO)
        //N - 1 (N -- CANTIDAD DE NODOS DE LA LISTA
        if(inicio == null) // verificar si hay nodos en la lista
            //llamar una excepcion (la lista esta vacia)
            throw new Exception("La lista esta vacia!!");
        else{ //hay nodos, podemos insertar nuevos nodos
            if(posicion < 0 || posicion >= size()){
                Nodo nuevoNodo = new Nodo(valor);
                if(posicion == 0){
                    nuevoNodo.setSiguiente(inicio);
                    inicio = nuevoNodo;
                } else{
                    Nodo temp = inicio;
                    int cont = 0;
                    while(cont < posicion){
                        //moverme al siguiente nodo
                        cont++;
                        temp = temp.getSiguiente();
                    }
                    nuevoNodo.setSiguiente(temp.getSiguiente());
                    temp.setSiguiente(nuevoNodo);
                }
            } else {
                throw new Exception("posicion invalida");
            }
        }
    }
    
    //VACIAR LA LISTA
    //o(1)
    public void clear(){
        inicio = null;
        fin = null;
    }
    
    //Regresa true si la lista no tiene nodos
    //Regresa false si la lista si tiene nodos
    //O(1)
    public boolean isEmpty(){
        if (inicio == null)
            return true;
        else
            return false;
    }
    
    public void deleAt(int posicion) throws Exception {
        if (inicio == null)
            throw new Exception("La lista esta vacia !!");
        else {
            if (posicion >= 0 && posicion < size()) {
                if (posicion == 0){
                    inicio = inicio.getSiguiente();
                } else {
                    Nodo temp = inicio;
                    for (int i = 0; i < (posicion - 1); i++) {
                        temp = temp.getSiguiente();
                    } 
                    temp.setSiguiente(temp.getSiguiente().getSiguiente());
                }
            } else {
                throw new Exception ("posicion invalida");
            }
        }
    }
    
    //debe regresar el valor almacenado en la posicion indicada
    public int findkth(int posicion)throws Exception {
        if(inicio == null) // verificar si hay nodos en la lista
            //llamar una excepcion (la lista esta vacia)
            throw new Exception("La lista esta vacia!!");
        // Verificamos si la posición es válida
        if (posicion < 0 || posicion >= size()) {
            throw new Exception("Posición inválida");
        }
           // Recorremos la lista hasta la posición solicitada
        Nodo temp = inicio;
        for (int i = 0; i < posicion; i++) {
            temp = temp.getSiguiente();
        }
        // Devolvemos el valor del nodo en la posición
        return temp.getValor(); 
    }
    
     //PUSH
    public void push(int valor){
        add(valor);
    }
    
    //Pop: recupera un valor de la estructura (QUEUE)
    //Elimina el nodo
    public int pop() throws Exception{
        int valor = findkth(0);
        deleAt(0);
        return valor;
    }
    
    //Peek: recupera un valor de la estructura (QUEUE)
    public int peek() throws Exception{
        int valor = findkth(0);
        return valor;
    }
}

  