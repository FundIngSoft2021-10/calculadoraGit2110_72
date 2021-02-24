/***
 * 
 * 
 * @author Santiago Vasquez Sanchez
 */

package mycalculator;

public class CalculadoraSVS implements ICalculator{

	@Override
	public String about() {
		return "Calculator implementend by " + Authors.SVS;
	}
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

	

}
