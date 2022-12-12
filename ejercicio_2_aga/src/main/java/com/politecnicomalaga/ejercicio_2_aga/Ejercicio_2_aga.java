/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.politecnicomalaga.ejercicio_2_aga;

import java.util.Scanner;

/**
 *
 * @author mint
 */
public class Ejercicio_2_aga {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int menor = 0;
        int mayor = 0;
        int num;
        int suma = 0;
        int fuera = 0;
        boolean iguales = false;
        boolean continuar = true;
        
        while(continuar){
            System.out.println("-------------------------------------------------");
            System.out.println("Introduce el número menor de un intervalo:");
            menor = sc.nextInt();
            sc.reset();
            System.out.println("-------------------------------------------------");
            
            System.out.println("-------------------------------------------------");
            System.out.println("Introduce el número mayor de un intervalo:");
            mayor = sc.nextInt();
            sc.reset();
            System.out.println("-------------------------------------------------");

            if(menor >= mayor){
                System.out.println("El número mayor es igual o menor que el menor.");
            }else{
                continuar = false;
            }
        }
        System.out.println("Introduzca números:");
        do{
            num = sc.nextInt();
            sc.reset();
                
            if(num > menor && num < mayor){
                suma += num;
            }
            if(num < menor || num > mayor){
                fuera++;
            }
            if(num == menor || num == mayor){
                iguales = true;
            }
        }while(num != 0);
        System.out.println("La suma de los números introducidos que se encuentran dentro del intervalo es: " + suma);
        System.out.println("Has introducido " + fuera + " números fuera del intervalo");
        if(iguales){
            System.out.println("Ha introducido uno o más números iguales a los límites del intervalo");
        }else{
            System.out.println("No a introducido ningún número igual a los límites del intervalo");
        }
    }
}
