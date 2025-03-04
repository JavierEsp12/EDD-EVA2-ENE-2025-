/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_examen_1ra;

import java.util.Scanner;

/**
 *
 * @author Javier Alonso Espinoza Palafox 23550416
 */
public class EVA2_EXAMEN_1RA {

    public static void main(String[] args) {
        int arreglo1[], arreglo2[];
        boolean igual = true;
        Scanner captu = new Scanner(System.in);
        System.out.print("Tamaño del arreglo: ");
        int tama = captu.nextInt();
        captu.nextLine();
        arreglo1 = new int[tama];
        arreglo2 = new int[tama];
        
        for (int i = 0; i < tama; i++){
            System.out.print("Valor arreglo1 [" + i + "] ");
            arreglo1[i] = captu.nextInt();
            captu.nextLine();
        }
        for (int i = 0; i < tama; i++){
            System.out.print("Valor arreglo2 [" + i + "] ");
            arreglo2[i] = captu.nextInt();
            captu.nextLine();
        }
        
        System.out.print("\nArreglo 1: ");
        for (int i = 0; i < tama; i++){
            System.out.print("[" + arreglo1[i] + "]");
        }
        System.out.print("\nArreglo 2: ");
        for (int i = 0; i < tama; i++){
            System.out.print("[" + arreglo2[i] + "]");
        }
        
        for (int i = 0; i < tama; i++){
            if(arreglo1[i] != arreglo2[i])
                igual = false;
        }
        
        if (igual == true)
            System.out.println("\nArreglos Iguales");
        else
            System.out.println("\nArreglos diferentes");
    }
}
