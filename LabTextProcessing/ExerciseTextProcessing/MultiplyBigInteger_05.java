package ExerciseTextProcessing;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigInteger_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger first = new BigInteger(scanner.nextLine());
        BigInteger second = new BigInteger(scanner.nextLine());

        BigInteger result = first.multiply(second);
        System.out.println(result);
    }
}
