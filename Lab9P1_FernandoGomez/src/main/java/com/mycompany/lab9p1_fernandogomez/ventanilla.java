package com.mycompany.lab9p1_fernandogomez;

import java.util.ArrayList;
import java.util.Random;
 

public class ventanilla {
    public ArrayList colaRegular = new ArrayList();
    public ArrayList colaPrioridad = new ArrayList();
    public int[] ventanilla = new int[0];
    public char[] clientesEnVentanilla = new char[0];

    public ventanilla(int a) {//constructor
        
    }
    public void agregarClienteRegular(int a){
        int digit = new Random().nextInt((5 - 1) + 1) + 1;
        colaRegular.add(a);
    }
    
    public ventanilla(int clientes) {
        System.out.println("colaregular[0]");
        }
    
    
}////////////////////
    
    

