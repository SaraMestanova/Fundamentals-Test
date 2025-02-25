package LabObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students_05 {

    static class Student {
        String firstName;
        String lastName;
        int age;
        String city;

        Student (String firstName, String lastName, int age, String city) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
        }

        String getCity (){
            return this.city;
        }

        void setCity (String city){
            this.city = city;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] studentData = input.split("\\s+");
            String firstName = studentData[0];
            String lastName = studentData[1];
            int age = Integer.parseInt(studentData[2]);
            String city = studentData[3];

            Student student = new Student(firstName, lastName, age, city);
            students.add(student);
            input = scanner.nextLine();
        }
        String city = scanner.nextLine();
        for (Student student : students) {
            if (student.getCity().equals(city)){
                System.out.printf("%s %s is %d years old%n", student.firstName, student.lastName, student.age);
            }
        }


    }
}
