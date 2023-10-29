package ru.mirea.lab9.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Саша", 3.8),
                new Student("Паша", 3.5),
                new Student("Маша", 4.0),
                new Student("Даша", 3.9),
                new Student("Костян", 3.7)
        };

        System.out.println("Unsorted array:");
        for (Student student : students) {
            System.out.println(student);
        }

        Arrays.sort(students, new SortingStudentsByGPA());

        System.out.println("\nSorted array:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
