/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labs4;

/**
 *
 * @author ayesh
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zoo {

    private final List<String> animals;

    public Zoo() {
        animals = new ArrayList<>();
        animals.add("lion");
        animals.add("tiger");
        animals.add("bear");
    }

    public List<String> getAnimals() {
        return Collections.unmodifiableList(animals);
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        List<String> readonlyAnimals = zoo.getAnimals();

        try {
            readonlyAnimals.add("flamingo");
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught expected exception: Cannot modify read-only list.");
        }
    }
}

