/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.politecnicomalaga.ejercicio_3_aga;

import java.util.Scanner;

/**
 *
 * @author mint
 */
public class Ejercicio_3_aga {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        int suma = 0;
        int resta;
        
        System.out.println("Introduzca un número N: ");
        n = sc.nextInt();
        sc.reset();
        resta = n + 1;
        
        for(int i = 0;i < n; i++){
            resta -= 1;
            suma += 1;
            System.out.println(suma + " --> " + resta);
        } 
    }
}
