import com.sun.media.sound.SF2GlobalRegion;

class SwapFirst {
    int num1, num2, a, b;

    public SwapFirst(int a, int b) {
        num1 = a;
        num2 = b;
    }
}

class SwapSecond {
    void swap(SwapFirst s) {
        int output = s.num1;
        s.num1 = s.num2;
        s.num2 = output;
    }
}

public class JPP4_SwapValues {
    //  callref
    public static void main(String[] args) {
        SwapFirst sF = new SwapFirst(20,10);
        System.out.println("Before Swapping: " + sF.num1 + "/t" + sF.num2);
        SwapSecond sS = new SwapSecond();
        sS.swap(sF);
        System.out.println("After Swapping: " + sF.num1 + "/t" + sF.num2);
    }
}
