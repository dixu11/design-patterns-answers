package structural.decorator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class SavingCalculator extends CalculatorDecorator {
    public SavingCalculator(Calculator calculator) {
        super(calculator);
    }

    @Override
    public int add(int number1, int number2) {
        int result =  calculator.add(number1,number2);
        try {
            PrintWriter printWriter = new PrintWriter( new FileOutputStream("results.txt",true));
            printWriter.print(result + ", ");
            printWriter.flush();
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }
}
