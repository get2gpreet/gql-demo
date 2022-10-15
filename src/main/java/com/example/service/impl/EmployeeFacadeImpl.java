package com.example.service.impl;

import com.example.facade.EmployeeFacade;
import com.example.model.Employee;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeFacadeImpl implements EmployeeService {

    @Autowired
    private EmployeeFacade employeeFacade;

    @Override
    public List<Employee> getEmployee() {
        return employeeFacade.fetchEmployees();
    }
}
