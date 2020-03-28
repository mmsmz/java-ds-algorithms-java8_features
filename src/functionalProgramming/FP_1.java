package functionalProgramming;

import java.util.stream.IntStream;

public class FP_1 {
    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
    }

    private static boolean isPrime(final int number) {
        // imperative - saying how
        // mutability
   /*     for (int i = 2; i < number; i++) {
            if (number % i == 0) return false; // this code will not work for 1 and 2
            // 4 > 2 = false
        }
        return number > 1;
        // 1 > 2 = false
        // 2 > 2 = true
        // 3 > 2 = true*/

        // funcational style is "Declarative"
        // we are saying what to do
        // immutability
            return number > 1 &&
                    IntStream.range(2, number)
                    .noneMatch(index -> number % index ==0);
    }
}
