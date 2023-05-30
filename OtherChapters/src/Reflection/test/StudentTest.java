package Reflection.test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void testDisplayStudentName() {
        Student student = new Student();
        String studentName = student.displayStudentName("joy", "peter");
        assertEquals("joypeter", studentName);
    }
}
