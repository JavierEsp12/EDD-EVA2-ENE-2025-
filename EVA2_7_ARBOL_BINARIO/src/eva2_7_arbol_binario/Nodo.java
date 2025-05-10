/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_7_arbol_binario;

/**
 *
 * @author Usuario
 */
public class Nodo {
    private int valor;
    private Nodo izquierda;
    private Nodo derecha;
    
    public Nodo() {
        izquierda = null; //siempre siguiente tiene que ser null, no hay nodo mas adelante
    }
    
    public Nodo(int valor) {
        this.valor = valor;
        izquierda = null;
        derecha = null;
    }

    public int getValor() {
        return valor;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
}
