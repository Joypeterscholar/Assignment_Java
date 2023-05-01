import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.jupiter.api.BeforeEach;

public class StudentTest {
    @Test
    public void testDisplayStudentName() {
        Student student = new Student();
        String studentName = student.displayStudentName("joy", "peter");
        assertEquals("joypeter", studentName);
    }
}
