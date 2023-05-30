package Stack;

public class Stack {
    private int counter;
    private String [] elements;
    boolean isEmpty;
    public Stack(int sizeOfStack) {
        elements = new String[sizeOfStack];

    }

    public boolean isEmpty() {
        if (counter == 0) return true;
        return false;
    }

    public void push(String element) {
        elements[counter] = element;
       counter++;
    }

    public String pop() {
        counter--;
        return elements[counter];
    }

    public String peak() {
        return elements[0];
    }

    public boolean isFull() {
        if (counter == elements.length) return true;
        return false;

    }
}
