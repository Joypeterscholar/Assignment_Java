public class Stuff {
//  private static int num1;
//    private static int num2;
//    private static int num3;
//    public  static int getMaximumNumber(){
//        return Math.max(num1, Math.max(num2, num3));
//    }
//
//    public  static int getMinimumNumber(){
//        return Math.min(num1, Math.min(num2, num3));
//    }
//    public static void main(String[] args) {
//num1 = 5;
//num2 = 7;
//num3 = 10;
//        System.out.println(Stuff.getMaximumNumber());
//        System.out.println(Stuff.getMinimumNumber());

 //   }
    public static int getMaxNumber(int num1, int num2, int num3){
        return Math.max(num1, Math.max(num2, num3));
    }
    public static int getMinNumber(int num1, int num2, int num3){
        return Math.min(num1, Math.min(num2, num3));
    }

    public static void main(String[] args) {
        int result = getMaxNumber(5,10,15);
        System.out.println(result);
        int output = getMinNumber(5,10,15);
        System.out.println(output);
    }
}