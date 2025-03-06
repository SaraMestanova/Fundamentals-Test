package ExerciseAssociativeArraysLambdaAndStreamAPI;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materials = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);

        Map<String, Integer> junks = new LinkedHashMap<>();

        boolean isLegendaryItemBought = false;

        while(!isLegendaryItemBought){
            String input = scanner.nextLine();
            String[] inputData = input.split("\\s+");

            for (int i = 0; i <= inputData.length - 1; i += 2) {
                int quantity = Integer.parseInt(inputData[i]);
                String material = inputData[i + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")){
                    Integer existingMaterial = materials.get(material);
                    materials.put(material, existingMaterial + quantity);
                }else {
                    if (junks.containsKey(material)){
                        junks.put(material, junks.get(material) + quantity);
                    }else {
                        junks.put(material, quantity);
                    }

                }

                for (Map.Entry<String, Integer> entry : materials.entrySet()) {
                    if (entry.getValue() >= 250){
                        isLegendaryItemBought = true;
                        if (entry.getKey().equals("shards")){
                            System.out.println("Shadowmourne obtained!");
                        } else if (entry.getKey().equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        }else if (entry.getKey().equals("motes")){
                            System.out.println("Dragonwrath obtained!");
                        }
                        int newQuantity = entry.getValue() - 250;
                        materials.put(material, newQuantity);
                    }
                }
                if (isLegendaryItemBought) {
                    break;
                }
            }
        }

        materials.entrySet().forEach(entry -> System.out.printf("%s: %d\n", entry.getKey(), entry.getValue()));
        junks.entrySet().forEach(entry -> System.out.printf("%s: %d\n", entry.getKey(), entry.getValue()));

    }
}
