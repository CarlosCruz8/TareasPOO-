
package recursos;
import java.util.Scanner;
public class principal {
    private static int i;
    private static boolean o;
    public static void main(String[] args)
    {
       Scanner leer = new Scanner(System.in);
        
        Recursos a[] = new Recursos[1];
        
        String met1="";
        String met2="";
        String met3="";
        String met4="";           
        String mensaje;
        int num1=0;
        int num2=0;
        int cal;
        int n=0;
        
        double division=0;
       
        if (num2 !=0) {
        division = num1/num2;
        }
          
        
          for(int i=0;i<a.length;i++)
        {
            System.out.println("Estoy aprendiendo,pero sere el mejor programador del mundo");
            System.out.println("Preciona Enter");
            leer.nextLine();
            System.out.println("Ingresa tu Calificacion");
            cal = leer.nextInt();
            if (cal >= 70){
            mensaje=("Aprobado");
            }else{
            mensaje =("Reprobado");
            }
             
            leer.nextLine();
            System.out.println("tu calificacion fue "+cal+"  por lo tanto tu estas  "+mensaje);
            System.out.println("Preciona Enter");
            leer.nextLine();
            System.out.println("ingrese el primer numero para la division");
            num1=leer.nextInt();
            System.out.println("ingrese el segundo numero para la division");
            num2=leer.nextInt();
            System.out.println("La division de los 2 numeros es:"+division);
            System.out.println("Preciona Enter");
            leer.nextLine();
            System.out.println("se realizara una lista del numero 1 hasta el numero que tu indiques");
            System.out.println("ingrese el numero");
            n= leer.nextInt();
            
            for(int x = 1; x<= n;x++)
                System.out.println(x+"");
               
                }
          for(int i=0;i<a.length;i++)
          {
              System.out.println(a[i].getMet1()+"  "+a[i].getMet2()+"    "+a[i].getMet3()+"    "+a[i].getMet4()); 
          }
    }
         
          
}

