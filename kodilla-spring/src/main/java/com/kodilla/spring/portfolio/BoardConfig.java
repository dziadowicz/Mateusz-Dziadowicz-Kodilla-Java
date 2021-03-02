package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("getToDoList")
    TaskList toDoList;

    @Autowired
    @Qualifier("getInProgressList")
    TaskList inProgressList;

    @Autowired
    @Qualifier("getDoneList")
    TaskList doneList;

    @Bean
    public Board board() {
        return new Board(getToDoList(), getInProgressList(), getDoneList());
    }

    @Bean(name = "getToDoList")
    public TaskList getToDoList() {
        return new TaskList();
    }

    @Bean(name = "getInProgressList")
    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean(name = "getDoneList")
    public TaskList getDoneList() {
        return new TaskList();
    }


}
