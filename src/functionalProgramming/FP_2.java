package functionalProgramming;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FP_2 {
    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
    }

    private static boolean isPrime(final int number) {
        // Predicate
        Predicate<Integer> isDivisiable = divisor -> number % divisor == 0;
        return number > 1 &&
                IntStream.range(2, number)
                        .noneMatch(index -> number % index == 0);
            //.noneMatch(index -> isDivisiable(index));
    }
}
