package codeworsePractice;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

public class HW1 {

    static int a = 1;

    public static void Task() {

        System.out.println("******************** " + "Task # " + a + " ********************");
        a++;
    }
    public static int grow(int[] x) {
        int output = 1;
        for(int i = 0; i < x.length; i++) {
            output *= x[i];
        }
        return output;
    }

    public static boolean checkForFactor(int base, int factor) {
        if(base % factor == 0) {
            return true;
        }
        return false;
    }

    public static String maskify(String str) {
        //throw new UnsupportedOperationException("Unimplemented");
        if(str.length() <= 4) return str;
        String result = "";
        for (int i = 0; i < str.length()-4; i++) {
            result += "#";
        }
        return result + str.substring(str.length()-4);
    }









    public static void main(String[] args) {

        Task();

        int[] x = new int[]{1,2,3};
        System.out.println(grow(x));

        int[] y = new int[]{4,1,1,1,4};
        System.out.println(grow(y));

        int[] z = new int[]{2,2,2,2,2,2};
        System.out.println(grow(z));

        Task();
        //checkForFactor(10, 2);
        System.out.println(checkForFactor(10, 2));
        System.out.println(checkForFactor(63, 7));
        System.out.println(checkForFactor(2450, 5));
        System.out.println(checkForFactor(24612, 3));

        Task();
        System.out.println(maskify("4556364607935616"));
        System.out.println(maskify(     "64607935616"));
        System.out.println(maskify(               "1"));
        System.out.println(maskify(                ""));

        Task();


    }


}


