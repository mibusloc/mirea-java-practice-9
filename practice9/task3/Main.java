package ru.mirea.lab9.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Student> mergeSort(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).gpa() >= list2.get(j).gpa()) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Саша", 3.8));
        list1.add(new Student("Паша", 3.5));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Маша", 4.0));
        list2.add(new Student("Даша", 3.9));
        list2.add(new Student("Егор", 3.7));

        System.out.println("Unsorted array 1:");
        for (Student student : list1) {
            System.out.println(student);
        }

        System.out.println("\nUnsorted array 2:");
        for (Student student : list2) {
            System.out.println(student);
        }

        List<Student> mergedList = mergeSort(list1, list2);

        System.out.println("\nMerged and sorted array:");
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }
}
