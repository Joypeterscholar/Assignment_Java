package LIsta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class ListaTest {
    private ArrayList<Integer> list;

        @BeforeEach
        public void setup() {
            list = new ArrayList<>();
        }

        @Test
        public void testAdd() {
            list.add(0, 1);
            list.add(1, 2);
            list.add(2, 3);

            assertEquals(Arrays.asList(1, 2, 3), list);
        }

        @Test
        public void testAddAll() {
            list.addAll(0, Arrays.asList(1, 2, 3));

            assertEquals(Arrays.asList(1, 2, 3), list);
        }

        @Test
        public void testSize() {
            list.add(1);
            list.add(2);
            assertEquals(2, list.size());
        }

        @Test
        public void testClear() {
            list.addAll(Arrays.asList(1, 2, 3));
            list.clear();

           assertEquals(0, list.size());
           assertTrue(list.isEmpty());
        }

        @Test
        public void testRemoveByIndex() {
            list.addAll(Arrays.asList(1, 2, 3));
            list.remove(1);

            Assertions.assertEquals(Arrays.asList(1, 3), list);
        }

        @Test
        public void testRemoveByElement() {
            list.addAll(Arrays.asList(1, 2, 3));
            list.remove(Integer.valueOf(2));

            assertEquals(Arrays.asList(1, 3), list);
        }

        @Test
        public void testGet() {
            list.addAll(Arrays.asList(1, 2, 3));

            Assertions.assertEquals(1, list.get(0));
            Assertions.assertEquals(2, list.get(1));
        }

        @Test
        public void testSet() {
            list.addAll(Arrays.asList(1, 2, 3));
            list.set(1, 4);

            assertEquals(Arrays.asList(1, 4, 3), list);
        }

        @Test
        public void testIndexOf() {
            list.addAll(Arrays.asList(1, 2, 3));

            assertEquals(1, list.indexOf(2));
        }

        @Test
        public void testLastIndexOf() {
            list.addAll(Arrays.asList(1, 2, 2, 3));

            assertEquals(2, list.lastIndexOf(2));
        }

        @Test
        public void testEquals() {
            list.addAll(Arrays.asList(1, 2, 3));
            assertFalse(list.equals(4));
        }

        @Test
        public void testHashCode() {
            list.addAll(Arrays.asList(1, 2, 3));

            assertEquals(Arrays.asList(1, 2, 3).hashCode(), list.hashCode());
        }

        @Test
        public void testIsEmpty() {
            list.add(1);
            assertFalse(list.isEmpty());
        }

        @Test
        public void testContains() {
            list.addAll(Arrays.asList(1, 2, 3));
            assertTrue(list.contains(2));
        }

        @Test
        public void testContainsAll() {
            list.addAll(Arrays.asList(1, 2, 3));
            assertTrue(list.containsAll(Arrays.asList(1, 2)));
        }
    }
