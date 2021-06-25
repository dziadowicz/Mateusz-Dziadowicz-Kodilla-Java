package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyFacade.class);
    private final EmployeeDao employeeDao;

    @Autowired
    public EmployeeFacade(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }

    public List<Employee> searchEmployeeByLastnamePart(final String lastnamePart) throws ProcessingException {
        LOGGER.info("Searching for employee containing in lastname \"" + lastnamePart + "\"");
        List<Employee> employeesContainingInLastname = employeeDao.retrieveEmployeesByPartOfLastname("%" + lastnamePart + "%");
        if (employeesContainingInLastname.size() == 0) {
            LOGGER.error(ProcessingException.ERR_NOT_FOUND_IN_DATABASE);
            throw new ProcessingException(ProcessingException.ERR_NOT_FOUND_IN_DATABASE);
        } else {
            LOGGER.info("Returned " + employeesContainingInLastname.size() + " employees containing \"" + lastnamePart + "\" in lastname");
            return employeesContainingInLastname;
        }
    }
}
