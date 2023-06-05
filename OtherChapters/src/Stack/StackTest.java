package Stack;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTest {
    @Test
    public void stackExist(){
        Stack stack = new Stack(5);
        Assert.assertNotNull(stack);
    }
    @Test
    public void newStackIsEmpty(){
        Stack stack = new Stack(5);
        Assert.assertTrue(stack.isEmpty());
    }
    @Test
    public void pushStackShouldNotBeEmpty(){
        Stack stack =  new Stack(5);
        stack.push("G-String");
        Assert.assertFalse(stack.isEmpty());
    }
    @Test
    public void popStackShouldBeEmpty(){
        Stack stack = new Stack(5);
        stack.push("h-string");
        stack.pop();
        Assert.assertTrue(stack.isEmpty());
    }
    @Test
    public void pushAndPopStackShouldNotBeEmpty(){
        Stack stack = new Stack(5);
        stack.push("G-string");
        stack.push("h-string");
        stack.pop();
       Assert.assertFalse(stack.isEmpty());
    }
    @Test
    public void pushElement1AndReturnElement1WhenPopped(){
        Stack stack = new Stack(5);
        stack.push("D-string");
       String actual = stack.pop();
       assertEquals("D-string", actual);
    }
    @Test
    public void pushElement123AndReturn3WhenPopped(){
        Stack stack = new Stack(5);
        stack.push("G-string");
        stack.push("h-string");
        stack.push("D-string");
        String actual = stack.pop();
        assertEquals("D-string", actual);
    }
    @Test
    public void pushElement123AndReturnElement2WhenPoppedTwice(){
        Stack stack = new Stack(5);
        stack.push("G-string");
        stack.push("h-string");
        stack.push("D-string");
        stack.pop();
        String actual =                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   stack.pop();
        assertEquals("h-string", actual);
    }
@Test
    public void peakElement(){
    Stack stack = new Stack(5);
    stack.push("G-string");
    stack.push("h-string");
    stack.push("D-string");
    stack.peak();
    assertEquals("G-string", stack.peak());
}
@Test
    public void stackIsFull(){
    Stack stack = new Stack(5);
    stack.push("G-string");
    stack.push("h-string");
    stack.push("D-string");
    stack.push("m-string");
    stack.push("b-string");
    Assert.assertTrue(stack.isFull());
}
}
