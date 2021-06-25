package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class HomeworkDeque implements HomeworkObservable{

    private final List<HomeworkObserver> homeworkObservers;
    private final Deque<String> homeworks;
    private final String studentName;

    public HomeworkDeque(String student) {
        homeworkObservers = new ArrayList<>();
        homeworks = new ArrayDeque<>();
        this.studentName = student;
    }

    public void addHomework(String homework) {
        homeworks.offer(homework);
        notifyHomeworkObservers();
    }

    @Override
    public void registerHomeworkObserver(HomeworkObserver homeworkObserver) { homeworkObservers.add(homeworkObserver); }

    @Override
    public void notifyHomeworkObservers() {
        for (HomeworkObserver homeworkObserver : homeworkObservers) {
            homeworkObserver.update(this);
        }
    }

    @Override
    public void removeHomeworkObserver(HomeworkObserver homeworkObserver) {  homeworkObservers.remove(homeworkObserver);  }

    public Deque<String> getHomeworks() {
        return homeworks;
    }

    public String getStudentName() {
        return studentName;
    }
}
