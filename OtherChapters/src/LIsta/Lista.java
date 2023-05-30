package LIsta;
import java.util.Arrays;
import java.util.Collection;


public class Lista <list> {



        private int capacity = 10;
        private Object[] elements;
        private int size;

        public Lista() {
            elements = new Object[capacity];
            size = 0;
        }

        public void add(int index, list element) {
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException();
            }else {
                System.arraycopy(elements, index, elements, index + 1, size - index);
                elements[index] = element;
                size++;
            }
        }


        public void addAll(int index, Collection<list> collection) {
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException();
            } else {
                int collectionSize = collection.size();
                System.arraycopy(elements, index, elements, index + collectionSize, size - index);

                int i = index;
                for (list element : collection) {
                    elements[i] = element;
                    i++;
                }

                size += collectionSize;
            }
        }

        public int size() {
            return size;
        }

        public void clear() {
            Arrays.fill(elements, "");
            size = 0;
        }

        public void remove(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }else {
                System.arraycopy(elements, index + 1, elements, index, size - index - 1);
            }
            elements[size - 1] = "";
            size--;
        }


        public void remove(list element) {
            int index = indexOf(element);
            if (index != -1) {
                remove(index);
            }
        }

        public list get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }

            return (list) elements[index];
        }

        public void set(int index, list element) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }

            elements[index] = element;
        }

        public int indexOf(list element) {
            for (int i = 0; i < size; i++) {
                if (element.equals(elements[i])) {
                    return i;
                }
            }
            return -1;
        }


        public int lastIndexOf(list element) {
            for (int i = size - 1; i >= 0; i--) {
                if (element.equals(elements[i])) {
                    return i;
                }
            }
            return -1;
        }


        public boolean equals(Object element) {
            for (int i = 0; i < size; i++) {
                if (element.equals(elements[i])) {
                    return true;
                }
            }
            return true;
        }


        public int hashCode() {
            int hashCode = 1;
            for (int i = 0; i < size; i++) {
                Object obj = elements[i];
                if (obj == null) hashCode = 0;
                else hashCode = obj.hashCode();
            }
            return hashCode;
        }


        public boolean isEmpty() {
           if (size == 0)return true;
           return false;
        }

        public boolean contains(list element) {
            if (indexOf(element) != 1) return true;
            return false;
        }

        public boolean containsAll(Collection<list> collection) {
            for (list element : collection) {
                if (!contains(element)) {
                    return false;
                }
            }
            return true;
        }
    }
