package programms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JPP5_MethodOverloading {
    int sum(int num1, int num2){
        return (num1+num2);
    }
}

class MethodCall{
    public static void main(String[] args) throws IOException {
        int x, y;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please, enter two Integers: ");
        x= Integer.parseInt(br.readLine());
        y= Integer.parseInt(br.readLine());

        JPP5_MethodOverloading ol = new JPP5_MethodOverloading();
        System.out.println("Result of two numbers are : " + ol.sum(x,y));
    }
}
