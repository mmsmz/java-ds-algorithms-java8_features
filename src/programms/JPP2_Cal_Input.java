package programms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JPP2_Cal_Input {
    public static void main(String[] args) throws IOException {
        // User Inputs
        int num1, num2, output;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number 1: ");
        num1 = Integer.parseInt(br.readLine());
        System.out.println("Enter a number 2: ");
        num2 = Integer.parseInt(br.readLine());
        output = num1 + num2;
        System.out.println("result is " + output);
    }
}
