package Arry;

import java.util.Arrays;

public class Arry{

    public int [] doubleArray(int[] ary){
        int[] arr2 = new int[ary.length * 2];
        for (int index = 0; index < ary.length; index++){
            arr2[index] = ary[index];
        }
        return arr2;
    }

    public static void main(String[] args) {
        Arry ary = new Arry();
        int [] num = {3,4,5,6};
        System.out.println(Arrays.toString(ary.doubleArray(num)));

    }

}