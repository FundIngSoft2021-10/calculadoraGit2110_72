package mycalculator;

public class CalculatorJACS implements ICalculator{

	@Override
	public double add(double a, double b) {
		return Double.sum(a, b);
	}
	
	@Override
	public double substract(double a, double b) {
		return add(a,-1 * b);
	}

	@Override
	public double multiply(double a, double b) {
		return a * b;
	}

	@Override
	public double divide(double a, double b) throws ArithmeticException {
		if(b != 0)
			return (a / b);
		throw new ArithmeticException("Division por Cero");
	}

	@Override
	public String about() {
		return "Calculator implemented by" + Authors.JACS;
	}
}
