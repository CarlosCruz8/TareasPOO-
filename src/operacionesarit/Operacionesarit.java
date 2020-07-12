/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesarit;

import static java.time.Clock.system;

/**
 *
 * @author Carlos Cruz
 */
public class Operacionesarit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          //declaracion larga
    double suma = 0;
    double resta = 0;
    double multiplicacion = 0;
    double division = 0;
    double mod=0;
    double numero1 = 4;
    double numero2 = 8;
   
    
    suma =  numero1 +numero2;
    resta =  numero1 - numero2 ;
    multiplicacion =  numero1*numero2;
    mod = numero1 % numero2;
    
    if (numero2 !=0) {
    division = numero1/numero2;
}
    
    {
    System.out.println("la suma es:"+suma);
    System.out.println("la resta es:"+resta);
    System.out.println("la multiplicacion es:"+multiplicacion);
    System.out.println("la division es:"+ division);
     System.out.println("el porcentaje entre los dos numeros es:"+ mod);

    }
    
    }}