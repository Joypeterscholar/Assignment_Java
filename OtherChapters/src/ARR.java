public class ARR {
        public static int getOccurence(int[] arr) {
            int size = 0;
            for (int index = 0; index < arr.length; index++) {
                int count = 0;

                for (int index2 = 0; index2 < arr.length; index2++) {
                    if (arr[index2] == arr[index]) {
                        count++;
                    }
                }

                if (count > size) {
                    size = count;
                    int highestNumber = arr[index];
                }
            }

            return size;
        }

        public static void main(String[] args) {
            getOccurence(new int[]{1,3, 4, 7, 3, 2, 5, 5,});
        }
    }
