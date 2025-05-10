/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_double_linked_list;

/**
 *
 * @author Javier Alonso Espinoza Palafox
 */
public class EVA2_4_DOUBLE_LINKED_LIST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        lista.add(100);
        lista.add(200);
        lista.add(300);
        lista.add(400);
        lista.add(500);
        lista.printList();
        System.out.println("");
        lista.printListInver();
        System.out.println("Cantidad de nodos " + lista.size());
    }
    
}
