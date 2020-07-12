/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalpaises;

/**
 *
 * @author Carlos Cruz
 */
public class PrincipalPaises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Afganistan afg = new Afganistan();
        Canada can = new Canada();
        Alemania alm = new Alemania();
        
        System.out.println("Tarea Individual módulo 4 ABSTRACCION");
        
        System.out.println("Pais; "+afg.getNomPais());
        System.out.println("Presidente; "+afg.getPresidente());
         System.out.println("");
        System.out.println("Pais; "+can.getNomPais());
        System.out.println("Presidente; "+can.getPresidente());
         System.out.println("");
        System.out.println("Pais; "+alm.getNomPais());
        System.out.println("Presidente; "+alm.getPresidente());
        
    }
    
}
