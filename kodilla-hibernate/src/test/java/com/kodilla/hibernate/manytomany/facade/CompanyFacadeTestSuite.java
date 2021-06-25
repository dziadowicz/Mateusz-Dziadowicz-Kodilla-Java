package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CompanyFacadeTestSuite {

    @Autowired
    private CompanyFacade companyFacade;

    @Test
    void testRetrieveCompanyWithNameStartingWith() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");
        Company greyMay = new Company("Grey May");

        companyFacade.getCompanyDao().save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyFacade.getCompanyDao().save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyFacade.getCompanyDao().save(greyMatter);
        int greyMatterId = greyMatter.getId();
        companyFacade.getCompanyDao().save(greyMay);
        int greyMayId = greyMay.getId();

        List<Company> companiesWithNameContaining = new ArrayList<>();

        //When
        try {
            companiesWithNameContaining = companyFacade.searchCompanyByNamePart("Ma");
        } catch (Exception e) {

        }

        //Then
        assertEquals(4, companiesWithNameContaining.size());

        //CleanUp
        try {
            companyFacade.getCompanyDao().deleteById(softwareMachineId);
            companyFacade.getCompanyDao().deleteById(dataMaestersId);
            companyFacade.getCompanyDao().deleteById(greyMatterId);
            companyFacade.getCompanyDao().deleteById(greyMayId);
        } catch (Exception e) {

        }
    }
}
