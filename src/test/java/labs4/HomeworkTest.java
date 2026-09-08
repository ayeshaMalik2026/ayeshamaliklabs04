package labs4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

public class HomeworkTest {

    @Test
    public void testStudentDirectoryUnmodifiableSet() {
        StudentDirectory directory = new StudentDirectory();
        directory.addStudent(101, "Alice");
        directory.addStudent(102, "Bob");

        Set<Integer> ids = directory.getAllIDs();
        assertEquals(2, ids.size());
        assertTrue(ids.contains(101));

        assertThrows(UnsupportedOperationException.class, () -> {
            ids.add(103);
        });
    }

    @Test
    public void testPointImmutability() {
        Point p = new Point(10, 20);
        assertEquals(10, p.getX());
        assertEquals(20, p.getY());
    }
}