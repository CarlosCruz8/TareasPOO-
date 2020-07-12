/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid;

/**
 *
 * @author Carlos Cruz
 */
public class Covid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Covid19 covid19 = new Covid19();
covid19.setNombre("Pedro");
covid19.setTiposangre("0+");
covid19.setEdad (45);
covid19.setSintomas ("Fiebre");
covid19.setTiempo ("11 dias");
covid19.setLugar ("Supermercados y Farmacias");


System.out.println("Boleta de Pacientes con Covid19");
System.out.println("Nombre: " + covid19.getNombre() );
System.out.println("Edad: " + covid19.getEdad() );
System.out.println("Tipo de sangre: " + covid19.getTiposangre() );
System.out.println("Sintomas: " + covid19.getSintomas() );
System.out.println("Tiempo de reposo : " + covid19.getTiempo() );
System.out.println("Lugares que visito : " + covid19.getLugar() );

}
public static class Covid19{

private String nombre;
private String tiposangre;
private int edad;
private String sintomas;
private String tiempo;
private String lugar;


public String getNombre(){
return nombre;
 }
public String getTiposangre(){
return tiposangre;
 }
public int getEdad(){
return edad;
 }
public String getSintomas(){
return sintomas;
 }
public String getTiempo(){
return tiempo;
 }
public String getLugar(){
return lugar;
 }

public void setNombre(String nombre){
this.nombre = nombre;
 }
public void setTiposangre(String tiposangre){
this.tiposangre = tiposangre;
 }
public void setEdad(int edad){
this.edad = edad;
 }
public void setSintomas(String sintomas){
this.sintomas = sintomas;
 }
public void setTiempo(String tiempo){
this.tiempo = tiempo;
 }
public void setLugar(String lugar){
this.lugar = lugar;
 }
}
 }
    
    
    

