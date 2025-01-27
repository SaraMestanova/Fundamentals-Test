package LabLists;

import java.util.*;
import java.util.stream.Collectors;

public class ListOfProducts_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();

        for (int i = 0; i < numbers; i++) {
            String productName = scanner.nextLine();
            products.add(productName);
        }
        Collections.sort(products);
        int number = 1;
        for (String product : products) {
            System.out.println(number + "." + product);
            number++;
        }
    }
}
