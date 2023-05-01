import com.sun.jdi.IntegerValue;

import java.util.Objects;
import java.util.Scanner;

public class Palindrome {
    private static int num;
    private static int nums;

    public static void setPalindrome(int num) {
        nums = num;
    }
    public static int getPalindrome(){
        int x = 1;
            while (x > 0){
                nums =num/x % 10;
                x = x *10;
            }
          return nums;
    }
}
