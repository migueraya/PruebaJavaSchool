//package com.tsystems.javaschool.tasks.calculator;Si lo quito me da error
import java.text.DecimalFormat;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;


public class Calculator {
    
    

  public static void main(String[] args) throws ScriptException {
    Calculator calculadora=new Calculator();
    String operacion = "40+2.4544577*8/13";
    String operacion2 = "40+2.45445..77*845/13";
    String operacion3 = "40+6782.454/134577*813";
    //String resultado=calculadora.evaluate(operacion);
    System.out.println("Resultado:" +calculadora.evaluate(operacion));
    System.out.println("Resultado:"+calculadora.evaluate(operacion2));
    System.out.println("Resultado:"+calculadora.evaluate(operacion3));
    //double doble = Double.parseDouble(resultado);
    //Number.format("%.4f", resultado);
    
    //System.out.println("Resultado: "+String.format("%.4f", resultado));
    //System.out.println("Resultad0:"+doble);
    //System.out.printf("Resultado: %.4f", resultado);
    } 
    
   public String evaluate(String operacion) {
       String resultado;
    try {
        //añadimos motor javascript
      ScriptEngineManager mgr = new ScriptEngineManager();
      ScriptEngine motor = mgr.getEngineByName("JavaScript"); 
    // evaluamos 
    resultado = String.valueOf(motor.eval(operacion));
    //pasamos de string a double   
    Double doble = Double.parseDouble(resultado);
    DecimalFormat df = new DecimalFormat("#.0000");
    resultado=(df.format(doble));
    //double doble = Double.parseDouble(resultado);
      //System.out.printf("Resultado: %.4f", motor.eval(operacion));
    } catch (ScriptException e) {
          resultado="NULL";
            
    } 
    
    return resultado;

}
}
/*

public class Calculator {
     
     public static void main(String[] args) {
        
      Calculator mia=new Calculator();
      mia.evaluate("5+8*7");
    }
    
       
       public String evaluate(String expresion) {
        
        Integer number = Integer.valueOf(expresion);
        System.out.println(number);
        
        return expresion;
        
    }
     
     
}
*/