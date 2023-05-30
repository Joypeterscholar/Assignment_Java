public class TwoDArray {
    public static void main(String[] args) {
        String b[][] = {{"3", "5", "9"}, {"2", "6", "7", "6"}, {"15"}};
        System.out.println("the length of the first array is " + b[0].length);
        System.out.println("the length of the last array is " + b[2].length);

        int sum = 0;
        for (String[] i : b) {
            sum += b[0].length;
        }
        System.out.println(sum);

        int x[][] = {{3, 5, 9}, {2, 6, 7, 6}, {15}};
        System.out.println("the length of the first array is " + x[0].length);
        System.out.println("the length of the first array is " + x[2].length);
        for (int h = 0; h < x.length; h++) {
            for (int i = 0; i < x[h].length; i++) {
                System.out.print(x[h]  [i]);
            }
        }
        System.out.println();
        for(int[] j : x){
            for(int k : j){
                System.out.print(k);
            }
        }
    }
}

