package Lyzs;
public class Lyzs {
    private int size = 0;
    private int lystSize;
    private int[] elements;

    public Lyzs() {
        this.elements = new int[10];
    }


    public int get(int index) {
        return elements[index];
    }

    public void add(int index, int element) {

        elements[index] = element;
        size++;
    }

    public Object size() {
        return size;
    }

    public int clear() {
     return 0;
    }

    public void remove(int index) {
        elements[size - 1] = 0;
            size--;

    }
}

