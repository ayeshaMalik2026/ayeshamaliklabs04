/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labs4;

/**
 *
 * @author ayesh
 */


import java.util.HashMap;
import java.util.Map;

public class TreasureMap {

    public static void main(String[] args) {
        Map<String, Double> treasures = new HashMap<>();
        treasures.put("beach", 25.0);
        treasures.put("palm", 50.0);
        treasures.put("cove", 75.0);

        treasures.put("palm", treasures.get("palm") + treasures.size());

        double totalSum = 0.0;
        for (Double value : treasures.values()) {
            totalSum += value;
        }

        System.out.println("Updated map: " + treasures);
        System.out.println("Total treasure sum: " + totalSum);
    }
}

