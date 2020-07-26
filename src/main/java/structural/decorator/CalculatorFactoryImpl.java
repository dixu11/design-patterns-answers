package structural.decorator;

public class CalculatorFactoryImpl implements CalculatorFactory {
    @Override
    public Calculator getStandardCalculator() {
        return new StandardCalculator();
    }

    @Override
    public Calculator getPrintingCalculator() {
        return new PrintingCalculator(new StandardCalculator());
    }

    @Override
    public Calculator getPrintingAndSavingCalculator() {
        return new PrintingCalculator(new SavingCalculator(new StandardCalculator()));
    }

    @Override
    public Calculator getSavingCalculator() {
        return new SavingCalculator(new StandardCalculator());
    }

    @Override
    public Calculator getSpammingCalculator(int timesSpamming) {
        Calculator spammer = new StandardCalculator();
        for (int i = 0; i < 1000; i++) {
            spammer = new PrintingCalculator(spammer);
        }
        return spammer;
    }
}
