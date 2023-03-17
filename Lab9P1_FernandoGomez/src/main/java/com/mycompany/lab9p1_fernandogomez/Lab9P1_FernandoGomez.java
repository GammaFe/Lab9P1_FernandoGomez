package com.mycompany.lab9p1_fernandogomez;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab9P1_FernandoGomez {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);;
        int caso = 9;
        while (caso != 0) {
            System.out.println("Desea desea comenzar 1/si 0/salir ");
            caso = entrada.nextInt();

            switch (caso) {
                case 1:
                    System.out.println("Ingrese el numero de clientes a generar: ");
                    int clientes = entrada.nextInt();
                    System.out.println("Ingrese el numero de escritorios disponibles: ");
                    int escritorios = entrada.nextInt();
                    ventanilla(escritorios);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingrese un numeor valido");
                    break;
            }
        }

    }// Fuera del main

}
