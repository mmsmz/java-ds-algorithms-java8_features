import java.io.PrintWriter;

public class JPP1_Writer {

    public static void main(String[] args) {
        // instead of using System.out.println we can use PrintWriter as shown below

        PrintWriter pw = new PrintWriter(System.out,true);

        String str = "project 2";
        pw.println("This is a " + str);
    }

}
