package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyFacade.class);
    private final CompanyDao companyDao;

    @Autowired
    public CompanyFacade(CompanyDao companyDao) {
        this.companyDao = companyDao;
    }

    public CompanyDao getCompanyDao() {
        return companyDao;
    }

    public List<Company> searchCompanyByNamePart(final String namePart) throws ProcessingException {
        LOGGER.info("Searching for company containing in name \"" + namePart + "\"");
        List<Company> companiesContainingInName = companyDao.retrieveCompanyByPartOfName(namePart);
        if (companiesContainingInName.size() == 0) {
            LOGGER.error(ProcessingException.ERR_NOT_FOUND_IN_DATABASE);
            throw new ProcessingException(ProcessingException.ERR_NOT_FOUND_IN_DATABASE);
        } else {
            LOGGER.info("Returned " + companiesContainingInName.size() + " companies containing \"" +namePart + "\" in name");
            return companiesContainingInName;
        }
    }
}
