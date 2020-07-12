/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalciudadano;

/**
 *
 * @author Carlos Cruz
 */
public class PrincipalCiudadano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ciudadano ciudadano=new Ciudadano("Carlos");
        System.out.println("Nombre");
        ciudadano.Darnombre();
        ciudadano.EstablecerEdad(21);
        System.out.println("");
        System.out.println("Edad");
        System.out.println(ciudadano.ObtenerEdad()+" Años");
        ciudadano.EstablecerExpe(2);
        System.out.println("");
        System.out.println("Experiencia");
        System.out.println(ciudadano.ObtenerExpe()+" Años de experiencia");
        
        
        
    }
    
}
