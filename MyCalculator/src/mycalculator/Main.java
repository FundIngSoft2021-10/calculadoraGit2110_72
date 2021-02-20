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
        
        //Create calculator implementation
        System.out.println("Git Calculator!");
<<<<<<< HEAD
        
        pruebasCalculadoraDCFG();
    }
    


	public static void pruebasCalculadoraDCFG() {
		
		double a=15;
		double b=3;
		
		CalculadoraDCFG calcu= new CalculadoraDCFG();
		
		System.out.println(calcu.about());
		System.out.println(a+"+"+b+"="+calcu.add(a, b));
		System.out.println(a+"-"+b+"="+calcu.substract(a, b));
		System.out.println(a+"*"+b+"="+calcu.multiply(a, b));
		System.out.println(a+"/"+b+"="+calcu.divide(a, b));
	}
}
=======
        pruebasCalculadoraSFCM();
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
}
>>>>>>> 4428699c887f6ba9550edd3e2db328031d65b8d5
