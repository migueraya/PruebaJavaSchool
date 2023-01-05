package com.tsystems.javaschool.tasks.currencyconverter;

import javax.script.ScriptException;

public class CurrencyConverter {

     public static void main(String[] args) throws ScriptException {
    
         CurrencyConverter mio= new CurrencyConverter();
         String operacion="1euro - 0.8euro";
         String operador1="-";
         String operador2="+";
         
         //convertToDollar(convertToEuro($10.00)+5euro)
}    
         
     public Double DolaresAEuros(String dolares+5euro) {
            Double euroADolar=1.06;
            Double DolarAEuro=0.94;
            Double convertido = Double.parseDouble(dolares)*DolarAEuro;
        
        return convertido;
        }
         
         /**
         CurrencyConverter mio= new CurrencyConverter();
         String operacion="1euro - 0.8euro";
         String operador1="-";
         String operador2="+";
         
         
         if (operacion.contains(operador1)) {
			
                        String[] partes = operacion.split("-");
                        String parte1 = partes[0]; // 123
                        String parte2 = partes[1];
                        
                        if (parte1.contains("$")){
                            
                            String CantidadDolares = parte1.replace("$", "");
                            String euros = parte2.replace("euro", "");
                            System.out.println("Cantidad dolares:"+CantidadDolares);
                            System.out.println("Cantidad euros:"+euros);
                            //System.out.println(mio.convertir(CantidadDolares));
                             double str1 = mio.convertir(CantidadDolares);
                             double str2 = Double.parseDouble(euros);
                             double resultado=(str1-str2);
                            System.out.println("Resultado final en euros es :" +resultado);
                        }
                        
                        else{
                            String CantidadEuros= parte1.replace("$", "");
                            System.out.println("Cantidad Euros:"+CantidadEuros);
                        }
                        
		} else {
			System.out.println("suma");
                        String[] partes = operacion.split("'+'");
                        String parte1 = partes[0];
                        System.out.print(parte1);// 123
                        String parte2 = partes[1];
                        
                        if (parte1.contains("$")){
                            
                            String CantidadDolares = parte1.replace("$", "");
                            String euros = parte2.replace("euro", "");
                            System.out.println("Cantidad dolares:"+CantidadDolares);
                            System.out.println("Cantidad euros:"+euros);
                            //System.out.println(mio.convertir(CantidadDolares));
                             double str1 = mio.convertir(CantidadDolares);
                             double str2 = Double.parseDouble(euros);
                             double resultado=(str1-str2);
                            System.out.println("Resultado final en euros es :" +resultado);
                        }
                        
                        else{
                            String CantidadEuros= parte1.replace("$", "");
                            System.out.println("Cantidad Euros:"+CantidadEuros);
                        }
		} 
    }
    
   public Double convertir(String dolares) {
        Double euroADolar=1.06;
        Double DolarAEuro=0.94;
        Double convertido = Double.parseDouble(dolares)*DolarAEuro;
        
        return convertido;
    }

   
  
    
    /**
     * Currency converter which converts the input statement and returns the result value.1
     * @param DolarAEuro 
     * @param dollarToEuroRate 1 Dollar equals XX Euro
     * @param statement input statement to convert
     * @return converted value
     */
   // public String convert(double DolarAEuro, String statement) {
        // TODO: Implement the logic here
        //return "";
    }

