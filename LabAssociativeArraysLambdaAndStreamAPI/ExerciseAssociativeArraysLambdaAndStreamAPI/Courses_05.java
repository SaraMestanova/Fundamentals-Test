package ExerciseAssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class Courses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, List<String>> courses = new LinkedHashMap<>();
        while (!input.equals("end")) {
            String courseName = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];

            if (!courses.containsKey(courseName)){
                courses.put(courseName, new ArrayList<>());
            }
            courses.get(courseName).add(studentName);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : courses.entrySet()) {
            String courseName = entry.getKey();
            List<String> studentNames = entry.getValue();

            System.out.printf("%s: %d\n", courseName, studentNames.size());
            studentNames.forEach(name -> System.out.printf("-- %s\n", name));
        }
    }
}
