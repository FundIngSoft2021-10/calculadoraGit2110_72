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
        pruebasCalculadoraMAAS();
        pruebasCalculadoraSFCM();
        pruebasCalculadoraDCFG();
        p.pruebaCalculadoraJACS(1, 0);
        pruebasCalculadoraJDTG();
        pruebaCalculadoraJERB();
        pruebasCalculadoraJCMH();
        pruebasCalculadoraSFB(1, 1);
        pruebasCalculadoraDSMC();
        pruebasCalculadoraEAVB();
        pruebasCalculadoraSTM();
        pruebasCalculadoraNBS();
        pruebasCalculadoraSETB();
        pruebasCalculadoraJAMA();
        pruebasCalculadoraEAJ();
        pruebasCalculadoraDGA();
        pruebasCalculadoraCHG();
        pruebasCalculadoraCEET();
        pruebasCalculadoraSCMM();
        pruebaCalculadoraAFTA();
        pruebasCalculadoraEBA();
        pruebasCalculadoraSVS();
        pruebasCalculadoraATPP();
		pruebasCalculadoraAMC();
        pruebasCalculadoraMCAC();
        pruebasCalculadoraJTNG();
    }

    public static void pruebasCalculadoraMAAS() {
        double a = 65;
        double b = 34;
        CalculadoraMAAS calculadora = new CalculadoraMAAS();
        System.out.println(calculadora.about());
        System.out.println(a + " + " + b + " = " + calculadora.add(a, b));
        System.out.println(a + " - " + b + " = " + calculadora.substract(a, b));
        System.out.println(a + " * " + b + " = " + calculadora.multiply(a, b));
        System.out.println(a + " / " + b + " = " + calculadora.divide(a, b));
    }

    public static void pruebasCalculadoraJRRO() {
        double a = 20;
        double b = 66;
        CalculadoraJRRO cal = new CalculadoraJRRO();
        System.out.println(cal.about());

        System.out.println(a + " + " + b + " = " + cal.add(a, b));

        System.out.println(a + " - " + b + " = " + cal.substract(a, b));

        System.out.println(a + " * " + b + " = " + cal.multiply(a, b));
        try {
            System.out.println(a + " / " + b + " = " + cal.divide(a, b));
        } catch (ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void pruebasCalculadoraSETB() {
        double a = 3;
        double b = 2;

        CalculadoraSETB calcu = new CalculadoraSETB();

        System.out.println(calcu.about());
        System.out.println(a + "+" + b + "=" + calcu.add(a, b));
        System.out.println(a + "-" + b + "=" + calcu.substract(a, b));
        System.out.println(a + "*" + b + "=" + calcu.multiply(a, b));
        try {
            System.out.println(a + "/" + b + "=" + calcu.divide(a, b));
        } catch (ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void pruebasCalculadoraDCFG() {

        double a = 15;
        double b = 3;

        CalculadoraDCFG calcu = new CalculadoraDCFG();

        System.out.println(calcu.about());
        System.out.println(a + "+" + b + "=" + calcu.add(a, b));
        System.out.println(a + "-" + b + "=" + calcu.substract(a, b));
        System.out.println(a + "*" + b + "=" + calcu.multiply(a, b));
        try {
            System.out.println(a + "/" + b + "=" + calcu.divide(a, b));
        } catch (ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public void pruebaCalculadoraJACS(double a, double b) {
        CalculatorJACS c = new CalculatorJACS();
        System.out.println(c.about());
        System.out.println("Numbers a = " + a + ", b = " + b + "");
        System.out.println("Addition: " + c.add(a, b));
        System.out.println("Substraction: " + c.substract(a, b));
        System.out.println("Product: " + c.multiply(a, b));
        try {
            System.out.println("Quotient: " + c.divide(a, b));
        } catch (ArithmeticException x) {
            System.out.println("Error al dividir: " + x.getMessage());
        }
    }

    public static void pruebasCalculadoraSFCM() {
        double a = 80;
        double b = 2;
        CalculadoraSFCM calculadora = new CalculadoraSFCM();
        System.out.println(calculadora.about());

        System.out.println(a + " + " + b + " = " + calculadora.add(a, b));

        System.out.println(a + " - " + b + " = " + calculadora.substract(a, b));

        System.out.println(a + " * " + b + " = " + calculadora.multiply(a, b));

        System.out.println(a + " / " + b + " = " + calculadora.divide(a, b));
    }

    public static void pruebasCalculadoraJDTG() {
        double a = 30;
        double b = 15;
        CalculadoraJDTG calc = new CalculadoraJDTG();
        System.out.println(calc.about());

        System.out.println(a + " + " + b + " = " + calc.add(a, b));

        System.out.println(a + " - " + b + " = " + calc.substract(a, b));

        System.out.println(a + " * " + b + " = " + calc.multiply(a, b));
        try {
            System.out.println(a + " / " + b + " = " + calc.divide(a, b));
        } catch (ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void pruebaCalculadoraJERB() {
        double a = 20;
        double b = 10;
        CalculadoraJERB calc = new CalculadoraJERB();
        System.out.println(calc.about());

        System.out.println(a + " + " + b + " = " + calc.add(a, b));

        System.out.println(a + " - " + b + " = " + calc.substract(a, b));

        System.out.println(a + " * " + b + " = " + calc.multiply(a, b));

        try {
            System.out.println(a + " / " + b + " = " + calc.divide(a, b));
        } catch (ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void pruebasCalculadoraJCMH() {
        double a = 10;
        double b = 5;
        CalculadoraJCMH calculadora = new CalculadoraJCMH();

        System.out.println(calculadora.about());

        System.out.println(a + " + " + b + " = " + calculadora.add(a, b));

        System.out.println(a + " - " + b + " = " + calculadora.substract(a, b));

        System.out.println(a + " * " + b + " = " + calculadora.multiply(a, b));

        System.out.println(a + " / " + b + " = " + calculadora.divide(a, b));
    }

    public static void pruebasCalculadoraSFB(double a, double b) {

        CalculadoraSFB calculadora = new CalculadoraSFB();

        System.out.println(calculadora.about());

        System.out.println(a + " + " + b + " = " + calculadora.add(a, b));

        System.out.println(a + " - " + b + " = " + calculadora.substract(a, b));

        System.out.println(a + " * " + b + " = " + calculadora.multiply(a, b));

        System.out.println(a + " / " + b + " = " + calculadora.divide(a, b));

    }

    public static void pruebasCalculadoraDSMC() {
        double numa = 1000;
        double numb = 200;
        CalculadoraDSMC calculadora = new CalculadoraDSMC();

        System.out.println(calculadora.about());

        System.out.println(numa + " + " + numb + " = " + calculadora.add(numa, numb));

        System.out.println(numa + " - " + numb + " = " + calculadora.substract(numa, numb));

        System.out.println(numa + " * " + numb + " = " + calculadora.multiply(numa, numb));

        System.out.println(numa + " / " + numb + " = " + calculadora.divide(numa, numb));
    }

    public static void pruebasCalculadoraNBS() {

        double a = 20;
        double b = 2;
        CalculadoraNBS calculator = new CalculadoraNBS();

        System.out.println("Suma de a y b=" + calculator.add(a, b));

        System.out.println("Resta de a y b=" + calculator.substract(a, b));

        System.out.println("Multiplicacion de a y b=" + calculator.multiply(a, b));

        System.out.println("Dividicion de a y b=" + calculator.divide(a, b));

    }

    public static void pruebasCalculadoraEAVB() {

        double a = 150;
        double b = 332;

        CalculadoraEAVB calcu = new CalculadoraEAVB();

        System.out.println(calcu.about());
        System.out.println(a + "+" + b + "=" + calcu.add(a, b));
        System.out.println(a + "-" + b + "=" + calcu.substract(a, b));
        System.out.println(a + "*" + b + "=" + calcu.multiply(a, b));
        try {
            System.out.println(a + "/" + b + "=" + calcu.divide(a, b));
        } catch (ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void pruebasCalculadoraSTM() {
        double a = 60;
        double b = 30;
        CalculadoraJDTG cal = new CalculadoraJDTG();
        System.out.println(cal.about());

        System.out.println(a + " + " + b + " = " + cal.add(a, b));

        System.out.println(a + " - " + b + " = " + cal.substract(a, b));

        System.out.println(a + " * " + b + " = " + cal.multiply(a, b));
        try {
            System.out.println(a + " / " + b + " = " + cal.divide(a, b));
        } catch (ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void pruebasCalculadoraJAMA() {

        double a = 10;
        double b = 26;

        CalculadoraJAMA Jama = new CalculadoraJAMA();

        System.out.println(Jama.about());
        System.out.println(a + " + " + b + " = " + Jama.add(a, b));
        System.out.println(a + " - " + b + " = " + Jama.substract(a, b));
        System.out.println(a + " * " + b + " = " + Jama.multiply(a, b));
        try {
            System.out.println(a + " / " + b + " = " + Jama.divide(a, b));
        } catch (ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void pruebasCalculadoraEAJ() {

        double a = 19999;
        double b = 52;

        CalculadoraEAJ calculEAJ = new CalculadoraEAJ();

        System.out.println(calculEAJ.about());
        System.out.println(a + " + " + b + " = " + calculEAJ.add(a, b));
        System.out.println(a + " - " + b + " = " + calculEAJ.substract(a, b));
        System.out.println(a + " * " + b + " = " + calculEAJ.multiply(a, b));
        try {
            System.out.println(a + " / " + b + " = " + calculEAJ.divide(a, b));
        } catch (ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void pruebasCalculadoraDGA() {
        double a = 1;
        double b = 1;

        CalculadoraDGA calculadora = new CalculadoraDGA();

        System.out.println(calculadora.about());

        System.out.println(a + " + " + b + " = " + calculadora.add(a, b));

        System.out.println(a + " - " + b + " = " + calculadora.substract(a, b));

        System.out.println(a + " * " + b + " = " + calculadora.multiply(a, b));
        if (b != 0) {
            System.out.println(a + "/" + b + "=" + calculadora.divide(a, b));
        } else {
            System.out.println("No se puede dividir por 0");
        }

    }

    public static void pruebasCalculadoraCEET() {
        double a = 22;
        double b = 0;

        CalculadoraCEET calculadora = new CalculadoraCEET();

        System.out.println(calculadora.about());

        System.out.println(a + " + " + b + " = " + calculadora.add(a, b));

        System.out.println(a + " - " + b + " = " + calculadora.substract(a, b));

        System.out.println(a + " * " + b + " = " + calculadora.multiply(a, b));

        if (b == 0) {
            System.out.println("Operación imposible, el denominador no puede ser 0");

        } else {
            System.out.println(a + "/" + b + "=" + calculadora.divide(a, b));
        }

    }

    public static void pruebasCalculadoraCHG() {
        double a = 1;
        double b = 2;
        CalculadoraCHG calculadora = new CalculadoraCHG();

        System.out.println(calculadora.about());

        System.out.println(a + " + " + b + " = " + calculadora.add(a, b));

        System.out.println(a + " - " + b + " = " + calculadora.substract(a, b));

        System.out.println(a + " * " + b + " = " + calculadora.multiply(a, b));

        System.out.println(a + " / " + b + " = " + calculadora.divide(a, b));
    }

    public static void pruebasCalculadoraSCMM() {
        double a = 21;
        double b = 22;
        CalculadoraCHG calculadora = new CalculadoraSCMM();

        System.out.println(calculadora.about());

        System.out.println(a + " + " + b + " = " + calculadora.add(a, b));

        System.out.println(a + " - " + b + " = " + calculadora.substract(a, b));

        System.out.println(a + " * " + b + " = " + calculadora.multiply(a, b));

        System.out.println(a + " / " + b + " = " + calculadora.divide(a, b));
    }

    public static void pruebaCalculadoraAFTA() {
        double a = 21, b = 7;
        CalculadoraAFTA cal = new CalculadoraAFTA();
        System.out.println(cal.about());
        System.out.println(a + " + " + b + " = " + cal.add(a, b));
        System.out.println(a + " * " + b + " = " + cal.multiply(a, b));
        System.out.println(a + " - " + b + " = " + cal.substract(a, b));
        System.out.println(a + " / " + b + " = " + cal.divide(a, b));
    }

    public static void pruebasCalculadoraEBA() {
        double a = 80;
        double b = 53;
        CalculadoraEBA calculadora = new CalculadoraEBA();

        System.out.println(calculadora.about());

        System.out.println(a + " + " + b + " = " + calculadora.add(a, b));

        System.out.println(a + " - " + b + " = " + calculadora.substract(a, b));

        System.out.println(a + " * " + b + " = " + calculadora.multiply(a, b));

        System.out.println(a + " / " + b + " = " + calculadora.divide(a, b));
    }
    public static void pruebasCalculadoraSVS() {
        double a = 25,b = 100;
        CalculadoraSVS calculadora = new CalculadoraSVS();

        System.out.println(calculadora.about());
        System.out.println(a + " + " + b + " = " + calculadora.add(a, b));
        System.out.println(a + " - " + b + " = " + calculadora.substract(a, b));
        System.out.println(a + " * " + b + " = " + calculadora.multiply(a, b));
        System.out.println(a + " / " + b + " = " + calculadora.divide(a, b));
    }

    public static void pruebasCalculadoraATPP() {
        double a = 26;
        double b = 15;
        CalculadoraATPP calculator = new CalculadoraATPP();
        System.out.println(calculator.about());
        System.out.println(a + " + " + b + " = " + calculator.add(a, b));
        System.out.println(a + " - " + b + " = " + calculator.substract(a, b));
        System.out.println(a + " * " + b + " = " + calculator.multiply(a, b));
        System.out.println(a + " / " + b + " = " + calculator.divide(a, b));
    }
	
    public static void pruebasCalculadoraAMC() {
        double a = 20;
        double b = 20;
		
        CalculadoraAMC calculadora = new CalculadoraAMC();
		
        System.out.println(calculadora.about());
		
        System.out.println(a + " + " + b + " = " + calculadora.add(a, b));
        System.out.println(a + " - " + b + " = " + calculadora.substract(a, b));
        System.out.println(a + " * " + b + " = " + calculadora.multiply(a, b));
        System.out.println(a + " / " + b + " = " + calculadora.divide(a, b));
    }

    public static void pruebasCalculadoraMCAC() {
        double a = 86;
        double b = 42;
        CalculadoraMCAC calculadora = new CalculadoraMCAC();

        System.out.println(calculadora.about());

        System.out.println(a + " + " + b + " = " + calculadora.add(a, b));

        System.out.println(a + " - " + b + " = " + calculadora.substract(a, b));

        System.out.println(a + " * " + b + " = " + calculadora.multiply(a, b));
    }

    public static void pruebasCalculadoraJTNG() {
        double a = 64;
        double b = 28;
        CalculadoraJTNG calculadora = new CalculadoraJTNG();
        System.out.println(calculadora.about());
        System.out.println(a + " + " + b + " = " + calculadora.add(a, b));
        System.out.println(a + " - " + b + " = " + calculadora.substract(a, b));
        System.out.println(a + " * " + b + " = " + calculadora.multiply(a, b));
        System.out.println(a + " / " + b + " = " + calculadora.divide(a, b));
    }
}
