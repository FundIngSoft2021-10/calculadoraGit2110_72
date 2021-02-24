/**
 * @author Angie Tatiana Peña Peña
 */

package mycalculator;

public class CalculadoraATPP implements ICalculator{
  public String about() {

      return "Calculator implementend by: " + Authors.ATTP;
  }

  public double suma (double a, double b){
    return a+b;
  }

  public double resta (double a, double b){
    return a-b;
  }

  public double division (double a, double b){
    return a/b;
  }

  public double multiplicación (double a, double b){
    return a*b;
  }

  public double potencia (double a, double b){
    return pow(a,b);
  }
}
