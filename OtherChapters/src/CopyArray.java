public class CopyArray {
    public static void main(String[] args) {
        int[] name = {2, 3, 4, 5, 7};
        int[] subname = name; //copying array
       // name[1] = 8; dsadvantage of this is wen a new value has been assigned to any old value, change is implemented in both name and subname
        for (int i : subname) {
            System.out.print(i + ", ");
        }
    }
}
