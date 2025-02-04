package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstPlayerCards = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayerCards = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while (!firstPlayerCards.isEmpty() && !secondPlayerCards.isEmpty()){
            int firstPlayerFirstCard = firstPlayerCards.get(0);
            int secondPlayerFirstCard = secondPlayerCards.get(0);

            firstPlayerCards.remove(0);
            secondPlayerCards.remove(0);

            if (firstPlayerFirstCard > secondPlayerFirstCard){
                firstPlayerCards.add(firstPlayerFirstCard);
                firstPlayerCards.add(secondPlayerFirstCard);
            }else if(secondPlayerFirstCard > firstPlayerFirstCard) {
                secondPlayerCards.add(secondPlayerFirstCard);
                secondPlayerCards.add(firstPlayerFirstCard);
            }

        }
        if (!firstPlayerCards.isEmpty()){
            int sum = firstPlayerCards.stream().mapToInt(Integer::intValue).sum();
            System.out.printf("First player wins! Sum: %d%n", sum);
        }else {
            int sum = secondPlayerCards.stream().mapToInt(Integer::intValue).sum();
            System.out.printf("Second player wins! Sum: %d%n", sum);

        }
    }
}
