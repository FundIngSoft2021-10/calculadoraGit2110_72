/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycalculator;

/**
 *
 * @author Santiago Fernández
 */
public class CalculadoraSFB implements ICalculator{
    
    @Override
    public String about(){
        return "Calculator implementend by: " + Authors.SFB;
    }
    
    @Override
    public double add(double a, double b){
        return a + b;
    }
    
    @Override
    public double multiply(double a, double b){
        return a * b;
    }
    
    @Override
    public double divide(double a, double b){
        return a / b;
    }
    
    @Override
    public double substract(double a, double b){
        return a - b;
    }
    
}
