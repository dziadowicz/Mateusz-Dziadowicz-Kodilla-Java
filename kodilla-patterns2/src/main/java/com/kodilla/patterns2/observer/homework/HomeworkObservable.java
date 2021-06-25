package com.kodilla.patterns2.observer.homework;

public interface HomeworkObservable {
    void registerHomeworkObserver(HomeworkObserver homeworkObserver);
    void notifyHomeworkObservers();
    void removeHomeworkObserver(HomeworkObserver homeworkObserver);
}
