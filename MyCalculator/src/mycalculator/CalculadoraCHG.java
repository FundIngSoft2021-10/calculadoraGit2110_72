package mycalculator;

public class CalculadoraCHG implements ICalculator {
    @Override
    public String about() {

        return "Calculator implementend by: " + Authors.CHG;
    }

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }
    
    @Override
    public double divide(double a, double b) {
        return a/b;
    }

    @Override
    public double substract(double a, double b) {
        return a - b;
    }
}