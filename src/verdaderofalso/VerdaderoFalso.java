/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verdaderofalso;

/**
 *
 * @author Carlos Cruz
 */
public class VerdaderoFalso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //declaracion larga
     int M = 6;
     int T = 1;
     int K = -10;
     
     System.out.println("M=6, T=1, K=-10");
     if (M > T ){
         System.out.println("VERDADERO, M Es mayor que T");
     }else{
         System.out.println("FALSO, M No mayor que T");
    }
     if(T / K ==-5){
     System.out.println("VERDADERO,T Entre K es igual a -5");
     }else{
         System.out.println("FALSO,T Entre K es igual a -9");
     }
     if (M+T == 7){
     System.out.println("VERDADERO,M Mas T es igual a 7");
     }else{
         System.out.println("FALSO,M Mas T es igual a "+M+T);
     }
     if (M-T == 5){
     System.out.println("VERDADERO,M Menos T es igual a 5");
     }else{
         System.out.println("FALSO,M Menos T es igual a "+(M-T));
     }
    }
     
}