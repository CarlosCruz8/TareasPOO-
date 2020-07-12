/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareamod5;

import helpers.circulo;
import helpers.cuadrado;
import helpers.linea;
import helpers.triangulo;

/**
 *
 * @author Carlos Cruz
 */
public class TareaMod5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       circulo circulo = new circulo(); 
       linea linea = new linea ();
       triangulo triangulo = new triangulo();
       cuadrado cuadrado = new cuadrado();
       
       System.out.println("Formas");
       
       circulo.Imprimirinfo();
       linea.Imprimirinfo();
       triangulo.Imprimirinfo();
       cuadrado.Imprimirinfo();
    }
    
}
