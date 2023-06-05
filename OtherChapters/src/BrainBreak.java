public class BrainBreak {
    static int max = 0;

    public static void setCount(int[] arr) {

        for (int index = 0; index < arr.length; index++) {
            int count = 0;
            for (int index2 = 0; index2 < arr.length; index2++) {
                if (arr[index2] == arr[index]) {
                    count++;
                }
            }
            if (count > max) {
                max = count;


            }
        }
    }

    public static int getCount() {
        return max;
    }

    public static void main(String[] args) {
        int [] arr = {4,5,6,7,8,8,8,2,3};
        setCount(arr);
        System.out.println(getCount());
    }
}

