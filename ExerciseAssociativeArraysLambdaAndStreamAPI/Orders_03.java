package ExerciseAssociativeArraysLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        Map <String, Integer> productQuantity = new LinkedHashMap<>();
        Map <String, Double> productPrice = new LinkedHashMap<>();

        while (!product.equals("buy")){
            String productName = product.split(" ")[0];
            double price = Double.parseDouble(product.split(" ")[1]);
            int quantity = Integer.parseInt(product.split(" ")[2]);
            if (productQuantity.containsKey(productName)) {
                productQuantity.put(productName, productQuantity.get(productName) + quantity);
            } else {
                productQuantity.put(productName, quantity);
            }
            productPrice.put(productName, price);

            product = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : productQuantity.entrySet()) {

            String productName = entry.getKey();
            int productsQuantity = entry.getValue();
            double productsPrice = productPrice.get(productName);
            System.out.printf("%s -> %.2f%n", productName, productsQuantity * productsPrice);
        }
    }
}
