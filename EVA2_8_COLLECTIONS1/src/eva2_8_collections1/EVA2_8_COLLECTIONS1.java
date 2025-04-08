/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_collections1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Javier Alonso Espinoza Palafox 23550416
 */
public class EVA2_8_COLLECTIONS1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Integer> miLista = new LinkedList(); //Es mas eficiente que el Arraylist en gran cantidad de datos
        miLista.add(100); //0
        miLista.add(200); //1
        miLista.add(300); //2
        miLista.add(400); //3
        miLista.add(500); //4
        miLista.add(600); //5
        System.out.println(miLista);
        miLista.remove(3);
        System.out.println(miLista);
        miLista.add(2, 999999999);
        System.out.println(miLista);
        
        System.out.println("ARRAYLIST");
        ArrayList<String> miArrayList = new ArrayList(); //Si son pocos datos no tiene diferencia usar un ArrayList y un Linkedlis
        miArrayList.add("Hola");
        miArrayList.add("");
        miArrayList.add("mundo");
        miArrayList.add("cruel");
        miArrayList.add("Hola");
        System.out.println(miArrayList);
        for (int i = 0; i < miArrayList.size(); i++){
            System.out.println("[" + miArrayList.get(i) + "]");
        }
        // QUEUES
        System.out.println("");
        System.out.println("QUEUES");
        Queue<Integer> myQueue = new LinkedList();
        myQueue.add(100);
        myQueue.add(200);
        myQueue.add(300);
        myQueue.add(400);
        myQueue.add(500);
        System.out.println(myQueue.peek());
        System.out.println(myQueue);
        System.out.println(myQueue.poll());
        System.out.println(myQueue);
        //STACK
        System.out.println("STACK");
        Stack<Integer> stack = new Stack();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        stack.push(500);
        System.out.println("CIMA: " + stack.peek());
        System.out.println(stack);
        System.out.println("CIMA: " + stack.pop());
        System.out.println(stack);
        //conjuntos
        //set
        System.out.println("CONJUNTOS (SET)");
        HashSet<String> conjunto = new HashSet();
        conjunto.add("ROJO");
        conjunto.add("AZUL");
        conjunto.add("VERDE");
        conjunto.add("AMARILLO");
        conjunto.add("AMARILLO"); //NO ACEPTA ELEMENTOS REPETIDOS
        System.out.println(conjunto);
        //MAPS (MAPS)
        System.out.println("MAPAS");
        Map<String, Integer> mapa = new HashMap();
        mapa.put("LUNES", 1);
        mapa.put("MARTES", 2);
        mapa.put("MIERCOLES", 3);
        mapa.put("JUEVES", 4);
        mapa.put("VIERNES", 5);
        mapa.put("SABADO", 6);
        mapa.put("DOMINGO", 7);
        System.out.println(mapa.get("LUNES"));
        System.out.println(mapa);
    }
    
}
