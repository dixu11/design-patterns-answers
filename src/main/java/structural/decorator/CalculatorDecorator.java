package structural.decorator;

public abstract class CalculatorDecorator implements Calculator {

     Calculator calculator;

    public CalculatorDecorator(Calculator calculator) {
        this.calculator = calculator;
    }


}
