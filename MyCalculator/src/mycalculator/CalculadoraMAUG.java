package mycalculator;

/**
 *
 * @author Miguel Uribe
 */
public class CalculadoraMAUG implements ICalculator{
    
    @Override
    public double multiply(double a, double b)
    {
        return a * b;
    }
    
    @Override
    public double divide(double a, double b)
    {
        if(b == 0 )
        {
            return 0;
        }
        
        return a / b ;
    }
    
    @Override
    public double substract(double a, double b)
    {
        return a - b;
    }
    
    @Override
    public double add(double a, double b)
    {
        return a + b;
    }

    
    @Override
    public String about()
    {
        return "Calculator implementend by" + Authors.MAUG;
    }

        
	
	
}
