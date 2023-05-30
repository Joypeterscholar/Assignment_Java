    import java.util.Arrays;
    public class Sstring{
        public static int[] slice(int[] array, int startIndex, int endIndex)
        {
            int[] slicedArray = Arrays.copyOfRange(array, startIndex, endIndex);
            return slicedArray;
        }
        public static void main(String args[])
        {
            int[] array = {11, 23, 56, 90, 111, 901, 251, 800, 843};
            int startIndex = 2, endIndex = 6;
            int[] sliceArray = slice(array, startIndex, endIndex + 1);
            System.out.println("Slice of Array: "+Arrays.toString(sliceArray));
        }
    }
