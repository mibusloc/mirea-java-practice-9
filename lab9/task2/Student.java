package ru.mirea.lab9.task2;

public record Student(String name, double gpa) {

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}