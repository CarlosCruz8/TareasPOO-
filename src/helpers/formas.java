/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author Carlos Cruz
 */
public class formas {
    private String color;
    private String dibujar;
    private int calculo;

public formas(){
    //
}

public void establecerColor(String color){
this.color = color;

}
public String obtenerColor(){
return this.color;
}

public void establecerDibujar(String dibujar){
this.dibujar = dibujar;

}
public String obtenerDibujar(){
return this.dibujar;
}

public void establecerCalculo(int calculo){
this.calculo = calculo;

}
public int obtenerCalculo(){
return this.calculo;
}

public void Imprimirinfo(){
System.out.println("Nombre:"+dibujar);
System.out.println("Color:"+color);
System.out.println("Calculo del Area,largo o Radio: "+calculo);
}

}