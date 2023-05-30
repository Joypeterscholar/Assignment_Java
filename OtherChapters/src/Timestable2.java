public class Timestable2 {
    public static void main(String[] args) {
        for (int i = 1; i < 13; i++) {
            for (int j = 2; j < 24; j=j+2) {
                System.out.print("2 * " + i);
                System.out.print("=" + j);
                System.out.println();

            }
        }
    }
}