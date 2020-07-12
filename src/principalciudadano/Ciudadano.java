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
public class Ciudadano {
    
    private String nombre;
    private int edad;
    private int experiencia;
    
    public Ciudadano(String nombre){
        this.nombre = nombre;   
    }
    
    public void Darnombre(){
    System.out.println(nombre);
    }
    
    public void EstablecerEdad(int edad){
    this.edad = edad;
    }
    public int ObtenerEdad(){
    return edad;
    }
    
    public void EstablecerExpe(int experiencia){
    this.experiencia = experiencia;
    }
    public int ObtenerExpe(){
    return experiencia;
    }
}
