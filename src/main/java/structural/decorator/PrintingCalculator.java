package structural.decorator;

public class PrintingCalculator extends CalculatorDecorator {
    public PrintingCalculator(Calculator calculator) {
        super(calculator);
    }

    @Override
    public int add(int number1, int number2) {
        int result =  calculator.add(number1,number2);
        System.out.println(number1 + " + " + number2 + " = " + result);
        return result;
    }
}
