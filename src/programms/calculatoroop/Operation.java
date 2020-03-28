package programms.calculatoroop;

@FunctionalInterface
public interface Operation {
    double calculateResult(double left, double right);
}