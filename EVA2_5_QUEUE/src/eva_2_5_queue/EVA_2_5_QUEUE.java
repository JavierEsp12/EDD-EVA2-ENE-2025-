/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_5_queue;

/**
 *
 * @author Javier Alonso Espinoza Palafox
 */
public class EVA_2_5_QUEUE {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(100);
        queue.push(200);
        queue.push(300);
        queue.push(400);
        queue.push(500);

        try {
            System.out.println("Peek: " + queue.peek());
            System.out.println("Pop: " + queue.pop());
        } catch (Exception ex){
            ex.printStackTrace();
        }

        queue.printList();
    }
}

