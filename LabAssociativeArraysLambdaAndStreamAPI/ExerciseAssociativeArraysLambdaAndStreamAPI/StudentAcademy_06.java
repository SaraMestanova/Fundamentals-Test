package ExerciseAssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class StudentAcademy_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> grades = new LinkedHashMap<>();

        for (int i = 0; i < number; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if (grades.containsKey(studentName)) {
                grades.get(studentName).add(grade);
            } else {
                grades.put(studentName, new ArrayList<>());
                grades.get(studentName).add(grade);
            }

        }
        for (Map.Entry<String, List<Double>> entry : grades.entrySet()) {

            String studentName = entry.getKey();
            List<Double> grade = entry.getValue();

            double sum = grade.stream().mapToDouble(Double::doubleValue).sum();

            double averageGrade = sum / grade.size();
            if (averageGrade >= 4.50) {
                System.out.printf("%s -> %.2f%n", studentName, averageGrade);
            }
        }

    }
}
