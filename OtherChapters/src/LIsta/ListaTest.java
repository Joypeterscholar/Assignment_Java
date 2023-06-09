package LIsta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class ListaTest {
    private Lista<Integer> myList;


    @BeforeEach
    public void setup() {
        myList = new Lista<>();
    }

    @Test
    public void testAdd() {
        myList.add(0, 1);
        myList.add(1, 2);
        myList.add(2, 3);

        assertEquals(Arrays.asList(1, 2, 3), myList);
    }

    @Test
    public void testAddAll() {
        myList.addAll(0, Arrays.asList(1, 2, 3));
        myList.addAll(1, Arrays.asList(1, 2, 3));
        myList.addAll(2, Arrays.asList(1, 2, 3));

        assertEquals(Arrays.asList(1, 1, 1, 2, 2, 2, 3, 3, 3), myList);
    }

    @Test
    public void testSize() {
        myList.add(0, 1);
        myList.add(1, 2);
        assertEquals(2, myList.size());
    }

    @Test
    public void testClear() {
        myList.addAll(0, Arrays.asList(1, 2, 3));
        myList.addAll(1, Arrays.asList(1, 2, 3));
        myList.addAll(2, Arrays.asList(1, 2, 3));
        assertEquals(9, myList.size());

    }

        @Test
        public void testRemoveByIndex() {
            myList.addAll(0,Arrays.asList(1, 2, 3));
            myList.remove(1);

            Assertions.assertEquals(Arrays.asList(1, 3), myList);
        }

        @Test
        public void testRemoveByElement() {
            myList.addAll(0,Arrays.asList(1, 2, 3));
            myList.remove(Integer.valueOf(2));

            assertEquals(Arrays.asList(1, 3), myList);
        }

        @Test
        public void testGet() {
            myList.addAll(0,Arrays.asList(1, 2, 3));

            Assertions.assertEquals(1, myList.get(0));
            Assertions.assertEquals(2, myList.get(1));
        }

        @Test
        public void testSet() {
            myList.addAll(0,Arrays.asList(1, 2, 3));
            myList.set(1, 4);

            assertEquals(Arrays.asList(1, 4, 3), myList);
        }

        @Test
        public void testIndexOf() {
            myList.addAll(0,Arrays.asList(1, 2, 3));

            assertEquals(1, myList.indexOf(2));
        }

        @Test
        public void testLastIndexOf() {
            myList.addAll(0,Arrays.asList(1, 2, 2, 3));

            assertEquals(2, myList.lastIndexOf(2));
        }

        @Test
        public void testEquals() {
            myList.addAll(0,Arrays.asList(1, 2, 3));
            assertFalse(myList.equals(4));
        }

        @Test
        public void testHashCode() {
            myList.addAll(0,Arrays.asList(1, 2, 3));

            assertEquals(Arrays.asList(1, 2, 3).hashCode(), myList.hashCode());
        }

        @Test
        public void testIsEmpty() {
            myList.add(0,0);
            assertFalse(myList.isEmpty());
        }

        @Test
        public void testContains() {
            myList.addAll(0,Arrays.asList(1, 2, 3));
            assertTrue(myList.contains(2));
        }

        @Test
        public void testContainsAll() {
            myList.addAll(0,Arrays.asList(1, 2, 3));
            assertTrue(myList.containsAll(Arrays.asList(1, 2)));
        }
    }
