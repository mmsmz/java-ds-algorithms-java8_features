package functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PF_6 {
    // we can use a Predicate instead of a Selector
    public static int totalvalues(List<Integer> number, Predicate<Integer> selector){
//        int result = 0;
//        for (int e : number){
//            if(selector.test(e)) result +=e; // now this will be a test function
//        }
//        return result;
        // Note : we can further reduce the code from the above code
        return number.stream()
                .filter(selector)
                .reduce(0, Math::addExact);
    }
    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(1,2,3,5,4,6,7,8,9,10);
        System.out.println(totalvalues(values, e->true));
        System.out.println(totalvalues(values, e-> e % 2 ==0));


        // Note : we get the mixing of object composition + function composition
    }
}
