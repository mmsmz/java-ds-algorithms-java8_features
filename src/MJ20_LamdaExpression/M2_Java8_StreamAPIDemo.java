package MJ20_LamdaExpression;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class M2_Java8_StreamAPIDemo {
    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);
                      // we can also create an object using Arrays.asList()

//        for (int i = 0; i < 6; i++) {
//            System.out.println(values.get(0));
//        } instead of using this !!
//
        //  we can use enhance for loop or use Iterator
         // why iterator? ** iterator is used to update, print and also can do modification
//        Iterator<Integer> i = values.iterator();
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }

        // 3. we can use enhance /// ** why enhanced forloop ? if you want to print all the values use enhanced for loop
//        for (int i : values){
//            System.out.println(i);
//        }

        // these loops are called External Iteration -- some for loop can fetch data from the object, they can fetch value from the outside

        // Internal Iteration -- what if you have method where youcan implement and this called as internal iterations.
            //and we can achieve with the help of Stream API.







    }
}
