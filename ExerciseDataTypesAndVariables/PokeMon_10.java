package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());// първоначалната енергия
        int m = Integer.parseInt(scanner.nextLine());// дистанцията между покемоните
        int y = Integer.parseInt(scanner.nextLine()); // фактор на изтощение
        int startPower = n;
        int pokedTargets = 0;


        while (n < m){
            n -= m;
            pokedTargets ++;
            if (n == startPower / 2 && y !=0){
                n = n / y;
            }

        }
        System.out.println(n);
        System.out.println(pokedTargets);

    }
}
