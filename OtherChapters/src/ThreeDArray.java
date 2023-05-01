public class ThreeDArray {
    public static void main(String[] args) {
        int[][][] nice = {{{4, 5, 6, 7, 8}, {6, 5, 8, 3}}, {{6, 3, 2, 6, 8}, {6, 8, 3}, {6, 7}}};
        for (int[][] i : nice) {
            for (int[] j : i) {
                for (int k : j) {
                    System.out.print(k);
                }
            }
        }
    }
}
