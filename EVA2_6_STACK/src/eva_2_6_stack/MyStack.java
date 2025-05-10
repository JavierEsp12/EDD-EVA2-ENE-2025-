/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_2_6_stack;

/**
 *
 * @author Usuario
 */
public class MyStack {
    private Nodo tope;

    public MyStack() {
        tope = null;
    }

    // Agregar elemento (push)
    public void push(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.setSiguiente(tope);
        tope = nuevo;
    }

    //Pop: recupera un valor de la estructura (QUEUE)
    //Elimina el nodo
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("La pila está vacía.");
        }
        int valor = tope.getValor();
        tope = tope.getSiguiente();
        return valor;
    }

    //Peek: recupera un valor de la estructura (QUEUE)
    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("La pila está vacía.");
        }
        return tope.getValor();
    }

    // Vaciar pila
    public void clear() {
        tope = null;
    }

    // Verificar si está vacía
    public boolean isEmpty() {
        return tope == null;
    }

    // Mostrar elementos
    public void printStack() {
        Nodo temp = tope;
        while (temp != null) {
            System.out.println("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }
    }

    // Tamaño de la pila
    public int size() {
        int cont = 0;
        Nodo temp = tope;
        while (temp != null) {
            cont++;
            temp = temp.getSiguiente();
        }
        return cont;
    }
}