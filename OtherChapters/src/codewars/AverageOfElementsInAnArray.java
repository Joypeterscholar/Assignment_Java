package codewars;

import java.util.Arrays;

//Write a method, that gets an array of integer-numbers and return an array
// of the averages of each integer-number and his follower, if there is one.
public class AverageOfElementsInAnArray {


    public static int[] setArray(int [] num){
 int []  num2 = new int []{(num[0] + num[1])/2, (num[2] + num[3])/2,
                (num[4] + num[5])/2, (num[6] + num[7])/2, (num[8] + num[9])/2};
        return num2;
            }

    public static void main(String[] args) {
        int [] nume = {2,3,4,5,6,7,8,9,1,7};
        System.out.println(Arrays.toString(setArray(nume)));
    }
}
