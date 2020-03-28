package functionalProgramming;

import java.awt.image.AreaAveragingScaleFilter;
import java.nio.channels.Selector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

interface Selector{
    public boolean pick(int value);
}

//class EvenSelector implements  Selector {
//    @Override
//    public boolean pick(final int value) {
//        return values % 2 ==0;
//    }
//} // this called the ceremony how to do but we must tell the code what to do
public class PF_5 {

//    public static int totalvalues(List<Integer> number){
//        int result = 0;
//        for (int e : number){
//            result  +=e;
//        }
//        return result;
//    }

    public static int totalvalues(List<Integer> number, Selector selector){
        int result = 0;
        for (int e : number){
            if(selector.pick(e)) result +=e;
        }
        return result;
    }
    public static void main(String[] args) {
        // compistion of function we were doing earlier,
        // we have a class and which talk to the database and how the  dependency injection and which changes in the injection
        // how do we approach that in the functional way
        //   dependency injection  is the strategy pattern
        // example how   dependency injection works in different example.

        List<Integer> values = Arrays.asList(1,2,3,5,4,6,7,8,9,10);
        ///System.out.println(totalvalues(values)); // what is you want to pass a selected values, you need to create a Selector Interface
        // and implement the Selector int

        // further more we dont need to create that Selector interface we can use the predicate
        System.out.println(totalvalues(values, e->true)); // rather creating a class we are use , even without using the selector itself we can use the predicate

    }
}
