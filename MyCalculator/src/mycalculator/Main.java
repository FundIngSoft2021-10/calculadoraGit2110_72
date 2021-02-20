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
