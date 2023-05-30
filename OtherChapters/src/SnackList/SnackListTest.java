package SnackList;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SnackListTest {
    SnackList  list = new SnackList <>();
@Test
    public void addElementTest(){
    list.setVal(new int[]{1, 2, 3});

    list.add(3, 10);
    int[] expected = {1, 2, 3, 10};
    System.out.println(Arrays.toString(list.getArr()));
    assertArrayEquals(expected, list.getArr());
}
@Test
public void addSize(){
    list.setVal(new int[] {1, 2, 3});
  assertEquals(3, list.size());

}

@Test
    public void removeElement(){
    list.setVal(new int[]{1, 2, 3});
    list.remove();
    int [] expected = {1,2,3,4};
}
}
