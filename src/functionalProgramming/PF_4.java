package functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PF_4 {
    public static boolean isGreaterThan3(int number){
        System.out.println("isGreaterThan3 " + number);
        return number > 3;
    }
    public static boolean isEven(int number){
        System.out.println("isEven " + number);
        return number % 2 ==0;
    }
    public static int doubleIt(int number){
        System.out.println("doubleIt " + number);
        return number *2;
    }
    public static void main(String[] args) {
        // find the double of the first even number greater than 3
        List<Integer> values = Arrays.asList(1,2,3,5,4,6,7,8,9,10);
                                 // given a number // and number is greater than 3
      //  Predicate<Integer> isGreaterThan3 = number -> number >3;
        Function<Integer, Predicate<Integer>> isGreaterThan = pivot ->
                                    number -> number > pivot;

         final Stream<Integer> temp=   values.stream()
                .filter(isGreaterThan.apply(4)) // e -> e >3 // isGreaterThan3
                .filter(PF_4::isEven)
                .map(PF_4::doubleIt);
        System.out.println(temp.findFirst());

        // if you want to change the filter condition without duplicating it use the Predicate class

        // e -> e >3 without duplicate code example if you isGreaterThan3 > 4 and isGreaterThan3 > 5 later on without duplication
        // therefore you dont have duplicate again this code >>> Predicate<Integer> isGreaterThan3 = number -> number >3;
        // use Function like it takes an Integer and returns a Predicate Integer >>
                //     Function<Integer, Predicate<Integer>> isGreaterThan = pivot ->
        //                                    number -> number > pivot;

    }
}
