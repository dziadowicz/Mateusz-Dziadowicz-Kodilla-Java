package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EmployeeFacadeTestSuite {

    @Autowired
    private EmployeeFacade employeeFacade;

    @Test
    void testRetrieveCompanyWithNameStartingWith() {

        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee bobbySmith = new Employee("Robert", "Smith");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(bobbySmith);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);
        bobbySmith.getCompanies().add(greyMatter);

        employeeFacade.getEmployeeDao().save(johnSmith);
        int johnSmithId = johnSmith.getId();
        employeeFacade.getEmployeeDao().save(stephanieClarckson);
        int stephanieClarcksonId = stephanieClarckson.getId();
        employeeFacade.getEmployeeDao().save(lindaKovalsky);
        int lindaKovalskyId = lindaKovalsky.getId();
        employeeFacade.getEmployeeDao().save(bobbySmith);
        int bobbySmithId = bobbySmith.getId();

        List<Employee> employeesByLastname = new ArrayList<>();

        //When
        try {
            employeesByLastname = employeeFacade.searchEmployeeByLastnamePart("mi");
        } catch (Exception e) {

        }
        //Then
        assertEquals(2, employeesByLastname.size());

        //CleanUp
        try {
            employeeFacade.getEmployeeDao().deleteById(johnSmithId);
            employeeFacade.getEmployeeDao().deleteById(stephanieClarcksonId);
            employeeFacade.getEmployeeDao().deleteById(lindaKovalskyId);
            employeeFacade.getEmployeeDao().deleteById(bobbySmithId);
        } catch (Exception e) {

        }
    }
}
