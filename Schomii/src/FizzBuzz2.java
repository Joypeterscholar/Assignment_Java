public class FizzBuzz {
    public static void main(String[] args) {
//        int i = 1;
//        while (i <= 100){
//            if (i % 3 == 0 && i % 5 == 0){
//                System.out.println("fizzBuzz");
//            }
//                else if (i % 5 == 0){
//                    System.out.println("buzz");
//                }
//                else if (i % 3 == 0){
//                    System.out.println("fizz");
//                }
//                else System.out.println(i);
//                    i++;
//                }

        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("fizzBuzz");
            }
                else if (i % 5 == 0){
                    System.out.println("buzz");
                }
                else if (i % 3 == 0){
                    System.out.println("fizz");
                }
                else System.out.println(i);

                }

        for (int i = 0; i <= 4; i++){
            for(int j = 0; j <= 4; j++){
                if (i == 0 || j == 0 || i == 4 || j == 4) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println("");
        }

        }
            }
