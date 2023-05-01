public class Array4 {
    public static void main(String[] args) {
        int [] numbers = {3,4,5,6,7,8,9};
    int lengthOfNo = numbers.length;
    int sum = 0;
    double average;
    for (int number : numbers){
        sum+=number;
    }
    average = (double)sum / (double) lengthOfNo;
        System.out.println(average);
    }
}