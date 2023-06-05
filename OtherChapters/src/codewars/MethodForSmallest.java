package codewars;

public class MethodForSmallest {
    int getSmallest(int a, int b, int c) {
        int min = 0;
        if(a <= b && a <= c){
            min =a;
        }
        else if (b<= a && b <=c) {
            min = b;
        }
        else {
            min = c;
        }
        return min;
    }
}
