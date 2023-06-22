import java.util.Arrays;

public class ThreeDArray {
    public static void main(String[] args) {
        int[][][] nice = new int[7][7][7];
        for (int[][] i : nice) {
            System.out.print(i.toString());
            System.out.println();
            for (int[] j : i) {
                System.out.print(Arrays.stream(j).toArray());
                System.out.println();
                for (int k : j) {
                    System.out.println();
                }
            }
        }
    }
}
