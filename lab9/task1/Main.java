package ru.mirea.lab9.task1;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student(101, "Саша"),
                new Student(103, "Паша"),
                new Student(105, "Маша"),
                new Student(102, "Даша"),
                new Student(104, "Лёха")
        };

        System.out.println("Initial array:");
        for (Student student : students) {
            System.out.println(student);
        }

        insertionSort(students);

        System.out.println("\nSorted array:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static <T extends Comparable<T>> void insertionSort(T[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            T current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].compareTo(current) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }
}