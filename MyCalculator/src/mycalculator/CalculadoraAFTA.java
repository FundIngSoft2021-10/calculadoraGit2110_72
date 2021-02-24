/**
 * @author Andres Felipe Torres Aldana
 */

package mycalculator;

public class CalculadoraAFTA implements ICalculator{

	@Override
	public double add(double a, double b) {
		return b+a;
	}

	@Override
	public double multiply(double a, double b) {
		return b*a;
	}

	@Override
	public double divide(double a, double b) {		
		return a/b;
	}

	@Override
	public double substract(double a, double b) {		
		return a-b;
	}

	@Override
	public String about() {
		return "Calculator implementend by " + Authors.AFTA;
	}

}
