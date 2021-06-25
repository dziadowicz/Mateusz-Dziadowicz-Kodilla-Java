package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworDequeTestSuit {

    @Test
    public void testHomeworkUpdate() {
        // Given
        HomeworkDeque student1 = new HomeworkDeque("Student1");
        HomeworkDeque student2 = new HomeworkDeque("Student2");
        HomeworkDeque student3 = new HomeworkDeque("Student3");
        HomeworkDeque student4 = new HomeworkDeque("Student4");
        HomeworkDeque student5 = new HomeworkDeque("Student5");
        Teacher teacher1 = new Teacher("John Smith");
        Teacher teacher2 = new Teacher("Ivone Escobar");
        student1.registerHomeworkObserver(teacher1);
        student2.registerHomeworkObserver(teacher1);
        student3.registerHomeworkObserver(teacher1);
        student4.registerHomeworkObserver(teacher2);
        student5.registerHomeworkObserver(teacher2);
        // When
        student1.addHomework("Homework 1");
        student1.addHomework("Homework 2");
        student1.addHomework("Homework 3");
        student2.addHomework("H1");
        student3.addHomework("H1");
        student3.addHomework("H2");
        student4.addHomework("H1");
        student4.addHomework("H2");
        student4.addHomework("H3");
        student5.addHomework("H4");
        // Then
        assertEquals(6, teacher1.getUpdateCount());
        assertEquals(4, teacher2.getUpdateCount());
    }
}
