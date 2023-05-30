import java.util.Arrays;

public class CopyArray2 {
    public static void main(String[] args) {
        int account[] = {10, 20, 30, 40};
        int deposit[] = new int[4];
        for (int i = 0; i < account.length; i++) {
            deposit[i] = account[i];   // copying array
        }
            System.out.println(Arrays.toString(deposit)); //Converting arrays to string
        }
    }
