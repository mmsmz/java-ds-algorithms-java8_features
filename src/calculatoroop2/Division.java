package calculatoroop2;

public class Division  implements Operation {
    @Override
    public double calculateResult(double left, double right) {
        return left / right;
    }
}
