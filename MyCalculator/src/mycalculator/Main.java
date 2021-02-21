/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycalculator;

/**
 *
 * @author anmontero
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main p = new Main();
        //Create calculator implementation
        System.out.println("Git Calculator!");
        pruebasCalculadoraSFCM();
        pruebasCalculadoraDCFG();
        p.pruebaCalculadoraJACS(1, 0);
        pruebasCalculadoraJDTG();
        pruebaCalculadoraJERB();
        pruebasCalculadoraJCMH();
        pruebasCalculadoraSFB(1, 1);
        pruebasCalculadoraDSMC();
        pruebasCalculadoraEAVB();
    }
    
	public static void pruebasCalculadoraDCFG() {
		
		double a=15;
		double b=3;
		
		CalculadoraDCFG calcu= new CalculadoraDCFG();
		
		System.out.println(calcu.about());
		System.out.println(a+"+"+b+"="+calcu.add(a, b));
		System.out.println(a+"-"+b+"="+calcu.substract(a, b));
		System.out.println(a+"*"+b+"="+calcu.multiply(a, b));
		try {
			System.out.println(a+"/"+b+"="+calcu.divide(a, b));			
		}catch(ArithmeticException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	public void pruebaCalculadoraJACS(double a,double b) {
		CalculatorJACS c = new CalculatorJACS();
		System.out.println(c.about());
		System.out.println("Numbers a = " + a + ", b = " + b + "");
		System.out.println("Addition: " + c.add(a, b));
		System.out.println("Substraction: " + c.substract(a, b));
		System.out.println("Product: " + c.multiply(a, b));
		try {			
			System.out.println("Quotient: " + c.divide(a, b));
		}catch(ArithmeticException x) {
			System.out.println("Error al dividir: " + x.getMessage());
		}
	}
    
    public static void pruebasCalculadoraSFCM()
    {
        double a = 80;
        double b = 2;
        CalculadoraSFCM calculadora = new CalculadoraSFCM();
        System.out.println(calculadora.about());

        System.out.println(a + " + " + b + " = " + calculadora.add(a, b));

        System.out.println(a + " - " + b + " = " + calculadora.substract(a, b));

        System.out.println(a + " * " + b + " = " + calculadora.multiply(a, b));

        System.out.println(a + " / " + b + " = " + calculadora.divide(a, b));
    }
    
    public static void pruebasCalculadoraJDTG()
    {
        double a = 30;
        double b = 15;
        CalculadoraJDTG  calc = new CalculadoraJDTG();
        System.out.println(calc.about());

        System.out.println(a + " + " + b + " = " + calc.add(a, b));

        System.out.println(a + " - " + b + " = " + calc.substract(a, b));

        System.out.println(a + " * " + b + " = " + calc.multiply(a, b));
        try{
            System.out.println(a + " / " + b + " = " + calc.divide(a, b));
        }catch(ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
	}
    }
    public static void pruebaCalculadoraJERB()
    {
        double a = 20;
        double b = 10;
        CalculadoraJERB calc = new CalculadoraJERB();
        System.out.println(calc.about());
        
         System.out.println(a + " + " + b + " = " + calc.add(a, b));

        System.out.println(a + " - " + b + " = " + calc.substract(a, b));

        System.out.println(a + " * " + b + " = " + calc.multiply(a, b));

       try{
            System.out.println(a + " / " + b + " = " + calc.divide(a, b));
        }catch(ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
	}
    }
    public static void pruebasCalculadoraJCMH()
    {
        double a = 10;
        double b = 5;
        CalculadoraJCMH calculadora = new CalculadoraJCMH();

        System.out.println(calculadora.about());

        System.out.println(a + " + " + b + " = " + calculadora.add(a, b));

        System.out.println(a + " - " + b + " = " + calculadora.substract(a, b));

        System.out.println(a + " * " + b + " = " + calculadora.multiply(a, b));

        System.out.println(a + " / " + b + " = " + calculadora.divide(a, b));
    }
    
    public static void pruebasCalculadoraSFB(double a, double b){
        
        CalculadoraSFB calculadora = new CalculadoraSFB();

        System.out.println(calculadora.about());

        System.out.println(a + " + " + b + " = " + calculadora.add(a, b));

        System.out.println(a + " - " + b + " = " + calculadora.substract(a, b));

        System.out.println(a + " * " + b + " = " + calculadora.multiply(a, b));

        System.out.println(a + " / " + b + " = " + calculadora.divide(a, b));
       
    }
    
     public static void pruebasCalculadoraDSMC()
    {
        double numa = 1000;
        double numb = 200;
        CalculadoraDSMC calculadora = new CalculadoraDSMC();

        System.out.println(calculadora.about());

        System.out.println(numa + " + " + numb + " = " + calculadora.add(numa, numb));

        System.out.println(numa + " - " + numb + " = " + calculadora.substract(numa, numb));

        System.out.println(numa + " * " + numb + " = " + calculadora.multiply(numa, numb));

        System.out.println(numa + " / " + numb + " = " + calculadora.divide(numa, numb));
    }
     
     public static void pruebasCalculadoraEAVB() {
 		
 		double a=150;
 		double b=332;
 		
 		CalculadoraEAVB calcu= new CalculadoraEAVB();
 		
 		System.out.println(calcu.about());
 		System.out.println(a+"+"+b+"="+calcu.add(a, b));
 		System.out.println(a+"-"+b+"="+calcu.substract(a, b));
 		System.out.println(a+"*"+b+"="+calcu.multiply(a, b));
 		try {
 			System.out.println(a+"/"+b+"="+calcu.divide(a, b));			
 		}catch(ArithmeticException ex) {
 			System.out.println("Error: " + ex.getMessage());
 		}
 	}
}
