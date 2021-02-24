/**
 * @author Angie Tatiana Peña Peña
 */

package mycalculator;

public class CalculadoraATPP implements ICalculator{
  @Override
  public String about() {

      return "Calculator implementend by: " + Authors.ATTP;
  }

  @Override
  public double add (double a, double b){
    return a+b;
  }

  @Override
  public double substract (double a, double b){
    return a-b;
  }

  @Override
  public double divide (double a, double b){
    return a/b;
  }

  @Override
  public double multiply (double a, double b){
    return a*b;
  }

}
