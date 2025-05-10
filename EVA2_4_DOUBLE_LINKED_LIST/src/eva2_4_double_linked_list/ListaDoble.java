/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_4_double_linked_list;

/**
 *
 * @author Usuario
 */
public class ListaDoble {
    private Nodo inicio;
    private Nodo fin;
    
    public ListaDoble(){
        inicio = null; //no hay nodos en la lista
        fin = null;
    }
    
    public void add(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setPrevio(fin);
            fin = nuevo;
        }
    }
    
    public int printList(){
        int cont = 0;
        Nodo temp = inicio; 
        while(temp != null){
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }
        return cont;
    }
    
    // metodo imprimir lista inversa
    public int printListInver(){
        int cont = 0;
        Nodo temp = fin; 
        while(temp != null){
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getPrevio();
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
    
    public void insertAt(int valor, int posicion) throws Exception {
        if (posicion < 0 || posicion > size()) {
            throw new Exception("Posición inválida");
        }

        Nodo nuevo = new Nodo(valor);

        if (posicion == 0) {
            nuevo.setSiguiente(inicio);
            if (inicio != null)
                inicio.setPrevio(nuevo);
            inicio = nuevo;
            if (fin == null)
                fin = nuevo;
        } else if (posicion == size()) {
            add(valor); // Inserción al final
        } else {
            Nodo temp = inicio;
            for (int i = 0; i < posicion; i++) {
                temp = temp.getSiguiente();
            }
            Nodo previo = temp.getPrevio();
            previo.setSiguiente(nuevo);
            nuevo.setPrevio(previo);
            nuevo.setSiguiente(temp);
            temp.setPrevio(nuevo);
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
    
    public int findKth(int posicion) throws Exception {
        if (posicion < 0 || posicion >= size())
            throw new Exception("Posición inválida");

        Nodo temp = inicio;
        for (int i = 0; i < posicion; i++) {
            temp = temp.getSiguiente();
        }
        return temp.getValor();
    }
    
    public void deleteAt(int posicion) throws Exception {
        if (inicio == null)
            throw new Exception("La lista está vacía");
        if (posicion < 0 || posicion >= size())
            throw new Exception("Posición inválida");

        if (posicion == 0) {
            inicio = inicio.getSiguiente();
            if (inicio != null)
                inicio.setPrevio(null);
            else
                fin = null;
        } else {
            Nodo temp = inicio;
            for (int i = 0; i < posicion; i++) {
                temp = temp.getSiguiente();
            }
            Nodo anterior = temp.getPrevio();
            Nodo siguiente = temp.getSiguiente();
            if (anterior != null)
                anterior.setSiguiente(siguiente);
            if (siguiente != null)
                siguiente.setPrevio(anterior);
            if (temp == fin)
                fin = anterior;
        }
    }
}
