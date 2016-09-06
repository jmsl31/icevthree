package core;

public class SquareRootMachine implements ICalculationMachine {

    @Override
    public double calculate(double a, double b) throws DivisonByZeroException {
        return Math.sqrt(a);
    }

}
