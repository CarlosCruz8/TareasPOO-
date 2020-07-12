
package prom;

 import java.util.Scanner;
public class Prom {

    public static void main(String[] args) {
     
       
        Scanner entrada = new Scanner(System.in);
         Prom a[] = new Prom[2];
        int calificacion;
        String nombre;
        String mensaje;
         for(int i=0;i<a.length;i++){
        
        System.out.println("ingresa tu nombre");
        nombre = entrada.nextLine();
        
       System.out.println("ingresa tu calificacion");
       calificacion = entrada.nextInt();
        entrada.nextLine();
       
       if (calificacion >= 70){
               mensaje=("Aprobado");
           }else{
           mensaje =("Reprobado");
       }
         
       
        
       System.out.println(nombre+"  tu calificacion fue "+calificacion+"  por lo tanto tu estas  "+mensaje);
         }
    }
}
    
    

