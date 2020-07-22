package com.zdssm.service;

import com.zdssm.pojo.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {

    int addEmployee(Employee employee);
    int deleteEmployee(int id);
    int updateEmployee(Employee employee);
    Employee queryEmployee(int id);
    List<Employee>queryAllEmployee();
}
