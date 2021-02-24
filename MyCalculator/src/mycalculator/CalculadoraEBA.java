package mycalculator;

public class CalculadoraEBA implements ICalculator{

	@Override
	public double add(double a, double b) {
		return a+b;
	}

	@Override
	public double multiply(double a, double b) {
		return a*b;
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
		// TODO Auto-generated method stub
		return "Calculator implementend by: " + Authors.EBA;
	}

}
