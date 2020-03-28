package functionalProgramming;

import jdk.nashorn.internal.runtime.ECMAException;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.function.Predicate;

public class PF_7 {
    // another example
    public static int doubleIt(int number ) {
        try{Thread.sleep(1000);} catch (Exception ex){ }
        return number * 2; // pure function means it takes the input and give the same output
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        // referential transparency

        System.out.println(
                // we can use a Stream lazy mode from parallelStream
                numbers.parallelStream() // use the parallel stream give sooner than 6 sec
                        .mapToInt(PF_7::doubleIt) // map is tranformation
                        // if mapToInt we can use the sum opertation instead of double operation
                        .sum());

        // Note we must go from a sequencial code to a concurrency code where we can
        // without expanding any effort


        // curry function

    }
}
