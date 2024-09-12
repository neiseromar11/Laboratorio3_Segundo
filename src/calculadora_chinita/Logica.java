/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora_chinita;

/**
 *
 * @author NEISER
 */
public class Logica {
    
    private double valor1;
    private double valor2;
    
    private String txtvalor1;
    private String txtvalor2;
    private int operacion;
    
     private static final int SUMA=0;
    private static final int RESTA=1;
    private static final int MULTIPLICACION=2;
    private static final int DIVISION=3;
    
    public Logica(String txtvalor1, String txtvalor2, int operacion){
        this.txtvalor1=txtvalor1;
        this.txtvalor2=txtvalor2;
        this.operacion=operacion;
    }
    private void convertir(){
    this.valor1=getNumero(txtvalor1);
    this.valor2=getNumero(txtvalor2);
    
    }
    public double getResultado(){
    switch(operacion){
          case SUMA: return this.sumar();
          case RESTA:return this.restar();
          case MULTIPLICACION:return this.multiplicar();
          case DIVISION:return this.dividir();
      }
        return 0;
    }
    
    public double sumar(){
    convertir();
    return valor1 + valor2;
    }
    public double restar(){
    convertir();
    return valor1 - valor2;
    }
    public double multiplicar(){
    convertir();
    return valor1 * valor2;
    }
    public double dividir(){
    convertir();
    return valor1 / valor2;
    }
    
    private double getNumero(String s){
        try{
            return Double.parseDouble(s);
        }catch (Exception e){
            return 0 ;
        }
    }
    
}
