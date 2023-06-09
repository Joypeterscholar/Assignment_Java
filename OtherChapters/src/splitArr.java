import java.util.Arrays;

public class splitArr {
    public static void main(String[] args) {
        String x [] = {"10", "25", "43", "62", "12"};
        String  y [] = new String [10];
     y[0] = String.valueOf(x[0].charAt(0));
     y[1]  = String.valueOf(x[0].charAt(1));
     y[2] = String.valueOf(x[1].charAt(0));
     y[3] = String.valueOf(x[1].charAt(1));
        y[4] = String.valueOf(x[2].charAt(0));
        y[5] = String.valueOf(x[2].charAt(1));
        y[6] = String.valueOf(x[3].charAt(0));
        y[7] = String.valueOf(x[3].charAt(1));
        y[8] = String.valueOf(x[4].charAt(0));
        y[9] = String.valueOf(x[4].charAt(1));
        System.out.println(Arrays.toString(y));

    }

//    public void splitArr(String[] ar) {
//        String a [] = new String[5];
//        for (int )
//
//    }
}
