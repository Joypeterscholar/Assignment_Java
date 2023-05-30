package Arry;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArryTest {
Arry arraay = new Arry();
@Test
 public void DoubleArrExist(){
 int [] number = {1,2,3};
 int [] expected = new int[]{1, 2, 3, 0, 0, 0};
 assertArrayEquals( expected, arraay.doubleArray(number));

}
}
