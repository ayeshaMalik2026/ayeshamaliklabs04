/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labs4;

/**
 *
 * @author ayesh
 */


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentDirectory {

    private final Map<Integer, String> students = new HashMap<>();

    public void addStudent(int id, String name) {
        students.put(id, name);
    }

    public Set<Integer> getAllIDs() {
        return Collections.unmodifiableSet(students.keySet());
    }

    public static void main(String[] args) {
        StudentDirectory directory = new StudentDirectory();
        directory.addStudent(101, "Alice");
        directory.addStudent(102, "Bob");

        Set<Integer> ids = directory.getAllIDs();
        System.out.println("Student IDs: " + ids);

        try {
            ids.add(103);
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught expected exception: Modification to returned ID set is prohibited.");
        }
    }
}

