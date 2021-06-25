package com.kodilla.patterns2.observer.homework;

public class Teacher implements HomeworkObserver{

    private final String name;
    private int updateCount;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(HomeworkDeque homeworkDeque) {
        System.out.println("New homeworks from " + homeworkDeque.getStudentName() + "\n" +
                " (total: " + homeworkDeque.getHomeworks().size() + " homeworks from this student)");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
