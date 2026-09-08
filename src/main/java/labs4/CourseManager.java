/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labs4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ayesh
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class CourseManager {
   public static void removeCoursesUnsafe(List<String> subjects) {
        for (String subject : subjects) {
            if (subject.startsWith("6.")) {
                subjects.remove(subject);
            }
        }
    }
public static void removeCoursesSafe(List<String> subjects) {
        Iterator<String> iter = subjects.iterator();
        while (iter.hasNext()) {
            if (iter.next().startsWith("6.")) {
                iter.remove();
            }
        }
    }
public static void main(String[] args) {
        List<String> subjects = new ArrayList<>(Arrays.asList("6.045", "6.005", "8.03", "6.813", "14.03"));

        // Unsafe method execution (uncommenting causes ConcurrentModificationException):
        // removeCoursesUnsafe(subjects);

        removeCoursesSafe(subjects);
        System.out.println("Remaining subjects: " + subjects);
    }
}

