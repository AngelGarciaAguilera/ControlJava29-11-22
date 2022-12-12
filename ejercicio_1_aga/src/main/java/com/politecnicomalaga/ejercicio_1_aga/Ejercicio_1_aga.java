/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.politecnicomalaga.ejercicio_1_aga;

import java.util.Scanner;

/**
 *
 * @author mint
 */
public class Ejercicio_1_aga {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean continuar;
        String continua;
        int verde = 0;
        int amarillo = 0;
        int rojo = 0;
        int negro = 0;
        boolean menu = true;
        String opcion;
        
        while(menu){
            System.out.println("-------------------------------------------------");
            System.out.println("");
            System.out.println("Escoja la tarea a realizar:");
            System.out.println("1. Realizar triaje.");
            System.out.println("2. Mostrar estadísticas.");
            System.out.println("Otra tecla: SALIR.");
            
            opcion = sc.next();
            sc.reset();
            
            if("1".equals(opcion)){
                System.out.println("-------------------------------------------------");
                System.out.println("TRIAGE START");
                System.out.println("-------------------------------------------------");
                System.out.println("Para afirmar introduzca 'SI'. Para negar introduzca 'NO'.");
                continuar = true;
                while(continuar){
                    System.out.println("¿Puede caminar?");
                    continua = sc.next();
                    sc.reset();
            
                    if("SI".equals(continua)){
                        System.out.println("-------------------------------------------------");
                        System.out.println("Prioridad 3 Verde.");
                        System.out.println("Baja prioridad.");
                        verde += 1;
                        continuar = false;

                    }else if ("NO".equals(continua)){
                        System.out.println("¿Respira?");
                        continua = sc.next();
                        sc.reset();

                        if("SI".equals(continua)){
                            System.out.println("¿Se frecuencia respiratoria es mayor a 30 veces por minuto?");
                            continua = sc.next();
                            sc.reset();

                            if("SI".equals(continua)){
                                System.out.println("-------------------------------------------------");
                                System.out.println("Prioridad 1 Rojo.");
                                System.out.println("Alta prioridad.");
                                rojo += 1;
                                continuar = false;

                            }else if("NO".equals(continua)){
                                System.out.println("¿Tiene pulso radial?");
                                continua = sc.next();
                                sc.reset();

                                if("SI".equals(continua)){
                                    System.out.println("¿Está orientado el pulso?");
                                    continua = sc.next();
                                    sc.reset();

                                    if("SI".equals(continua)){
                                        System.out.println("-------------------------------------------------");
                                        System.out.println("Prioridad 2 Amarillo.");
                                        System.out.println("Prioridad media.");
                                        amarillo += 1;
                                        continuar = false;

                                    }else if("NO".equals(continua)){
                                        System.out.println("-------------------------------------------------");
                                        System.out.println("Prioridad 1 Rojo.");
                                        System.out.println("Alta prioridad.");
                                        rojo += 1;
                                        continuar = false;

                                    }
                                }else if("NO".equals(continua)){
                                    System.out.println("Controle la hemorragia.");
                                    System.out.println("-------------------------------------------------");
                                    System.out.println("Prioridad 1 Rojo.");
                                    System.out.println("Alta prioridad.");
                                    rojo += 1;
                                    continuar = false;

                                }
                            }
                        }else if("NO".equals(continua)){
                            System.out.println("¿Haciendo maniobras de reposición respira?");
                            continua = sc.next();
                            sc.reset();

                            if("SI".equals(continua)){
                                System.out.println("-------------------------------------------------");
                                System.out.println("Prioridad 1 Rojo.");
                                System.out.println("Alta prioridad.");
                                rojo += 1;
                                continuar = false;

                            }else if("NO".equals(continua)){
                                System.out.println("-------------------------------------------------");
                                System.out.println("Prioridad 0 Negro.");
                                System.out.println("Fallecimiento, prioridad nula.");
                                negro += 1;
                                continuar = false;
                            }   
                        }
                    }
                }
            }else if("2".equals(opcion)){
                System.out.println("-------------------------------------------------");
                System.out.println("MOSTRAR ESTADÍSTICAS");
                System.out.println("-------------------------------------------------");
                System.out.println("Negro: " + negro);
                System.out.println("Rojo: " + rojo);
                System.out.println("Amarillo: " + amarillo);
                System.out.println("Verde: " + verde);
                
            }else{
                menu=false;
            }
        }
    }
}
