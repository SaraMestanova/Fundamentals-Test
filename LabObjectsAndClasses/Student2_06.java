package LabObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student2_06 {

    static class Student {
        String firstName;
        String lastName;
        int age;
        String city;

        Student(String firstName, String lastName, int age, String city) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
        }

        String getLastName() {
            return this.lastName;
        }

        void setLastName(String lastName) {
            this.lastName = lastName;
        }

        String getFirstName() {
            return this.firstName;
        }

        void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        String getCity() {
            return this.city;
        }

        void setCity(String city) {
            this.city = city;
        }

        String getInfo() {
            return String.format("%s %s is %d years old", this.firstName, this.lastName, this.age);
        }
    }

    private static int studentIndex(List<Student> students, String firstName, String lastName) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] studentData = input.split("\\s+");
            String firstName = studentData[0];
            String lastName = studentData[1];
            int age = Integer.parseInt(studentData[2]);
            String city = studentData[3];

            int index = studentIndex(students, firstName, lastName);
            if (index < 0) {
                Student student = new Student(firstName, lastName, age, city);
                students.add(student);
            } else {
                Student student = new Student(firstName, lastName, age, city);
                students.set(index, student);
            }


            input = scanner.nextLine();
        }
        String city = scanner.nextLine();
        for (Student student : students) {
            if (student.getCity().equals(city)) {
                System.out.println(student.getInfo());
            }
        }


    }


}
