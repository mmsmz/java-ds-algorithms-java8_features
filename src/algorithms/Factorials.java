package algorithms;

public class Factorials {

    public static void main(String[] args) {
        int factorial = 1; // 5! -> 5 *4 *3 *2 *1 = 120
        int number = 5;
        for(int x=1; x<=number; x++){
           factorial = factorial*x;

        }
        System.out.println(factorial);
    }

}
