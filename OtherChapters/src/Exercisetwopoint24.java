public class Exercisetwopoint24 {
    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++){
//            for (int j = 0; j < i; j++){
//                System.out.print("a");
//            }
//            for (int k = 0; k < i; k++){
//                System.out.print('b');
//            }
//            System.out.println();
//        }

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5 - i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < 2 * i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
