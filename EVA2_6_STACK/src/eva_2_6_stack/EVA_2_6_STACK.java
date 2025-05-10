/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_6_stack;

/**
 *
 * @author Javier Alonso Espinoza Palafox
 */
public class EVA_2_6_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        stack.push(500);
        try {
            System.out.println("Peek: " + stack.pop());
        } catch (Exception ex){
            ex.printStackTrace();
        }
        stack.printStack();
    }
    
}
