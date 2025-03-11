package ExerciseObjectsAndClasses.OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            String personInfo = scanner.nextLine();
            String personName = personInfo.split("\\s+")[0];
            int personAge = Integer.parseInt(personInfo.split("\\s+")[1]);

            Person person = new Person(personName, personAge);

            if (personAge > 30) {
                people.add(person);
            }
        }

        for (Person person : people) {
            System.out.printf("%s - %d\n", person.getName(), person.getAge());
        }
    }
}
