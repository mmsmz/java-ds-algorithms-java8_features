package calculatoroop2;

@FunctionalInterface
public interface Operation {
    double calculateResult(double left, double right);
}