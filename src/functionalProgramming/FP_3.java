package functionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FP_3 {
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
        int result = 0;
        for (int e : values) {
            if(e > 3 && e % 2 ==0){
                result = e *2;
                break;
            }
        }
        System.out.println(result);

//        System.out.println(values.stream()
//                .filter(e -> e >3)
//                .filter(e -> e % 2 ==0)
//                .map(e  -> e*2)
//                .findFirst());
//                //.get()); // if i remove this i will get an Optional 8

//        System.out.println(values.stream()
//                .filter(FP_3::isGreaterThan3) // method referencing
//                .filter(FP_3::isEven)
//                .map(FP_3::doubleIt)
//                .findFirst();

        // Note : filter and map are called as intermediate operations
        // and Note : methods like findfirst() reduce() collect() are called terminal operations
        // make a special note that ->> if untill we place the findfirstmethod it will not work or run as the traditional forloop
        // example
         final Stream<Integer> temp=   values.stream()
                .filter(FP_3::isGreaterThan3) // method referencing
                .filter(FP_3::isEven)
                .map(FP_3::doubleIt); // these will not work untill the terminal operations trigger it and says findsfirst for an example.
        System.out.println(temp.findFirst()); // untill this method is call the the above temp will be lazy to run
    }
}
