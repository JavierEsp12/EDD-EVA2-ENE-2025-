/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_2_6_stack;

/**
 *
 * @author Usuario
 */
public class Nodo {
    private int valor;
    private Nodo siguiente;

    public Nodo() {
        siguiente = null;
    }

    public Nodo(int valor) {
        this.valor = valor;
        siguiente = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
