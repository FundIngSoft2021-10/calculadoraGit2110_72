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