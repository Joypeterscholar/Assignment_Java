
package SnackList;

public class SnackList<list> {
    int[] myArr;
    int[] newArr;


    public void setVal(int[] myArr) {
        this.myArr = myArr;
    }

    public void add(int index, int element) {
        newArr = new int[myArr.length + 1];
        for (int i = 0; i < myArr.length; i++) {
            newArr[i] = myArr[i];
        }
        newArr[index] = element;
    }

    public int[] getArr() {
        return newArr;
    }

    public int size() {
        return myArr.length;
    }

    public void remove() {

    }

    }


