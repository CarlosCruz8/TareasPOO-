/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos Cruz
 */
public class calculo {
    private double cambio1;
    private double resultado;
    private int moneda;
    private int monedar;

    public double getCambio1() {
        return cambio1;
    }

    public void setCambio1(double cambio1) {
        this.cambio1 = cambio1;
    }

    public int getMoneda() {
        return moneda;
    }

    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }

    public int getMonedar() {
        return monedar;
    }

    public void setMonedar(int monedar) {
        this.monedar = monedar;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public calculo() {
    }
    
    
   public double convertir(){
   
   if(moneda==1&&monedar==0){
   resultado= cambio1 * 0.04; 
   }else if(moneda==1&&monedar==1){
   resultado=cambio1;
   }
   if(moneda==0&&monedar==1){
   resultado= cambio1 * 24.91; 
   }else if(moneda==0&&monedar==0){
   resultado=cambio1;
   }
   
    return resultado;
   }
    
}
