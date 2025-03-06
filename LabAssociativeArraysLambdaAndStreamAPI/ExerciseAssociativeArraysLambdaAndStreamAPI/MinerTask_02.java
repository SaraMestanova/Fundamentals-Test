package ExerciseAssociativeArraysLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine();
        Map<String, Integer> resourceMap = new LinkedHashMap<>();
         while (!resource.equals("stop")) {
             int quantity = Integer.parseInt(scanner.nextLine());

             if (resourceMap.containsKey(resource)) {
                 int existingQuantity = resourceMap.get(resource);
                 resourceMap.put(resource, existingQuantity + quantity);
             }else {
                 resourceMap.put(resource, quantity);
             }
             resource = scanner.nextLine();
         }

         resourceMap.entrySet().forEach(entry -> System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue()));
    }
}
